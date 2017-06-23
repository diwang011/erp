package com.erp.db.service.impl;

import com.erp.common.Common;
import com.erp.db.mapper.FeedMapper;
import com.erp.db.model.Feed;
import com.erp.db.model.FeedExample;
import com.erp.db.model.FeedExample.Criteria;
import com.erp.db.service.IFeedService;

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
@Service("IFeedService")
@Transactional(rollbackFor = { Exception.class })
public class FeedServiceImpl implements IFeedService
{

    @Resource
    private FeedMapper feedMapper;

    @Override
    public int insert(Feed entity)
    {
        return feedMapper.insert(entity);
    }

    @Override
    public int update(Feed entity)
    {
        return feedMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int delete(Integer id)
    {
        return feedMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Feed queryById(Integer id)
    {
        return feedMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Feed> list(String feedId, Integer offset, Integer userId)
    {
        FeedExample example = new FeedExample();
        Criteria criteria = example.createCriteria();
        if (userId != null)
        {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(feedId))
        {
            criteria.andFeedIdEqualTo(feedId);
        }
        if (offset != null)
        {
            example.setLimit(Common.LIMIT);
            example.setOffset(offset);
        }
        example.setOrderByClause("feedDate desc");
        return feedMapper.selectByExample(example);
    }

    @Override
    public Integer count(String feedId, Integer userId)
    {
        FeedExample example = new FeedExample();
        Criteria criteria = example.createCriteria();
        if (userId != null)
        {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(feedId))
        {
            criteria.andFeedIdEqualTo(feedId);
        }
        return feedMapper.countByExample(example);
    }

    @Override
    public int deleteByUserIdAndFeedId(String feedId, Integer userId)
    {
        FeedExample example = new FeedExample();
        Criteria criteria = example.createCriteria();
        if (userId != null)
        {
            criteria.andUserIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(feedId))
        {
            criteria.andFeedIdEqualTo(feedId);
        }
        return feedMapper.deleteByExample(example);
    }

}
