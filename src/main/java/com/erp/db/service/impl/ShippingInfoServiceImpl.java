package com.erp.db.service.impl;

import com.erp.db.mapper.ShippingInfoMapper;
import com.erp.db.model.ShippingInfo;
import com.erp.db.model.ShippingInfoExample;
import com.erp.db.model.ShippingInfoExample.Criteria;
import com.erp.db.service.IShippingInfoService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;

/**
 * 
 * @author dev003
 *
 */
@Service("IShippingInfoService")
@Transactional(rollbackFor = { Exception.class })
public class ShippingInfoServiceImpl implements IShippingInfoService
{

    @Resource
    private ShippingInfoMapper shippingInfoMapper;

    @Override
    public int insert(ShippingInfo entity)
    {
        return shippingInfoMapper.insert(entity);
    }

    @Override
    public int update(ShippingInfo entity)
    {
        return shippingInfoMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int delete(Integer id)
    {
        return shippingInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ShippingInfo queryById(Integer id)
    {
        return shippingInfoMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<ShippingInfo> listByOrderId(Integer orderId)
    {
        ShippingInfoExample example = new ShippingInfoExample();
        Criteria criteria = example.createCriteria();
        if (orderId != null)
        {
            criteria.andOrderIdEqualTo(orderId);
        }
        return shippingInfoMapper.selectByExample(example);
    }
}
