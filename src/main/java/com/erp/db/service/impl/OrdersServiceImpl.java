package com.erp.db.service.impl;

import com.erp.common.Common;
import com.erp.db.mapper.OrdersMapper;
import com.erp.db.model.Orders;
import com.erp.db.model.OrdersExample;
import com.erp.db.model.OrdersExample.Criteria;
import com.erp.db.service.IOrdersService;

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
@Service("IOrdersService")
@Transactional(rollbackFor = { Exception.class })
public class OrdersServiceImpl implements IOrdersService
{

    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public int insert(Orders entity)
    {
        return ordersMapper.insert(entity);
    }

    @Override
    public int update(Orders entity)
    {
        return ordersMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int delete(Integer id)
    {
        return ordersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Orders queryById(Integer id)
    {
        return ordersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Orders> listByPoId(String purchaseOrderId, Integer offset, Integer userId)
    {
        OrdersExample example = new OrdersExample();
        Criteria criteria = example.createCriteria();
        if (userId != null)
        {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(purchaseOrderId))
        {
            criteria.andPurchaseOrderIdEqualTo(purchaseOrderId);
        }
        if (offset != null)
        {
            example.setLimit(Common.LIMIT);
            example.setOffset(offset);
        }
        example.setOrderByClause("orderDate desc");
        return ordersMapper.selectByExample(example);
    }

    @Override
    public int deleteByUserId(Integer userId)
    {
        OrdersExample example = null;
        if (userId != null)
        {
            example = new OrdersExample();
            Criteria criteria = example.createCriteria();
            criteria.andUserIdEqualTo(userId);
        }
        return ordersMapper.deleteByExample(example);
    }

    @Override
    public Integer count(String purchaseOrderId, Integer userId)
    {
        OrdersExample example = new OrdersExample();
        Criteria criteria = example.createCriteria();
        if (userId != null)
        {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(purchaseOrderId))
        {
            criteria.andPurchaseOrderIdEqualTo(purchaseOrderId);
        }
        return ordersMapper.countByExample(example);
    }

}
