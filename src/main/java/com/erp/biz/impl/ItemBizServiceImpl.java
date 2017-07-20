package com.erp.biz.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.erp.biz.IFeedBizService;
import com.erp.biz.IItemBizService;
import com.erp.biz.api.handle.InventoryHandele;
import com.erp.biz.api.handle.ItemHandele;
import com.erp.biz.api.handle.PriceHandele;
import com.erp.biz.api.handle.PromotionHandele;
import com.erp.biz.api.model.inventory.Inventory;
import com.erp.biz.api.model.price.ProcessModeType;
import com.erp.biz.api.model.response.CurrencyCode;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.ItemPriceResponse;
import com.erp.biz.api.model.response.ItemResponse;
import com.erp.biz.api.model.response.ItemRetireResponse;
import com.erp.biz.model.Data;
import com.erp.biz.util.ExcelReportFileReaderWriterUtil;
import com.erp.common.Common;
import com.erp.db.model.Item;
import com.erp.db.model.UserInfo;
import com.erp.db.service.IItemService;
import com.erp.model.InventoryInfo;
import com.erp.model.PriceInfo;
import com.erp.model.Promotional;
import com.github.pagehelper.StringUtil;

/**
 * 
 * @author dev003
 *
 */
@Service("IItemBizService")
@Transactional(rollbackFor = { Exception.class })
public class ItemBizServiceImpl extends BaseBizService implements IItemBizService
{

    @Resource
    private IItemService itemService;
    @Resource
    private IFeedBizService feedBizService;
    @Resource
    private ItemHandele itemHandele;
    @Resource
    private InventoryHandele inventoryHandele;

    @Override
    public Boolean saveItem(String sku, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        List<ItemResponse> res = getItemListByApi(sku, user);

        List<Inventory> invs = getInventoryByTask(user, res);

        List<Item> items = bildItem(user.getId(), invs, res);

        saveData(user, items, sku);
        return true;
    }

    List<ItemResponse> getItemListByApi(String sku, UserInfo user) throws Exception
    {
        int offset = 0;
        List<ItemResponse> res = null;
        try
        {
            res = itemHandele.getItem(sku, offset, user);
        }
        catch (Exception e)
        {
            try
            {
                res = itemHandele.getItem(sku, offset, user);
            }
            catch (Exception e1)
            {
                throw e1;

            }
        }
        if (res == null)
        {
            throw new Exception("res  is null");
        }
        return res;
    }

    private void saveData(UserInfo user, List<Item> items, String sku) throws Exception
    {
        Boolean flag = Boolean.FALSE;
        if (StringUtil.isEmpty(sku))
        {
            itemService.deleteByUserIdAndSku(null, user.getId());
            flag = Boolean.TRUE;
        }
        for (Item it : items)
        {
            if (!flag)
            {
                itemService.deleteByUserIdAndSku(it.getSku(), user.getId());
            }
            int i = itemService.insert(it);
            if (i != 1)
            {
                throw new Exception("insert error");
            }
        }
    }

    private List<Item> bildItem(Integer userId, List<Inventory> invs, List<ItemResponse> res)
    {
        List<Item> items = new ArrayList<Item>();
        for (ItemResponse itemResponse : res)
        {
            Item item = copyBean(itemResponse);
            item.setPrice_amount(itemResponse.getPrice().getAmount().doubleValue());
            item.setCurrency(itemResponse.getPrice().getCurrency().name());
            item.setMart(itemResponse.getMart().name());
            item.setPublishedStatus(itemResponse.getPublishedStatus().name());
            item.setUserId(userId);
            Inventory inv = null;
            for (Inventory inventory : invs)
            {
                if (item.getSku().equals(inventory.getSku()))
                {
                    inv = inventory;
                    break;
                }
            }
            if (inv != null)
            {
                item.setInv_amount(inv.getQuantity().getAmount().intValue());
                item.setFulfillmentLagTime(inv.getFulfillmentLagTime());
                item.setUnit(inv.getQuantity().getUnit().name());
            }
            items.add(item);
        }
        return items;
    }

