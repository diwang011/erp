package com.erp.db.service.impl;

import com.erp.common.Common;
import com.erp.db.mapper.ItemMapper;
import com.erp.db.model.Item;
import com.erp.db.model.ItemExample;
import com.erp.db.model.ItemExample.Criteria;
import com.erp.db.service.IItemService;

import org.apache.axis.utils.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * @author dev003
 *
 */
@Service("IItemService")
@Transactional(rollbackFor = { Exception.class })
public class ItemServiceImpl implements IItemService
{

    @Resource
    private ItemMapper itemMapper;

    @Override
    public int insert(Item entity)
    {
        return itemMapper.insert(entity);
    }

    @Override
    public int update(Item entity)
    {
        return itemMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int delete(Integer id)
    {
        return itemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Item queryById(Integer id)
    {
        return itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Item> list(String sku, Integer offset, Integer userId)
    {
        ItemExample example = new ItemExample();
        Criteria criteria = example.createCriteria();
        if (userId != null)
        {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(sku))
        {
            criteria.andSkuEqualTo(sku);
        }
        if (offset != null)
        {
            example.setLimit(Common.LIMIT);
            example.setOffset(offset);
        }
        example.setOrderByClause("sku");
        return itemMapper.selectByExample(example);
    }

    @Override
    public int deleteByUserIdAndSku(String sku, Integer userId)
    {
        ItemExample example = new ItemExample();
        Criteria criteria = example.createCriteria();
        if (userId != null)
        {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(sku))
        {
            criteria.andSkuEqualTo(sku);
        }
        return itemMapper.deleteByExample(example);
    }

    @Override
    public Integer count(String sku, Integer userId)
    {
        ItemExample example = new ItemExample();
        Criteria criteria = example.createCriteria();
        if (userId != null)
        {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(sku))
        {
            criteria.andSkuEqualTo(sku);
        }
        return itemMapper.countByExample(example);
    }

}
