package com.erp.db.service.impl;

import com.erp.biz.api.handle.FeedHandele;
import com.erp.biz.api.model.response.FeedRecordResponse;
import com.erp.db.mapper.UserInfoMapper;
import com.erp.db.model.UserInfo;
import com.erp.db.model.UserInfoExample;
import com.erp.db.model.UserInfoExample.Criteria;
import com.erp.db.service.IUserInfoService;

import org.apache.axis.utils.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

/**
 * 
 * @author dev003
 *
 */
@Service("IUserInfoService")
@Transactional(rollbackFor = { Exception.class })
public class UserInfoServiceImpl implements IUserInfoService
{
    private Map<String, Integer> userMap;
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public int insert(UserInfo entity)
    {
        return userInfoMapper.insert(entity);
    }

    @Override
    public int update(UserInfo entity)
    {
        return userInfoMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int delete(Integer id)
    {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public UserInfo queryById(Integer id)
    {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public String login(UserInfo userInfo) throws Exception
    {
        String token = null;
        if (userInfo == null || StringUtils.isEmpty(userInfo.getUsername())
                || StringUtils.isEmpty(userInfo.getPassword()))
        {
            return token;
        }
        UserInfoExample example = new UserInfoExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(userInfo.getUsername());
        criteria.andPasswordEqualTo(userInfo.getPassword());
        List<UserInfo> users = userInfoMapper.selectByExample(example);
        if (users.size() > 0)
        {
            userMap = new HashMap<String, Integer>();
            UserInfo u = users.get(0);
            token = UUID.randomUUID().toString().replaceAll("-", "");
            for (Entry<String, Integer> map : userMap.entrySet())
            {
                Integer id = map.getValue();
                String key = map.getKey();
                if (id == u.getId())
                {
                    userMap.remove(key);
                }
            }
            userMap.put(token, u.getId());
        }
        return token;
    }

    @Override
    public Integer getUserByToken(String token)
    {
        if (userMap == null)
        {
            return null;
        }
        return userMap.get(token);
    }

    @Override
    public String register(UserInfo user) throws Exception
    {
        String consumerId = user.getConsumerId();
        String privateEncodedStr = user.getPrivateKey();
        FeedHandele FeedHandele = new FeedHandele(consumerId, privateEncodedStr);
        FeedRecordResponse res = null;
        try
        {
            res = FeedHandele.getFeedsv3(null);
        }
        catch (Exception e1)
        {
            throw e1;
        }
        int i = userInfoMapper.insert(user);
        if (i != 1)
        {
            return null;
        }
        return login(user);
    }
}
