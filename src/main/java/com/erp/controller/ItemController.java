package com.erp.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.erp.biz.IItemBizService;
import com.erp.common.Common;
import com.erp.db.model.Item;
import com.erp.db.model.UserInfo;
import com.erp.model.Promotional;
import com.erp.view.model.ViewItem;

/**
 * 
 * @author dev003
 *
 */
@Controller
@RequestMapping("/item")
public class ItemController extends BaseController
{
    private static final Logger LOGGER = LogManager.getLogger(ItemController.class);

    @Resource
    private IItemBizService itemBizService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<List<ViewItem>> search(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("item search start");
        BaseResponse<List<ViewItem>> response = new BaseResponse<List<ViewItem>>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            List<Item> item = null;
            List<ViewItem> viewItems = new ArrayList<>();
            Integer total = null;
            try
            {
                String sku = request.getData();
                Integer offset = request.getOffset();
                total = itemBizService.count(sku, user);
                item = itemBizService.list(sku, offset, user);
                for (Item item2 : item)
                {
                    ViewItem viewItem = new ViewItem();
                    BeanUtils.copyProperties(item2, viewItem);
                    viewItem.setPrice_currency(item2.getPrice_amount() == null ? ""
                            : (item2.getPrice_amount() + " (" + item2.getCurrency() + ")"));
                    viewItem.setInv_amount_unit(item2.getInv_amount() == null ? ""
                            : (item2.getInv_amount() + " (" + item2.getUnit() + ")"));
                    viewItems.add(viewItem);
                }
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("Get product info error," + e.getMessage());
            }
            response.setTotal(total);
            response.setData(viewItems);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item search end");
        return response;
    }

    @RequestMapping(value = "/updateItem", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> updateItem(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("item updateItem start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean item = Boolean.FALSE;
            String sku = null;
            try
            {
                String data = request.getData();
                if (!StringUtils.isEmpty(data))
                {
                    sku = data;
                }
                item = itemBizService.saveItem(sku, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("No product info," + e.getMessage());
            }
            response.setData(item);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item updateItem end");
        return response;
    }

    @RequestMapping(value = "/retireItem", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> retireItem(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("item retireItem start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean item = Boolean.FALSE;
            try
            {
                String sku = request.getData();
                item = itemBizService.retireItem(sku, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("retire product info error," + e.getMessage());
            }
            response.setData(item);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item retireItem end");
        return response;
    }

    @RequestMapping(value = "/updatePrice", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> updatePrice(@RequestBody BaseRequest<Item> request)
    {
        LOGGER.info("item updatePrice start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                Item item = request.getData();
                it = itemBizService.updatePrice(item, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("update Price error," + e.getMessage());
            }
            response.setData(it);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item updatePrice end");
        return response;
    }

    @RequestMapping(value = "/updateInventory", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> updateInventory(@RequestBody BaseRequest<Item> request)
    {
        LOGGER.info("item updateInventory start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                Item item = request.getData();
                it = itemBizService.updateInventory(item, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("update inventory error," + e.getMessage());
            }
            response.setData(it);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item updateInventory end");
        return response;
    }

    @RequestMapping(value = "/addPromotion", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> addPromotion(@RequestBody BaseRequest<Promotional> request)
    {
        LOGGER.info("item addPromotion start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                Promotional promotional = request.getData();
                it = itemBizService.addPromotion(promotional, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("add Promotion error," + e.getMessage());
            }
            response.setData(it);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item addPromotion end");
        return response;
    }

    @RequestMapping(value = "/bulkAddPromotion", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> bulkAddPromotion(HttpServletRequest request,
            @RequestParam("file") MultipartFile file, @RequestParam("token") String token)
    {
        LOGGER.info("item bulkAddPromotion start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(token);
        if (user != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                it = itemBizService.bulkAddPromotion(file, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("add bulkAddPromotion error," + e.getMessage());
            }
            response.setData(it);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item bulkAddPromotion end");
        return response;
    }

    @RequestMapping(value = "/deletePromotion", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> deletePromotion(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("item deletePromotion start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                String sku = request.getData();
                it = itemBizService.deletePromotion(sku, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("Cancel Promotion error," + e.getMessage());
            }
            response.setData(it);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item deletePromotion end");
        return response;
    }

    @RequestMapping(value = "/getPromotion", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Promotional> getPromotion(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("item getPromotion start");
        BaseResponse<Promotional> response = new BaseResponse<Promotional>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Promotional res = null;
            try
            {
                String sku = request.getData();
                res = itemBizService.getPromotion(sku, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("Promotion is null");
            }
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item getPromotion end");
        return response;
    }

    @RequestMapping(value = "/updateBulkPrice", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<String> updateBulkPrice(HttpServletRequest request,
            @RequestParam("file") MultipartFile file, @RequestParam("token") String token)
    {
        LOGGER.info("item updateBulkPrice start");
        BaseResponse<String> response = new BaseResponse<String>();
        UserInfo user = getUserByToken(token);
        if (user != null)
        {
            String res = null;
            try
            {
                res = itemBizService.updateBulkPrice(file, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("update Bulk Price error");
            }
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item updateBulkPrice end");
        return response;
    }

    @RequestMapping(value = "/updateBulkInventory", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<String> updateBulkInventory(HttpServletRequest request,
            @RequestParam("file") MultipartFile file, @RequestParam("token") String token)
    {
        LOGGER.info("item updateInventory start");
        BaseResponse<String> response = new BaseResponse<String>();
        UserInfo user = getUserByToken(token);
        if (user != null)
        {
            String res = null;
            try
            {
                res = itemBizService.updateBulkInventory(file, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("update Bulk inventory error");
            }
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item updateBulkInventory end");
        return response;
    }

    @RequestMapping(value = "/exportPrice", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<String> exportPrice(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("item exportPrice start");
        BaseResponse<String> response = new BaseResponse<String>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            String res = null;
            try
            {
                String sku = request.getData();
                res = itemBizService.exportPrice(sku, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("export Price info error");
            }
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item exportPrice end");
        return response;
    }

    @RequestMapping(value = "/exportInventory", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<String> exportInventory(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("item exportInventory start");
        BaseResponse<String> response = new BaseResponse<String>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            String res = null;
            try
            {
                String sku = request.getData();
                res = itemBizService.exportInventory(sku, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("export Inventory info error");
            }
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("item exportInventory end");
        return response;
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public Void download(HttpServletResponse resp, String downloadId)
    {
        LOGGER.info("item download");
        File files = new File(Common.DOWNLOAD_PATH);
        if (!files.exists())
        {
            files.mkdirs();
        }
        sendCsvFileToPage(Common.DOWNLOAD_PATH, downloadId, resp);
        LOGGER.info("item download");
        return null;
    }
}