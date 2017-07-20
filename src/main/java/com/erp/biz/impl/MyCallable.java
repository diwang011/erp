package com.erp.biz.impl;

import java.util.concurrent.Callable;

import com.erp.biz.api.handle.InventoryHandele;
import com.erp.biz.api.model.inventory.Inventory;
import com.erp.db.model.UserInfo;

public class MyCallable implements Callable<Inventory>
{
    private UserInfo user;
    private InventoryHandele inventoryHandele;
    private String sku;

    public MyCallable(UserInfo user, InventoryHandele inventoryHandele, String sku)
    {
        this.user = user;
        this.inventoryHandele = inventoryHandele;
        this.sku = sku;
    }

    @Override
    public Inventory call() throws Exception
    {
        Inventory inv = null;
        try
        {
            inv = inventoryHandele.getInventoryForItem(sku, user);
        }
        catch (Exception e)
        {
            inv = inventoryHandele.getInventoryForItem(sku, user);
        }
        return inv;
    }

}
