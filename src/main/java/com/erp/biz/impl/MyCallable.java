package com.erp.biz.impl;

import java.util.concurrent.Callable;

import com.erp.biz.api.handle.InventoryHandele;
import com.erp.biz.api.model.inventory.Inventory;

public class MyCallable implements Callable<Inventory>
{
    private String consumerId;
    private String privateEncodedStr;
    private String sku;

    public MyCallable(String consumerId, String privateEncodedStr, String sku)
    {
        this.consumerId = consumerId;
        this.privateEncodedStr = privateEncodedStr;
        this.sku = sku;
    }

    @Override
    public Inventory call() throws Exception
    {
        InventoryHandele inventoryHandele = new InventoryHandele(consumerId, privateEncodedStr);
        Inventory inv = null;
        try
        {
            inv = inventoryHandele.getInventoryForItem(sku);
        }
        catch (Exception e)
        {
            try
            {
                inv = inventoryHandele.getInventoryForItem(sku);
            }
            catch (Exception e1)
            {

            }

        }
        return inv;
    }

}
