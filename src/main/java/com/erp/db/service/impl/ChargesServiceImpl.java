package com.erp.db.service.impl;

import com.erp.db.mapper.ChargesMapper;
import com.erp.db.model.Charges;
import com.erp.db.model.ChargesExample;
import com.erp.db.model.ChargesExample.Criteria;
import com.erp.db.service.IChargesService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;

/**
 * 
 * @author dev003
 *
 */
@Service("IChargesService")
@Transactional(rollbackFor = { Exception.class })
public class ChargesServiceImpl implements IChargesService
{

    @Resource
    private ChargesMapper chargesMapper;

    @Override
    public int insert(Charges entity)
    {
        return chargesMapper.insert(entity);
    }

    @Override
    public int update(Charges entity)
    {
        return chargesMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int delete(Integer id)
    {
        return chargesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Charges queryById(Integer id)
    {
        return chargesMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Charges> listByOrderItemId(Integer orderItemId)
    {
        ChargesExample example = new ChargesExample();
        Criteria criteria = example.createCriteria();
        if (orderItemId != null)
        {
            criteria.andOrderItemIdEqualTo(orderItemId);
        }
        return chargesMapper.selectByExample(example);
    }

    @Override
    public int deleteByOrderItemId(Integer orderItemId, String type)
    {
        ChargesExample example = new ChargesExample();
        Criteria criteria = example.createCriteria();
        if (orderItemId != null)
        {
            criteria.andOrderItemIdEqualTo(orderItemId);
        }
        if (type != null)
        {
            criteria.andChargeCategoryEqualTo(type);
        }
        return chargesMapper.deleteByExample(example);
    }
}
