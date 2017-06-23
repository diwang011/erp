package com.erp.biz.api.handle;

import java.math.BigDecimal;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.erp.biz.api.model.inventory.Inventory;
import com.erp.biz.api.model.inventory.InventoryFeed;
import com.erp.biz.api.model.inventory.InventoryHeader;
import com.erp.biz.api.model.inventory.Quantity;
import com.erp.biz.api.model.inventory.UnitOfMeasurement;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.model.Data;
import com.erp.biz.util.Helper;
import com.erp.biz.util.HttpClientHelper;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.Common;
import com.erp.controller.ItemController;

public class InventoryHandele extends BaseHandele
{
    private static final Logger LOGGER = LogManager.getLogger(ItemController.class);

    public InventoryHandele(String consumerId, String privateEncodedStr)
    {
        super(consumerId, privateEncodedStr);
    }

    /**
     * 根据sku获取库存信息
     * 
     * @param sku
     * @return
     * @throws Exception
     */
    public Inventory getInventoryForItem(String sku) throws Exception
    {
        String finalUrl = baseUrl + "v2/inventory?sku=" + Helper.urlEscapeProcessing(sku);
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.GET);

        Inventory i = null;
        try
        {
            LOGGER.info(finalUrl);
            String xml = httpClient.doHttpGet(finalUrl);
            LOGGER.info(xml);
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
    public Inventory updateInventoryForItem(String sku, String amount, int fulfillmentLagTime) throws Exception
    {
        String finalUrl = baseUrl + "v2/inventory?sku=" + Helper.urlEscapeProcessing(sku);
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.PUT);
        Inventory i = null;
        String xml = null;
        try
        {
            LOGGER.info(finalUrl);
            Inventory inventory = bildInventory(sku, amount, fulfillmentLagTime);
            String requestBoby = JAXBUtil.convertToXml(inventory);
            requestBoby = requestBoby.replace("<", "<wm:").replace("<wm:/", "</wm:").replace("<wm:?", "<?")
                    .replace("xmlns", "xmlns:wm");
            LOGGER.info(requestBoby);
            xml = httpClient.doHttpPut(finalUrl, requestBoby);
            LOGGER.info(xml);
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
    public FeedAcknowledgement bulkUpdateInventory(List<Data> list) throws Exception
    {

        String finalUrl = baseUrl + "v2/feeds?feedType=inventory";
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.POST);
        FeedAcknowledgement acknowledgement = null;
        String xml = null;
        try
        {
            LOGGER.info(finalUrl);
            InventoryFeed inventoryFeed = bildInventoryFeed(list);
            String requestBoby = JAXBUtil.convertToXml(inventoryFeed);
            LOGGER.info(requestBoby);
            xml = httpClient.doHttpPostMultipart(finalUrl, requestBoby);
            LOGGER.info(xml);
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