    public List<Inventory> getInventoryByTask(UserInfo user, List<ItemResponse> res)
    {
        ExecutorService pool = Executors.newFixedThreadPool(res.size());
        List<Future<Inventory>> list = new ArrayList<Future<Inventory>>();
        for (ItemResponse itemResponse : res)
        {
            Callable<Inventory> c = new MyCallable(user, inventoryHandele, itemResponse.getSku());
            Future<Inventory> f = pool.submit(c);
            list.add(f);

        }
        pool.shutdown();
        List<Inventory> invList = new ArrayList<Inventory>();
        for (Future<Inventory> f : list)
        {
            try
            {
                Inventory inv = f.get();
                if (inv != null)
                {
                    invList.add(inv);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return invList;

    }

    private Item copyBean(ItemResponse fromBean)
    {
        Item toBean = new Item();
        BeanUtils.copyProperties(fromBean, toBean);
        return toBean;
    }

    @Resource
    private PriceHandele priceHandele;

    @Override
    public Boolean updatePrice(Item item, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        ItemPriceResponse res = null;
        res = priceHandele.updatePrice(item.getSku(), CurrencyCode.USD.name(), item.getPrice_amount() + "", user);
        if (res == null)
        {
            return false;
        }
        return

        saveItem(item.getSku(), user);
    }

    @Override
    public Boolean updateInventory(Item item, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        Inventory res = null;
        res = inventoryHandele.updateInventoryForItem(item.getSku(), item.getInv_amount() + "",
                item.getFulfillmentLagTime(), user);
        if (res == null)
        {
            return false;
        }
        return saveItem(item.getSku(), user);
    }

    @Resource
    private PromotionHandele promotionHandele;

    @Override
    public Promotional getPromotion(String sku, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return null;
        }
        Promotional res = null;
        res = promotionHandele.getPromotionalPrices(sku, user);
        return res;
    }

    @Override
    public Boolean addPromotion(Promotional promotional, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        ItemPriceResponse res = null;
        res = promotionHandele.updatePromotionalPrice(promotional, ProcessModeType.UPSERT, user);
        if (res == null)
        {
            return false;
        }
        return true;
    }

    @Override
    public Boolean bulkAddPromotion(MultipartFile multipartFile, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        FeedAcknowledgement res = null;
        List<Promotional> promotionals = readXlsContent(multipartFile, Promotional.class);
        // for (Promotional promotional : promotionals)
        // {
        // addPromotion(promotional, user);
        // }
        res = promotionHandele.bulkUpdatePromotionalPrice(promotionals, user);
        if (res == null)
        {
            return false;
        }
        return true;
    }

    @Override
    public Boolean deletePromotion(String sku, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        ItemPriceResponse res = null;
        Promotional promotional = getPromotion(sku, user);
        res = promotionHandele.updatePromotionalPrice(promotional, ProcessModeType.DELETE, user);
        if (res == null)
        {
            return false;
        }
        return true;
    }

    @Override
    public String updateBulkInventory(MultipartFile multipartFile, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return null;
        }
        FeedAcknowledgement res = null;
        List<InventoryInfo> dataList = readXlsContent(multipartFile, InventoryInfo.class);
        List<Data> list = new ArrayList<Data>();
        for (InventoryInfo inv : dataList)
        {
            Data data = new Data(inv.getSku(), inv.getAmount(), inv.getFulfillmentLagTime());
            list.add(data);
        }
        res = inventoryHandele.bulkUpdateInventory(list, user);
        String feedId = null;
        if (res != null)
        {
            feedId = res.getFeedId();
            feedBizService.saveFeed(feedId, user);
        }
        return feedId;
    }

    @Override
    public String updateBulkPrice(MultipartFile multipartFile, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return null;
        }
        FeedAcknowledgement res = null;
        List<PriceInfo> dataList = readXlsContent(multipartFile, PriceInfo.class);
        List<Data> list = new ArrayList<Data>();
        for (PriceInfo p : dataList)
        {
            Data data = new Data(p.getSku(), p.getAmount(), p.getCurrency());
            list.add(data);
        }
        res = priceHandele.updateBulkPrices(list, user);
        String feedId = null;
        if (res != null)
        {
            feedId = res.getFeedId();
            feedBizService.saveFeed(feedId, user);
        }
        return feedId;
    }

    @Override
    public List<Item> list(String sku, Integer offset, UserInfo user)
    {
        List<Item> list = itemService.list(sku, offset, user.getId());
        return list;
    }

    @Override
    public String exportPrice(String sku, UserInfo user)
    {
        List<PriceInfo> list = new ArrayList<PriceInfo>();
        List<Item> items = list(sku, null, user);
        for (Item item : items)
        {
            PriceInfo p = new PriceInfo();
            p.setSku(item.getSku());
            p.setCurrency(item.getCurrency());
            p.setAmount(item.getPrice_amount() + "");
            list.add(p);
        }
        SimpleDateFormat dateTimeFormatForFileName = new SimpleDateFormat("yyyyMMddHHmmss");
        String fileName = "Price" + dateTimeFormatForFileName.format(new Date()) + ".xls";
        String filePath = Common.DOWNLOAD_PATH + fileName;
        File files = new File(Common.DOWNLOAD_PATH);
        if (!files.exists())
        {
            files.mkdirs();
        }
        new ExcelReportFileReaderWriterUtil<PriceInfo>().writeReportFile(list, filePath);
        return fileName;
    }

    @Override
    public String exportInventory(String sku, UserInfo user)
    {
        List<InventoryInfo> list = new ArrayList<InventoryInfo>();
        List<Item> items = list(sku, null, user);
        for (Item item : items)
        {
            InventoryInfo inv = new InventoryInfo();
            inv.setSku(item.getSku());
            inv.setFulfillmentLagTime(item.getFulfillmentLagTime());
            ;
            inv.setAmount(item.getInv_amount() + "");
            list.add(inv);
        }
        SimpleDateFormat dateTimeFormatForFileName = new SimpleDateFormat("yyyyMMddHHmmss");
        String fileName = "Inventory" + dateTimeFormatForFileName.format(new Date()) + ".xls";
        String filePath = Common.DOWNLOAD_PATH + fileName;
        File files = new File(Common.DOWNLOAD_PATH);
        if (!files.exists())
        {
            files.mkdirs();
        }
        new ExcelReportFileReaderWriterUtil<InventoryInfo>().writeReportFile(list, filePath);
        return fileName;
    }

    @Override
    public Integer count(String sku, UserInfo user)
    {
        return itemService.count(sku, user.getId());
    }

    @Override
    public Boolean retireItem(String sku, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        ItemRetireResponse res = null;
        res = itemHandele.retireItem(sku, user);
        if (res == null)
        {
            return false;
        }
        else
        {
            saveItem(sku, user);
        }
        return true;
    }

}
