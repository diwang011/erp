package com.erp.db.service;

import com.erp.db.base.IBaseService;
import com.erp.db.model.UserInfo;

public interface IUserInfoService extends IBaseService<UserInfo, Integer>
{
    public String login(UserInfo userInfo) throws Exception;

    public Integer getUserByToken(String token);

    public String register(UserInfo userInfo) throws Exception;
}
