package com.erp.controller;

import com.erp.db.model.UserInfo;
import com.erp.db.service.IUserInfoService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 
 * @author dev003
 *
 */
@Controller
@RequestMapping("/walmartapp")
public class LoginController extends BaseController
{
    private static final Logger LOGGER = LogManager.getLogger(LoginController.class);

    @Resource
    private IUserInfoService userInfoService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<String> login(@RequestBody BaseRequest<UserInfo> request)
    {
        LOGGER.info("login start");
        BaseResponse<String> response = new BaseResponse<String>();
        String token = null;
        try
        {
            UserInfo userInfo = request.getData();
            if (userInfo == null)
            {
                response.setError("Parameter error!");
            }
            token = userInfoService.login(userInfo);
        }
        catch (Exception e)
        {
            LOGGER.error(e);
            response.setError("login error");
        }
        if (token == null)
        {
            LOGGER.error("token is null");
            response.setError("login error");
        }
        response.setData(token);
        LOGGER.info("login end");
        return response;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<String> register(@RequestBody BaseRequest<UserInfo> request)
    {
        LOGGER.info("register start");
        BaseResponse<String> response = new BaseResponse<String>();
        String res = null;
        try
        {
            UserInfo userInfo = request.getData();
            if (userInfo == null)
            {
                response.setError("Parameter error!");
            }
            res = userInfoService.register(userInfo);
        }
        catch (Exception e)
        {
            LOGGER.error(e);
            response.setError("register error," + e.getMessage());
        }
        response.setData(res);
        LOGGER.info("register end");
        return response;
    }

}