package com.erp.db.service.impl;

import com.erp.db.mapper.OrderItemMapper;
import com.erp.db.model.OrderItem;
import com.erp.db.model.OrderItemExample;
import com.erp.db.model.OrderItemExample.Criteria;
import com.erp.db.service.IOrderItemService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * @author dev003
 *
 */
@Service("IOrderItemService")
@Transactional(rollbackFor = { Exception.class })
public class OrderItemServiceImpl implements IOrderItemService
{

    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public int insert(OrderItem entity)
    {
        return orderItemMapper.insert(entity);
    }

    @Override
    public int update(OrderItem entity)
    {
        return orderItemMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int delete(Integer id)
    {
        return orderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OrderItem queryById(Integer id)
    {
        return orderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OrderItem> listByOrderId(Integer OrderId)
    {
        OrderItemExample example = new OrderItemExample();
        Criteria criteria = example.createCriteria();
        {
            criteria.andOrderIdEqualTo(OrderId);
        }
        return orderItemMapper.selectByExample(example);
    }

}
