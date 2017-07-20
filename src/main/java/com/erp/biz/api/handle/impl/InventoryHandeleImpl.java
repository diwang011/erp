package com.erp.biz.api.handle.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.erp.biz.api.handle.InventoryHandele;
import com.erp.biz.api.model.inventory.Inventory;
import com.erp.biz.api.model.inventory.InventoryFeed;
import com.erp.biz.api.model.inventory.InventoryHeader;
import com.erp.biz.api.model.inventory.Quantity;
import com.erp.biz.api.model.inventory.UnitOfMeasurement;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.model.Data;
import com.erp.biz.util.Helper;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.HttpMethod;
import com.erp.db.model.UserInfo;

@Service
public class InventoryHandeleImpl extends BaseHandele implements InventoryHandele
{
    /**
     * 根据sku获取库存信息
     * 
     * @param sku
     * @return
     * @throws Exception
     */
    @Override
    public Inventory getInventoryForItem(String sku, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v2/inventory?sku=" + Helper.urlEscapeProcessing(sku);
        HttpMethod httpMethod = HttpMethod.GET;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        String requestBoby = null;

        Inventory i = null;
        try
        {
            String xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            i = JAXBUtil.converyToJavaBean(xml, Inventory.class);
        }
        catch (Exception e)
        {
            // 先不处理了
            // throwError(xml);
        }
        return i;

    }

    /**
     * 单个更新库存
     * 
     * @param sku
     * @param amount
     * @param fulfillmentLagTime
     * @return
     * @throws Exception
     */
    @Override
    public Inventory updateInventoryForItem(String sku, String amount, int fulfillmentLagTime, UserInfo user)
            throws Exception
    {
        String finalUrl = baseUrl + "v2/inventory?sku=" + Helper.urlEscapeProcessing(sku);
        HttpMethod httpMethod = HttpMethod.PUT;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        Inventory i = null;
        String xml = null;
        try
        {
            Inventory inventory = bildInventory(sku, amount, fulfillmentLagTime);
            String requestBoby = JAXBUtil.convertToXml(inventory);
            requestBoby = requestBoby.replace("<", "<wm:").replace("<wm:/", "</wm:").replace("<wm:?", "<?")
                    .replace("xmlns", "xmlns:wm");
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            i = JAXBUtil.converyToJavaBean(xml, Inventory.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return i;

    }

    /**
     * 批量更新库存
     * 
     * @param list
     * @return
     * @throws Exception
     */
    @Override
    public FeedAcknowledgement bulkUpdateInventory(List<Data> list, UserInfo user) throws Exception
    {

        String finalUrl = baseUrl + "v2/feeds?feedType=inventory";
        HttpMethod httpMethod = HttpMethod.POST;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), true);
        FeedAcknowledgement acknowledgement = null;
        String xml = null;
        try
        {
            InventoryFeed inventoryFeed = bildInventoryFeed(list);
            String requestBoby = JAXBUtil.convertToXml(inventoryFeed);
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            acknowledgement = JAXBUtil.converyToJavaBean(xml, FeedAcknowledgement.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return acknowledgement;

    }

    private static InventoryFeed bildInventoryFeed(List<Data> list)
    {
        InventoryFeed inventoryFeed = new InventoryFeed();
        InventoryHeader inventoryHeader = new InventoryHeader();
        inventoryHeader.setVersion("1.4");
        inventoryFeed.setInventoryHeader(inventoryHeader);
        for (Data data : list)
        {
            inventoryFeed.getInventory()
                    .add(bildInventory(data.getSku(), data.getAmount(), data.getFulfillmentLagTime()));
        }
        return inventoryFeed;
    }

    private static Inventory bildInventory(String sku, String amount, int fulfillmentLagTime)
    {
        Inventory inventory = new Inventory();
        inventory.setSku(sku);
        Quantity quantity = new Quantity();
        quantity.setAmount(new BigDecimal(amount));
        quantity.setUnit(UnitOfMeasurement.EACH);
        inventory.setQuantity(quantity);
        inventory.setFulfillmentLagTime(fulfillmentLagTime);
        return inventory;
    }
}
