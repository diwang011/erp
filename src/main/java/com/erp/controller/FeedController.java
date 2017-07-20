package com.erp.controller;

import com.erp.biz.IFeedBizService;
import com.erp.db.model.Feed;
import com.erp.db.model.UserInfo;
import com.erp.model.FeedDetail;

import org.apache.axis.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * 
 * @author dev003
 *
 */
@Controller
@RequestMapping("/feed")
public class FeedController extends BaseController
{
    private static final Logger LOGGER = LogManager.getLogger(FeedController.class);

    @Resource
    private IFeedBizService feedBizService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<List<Feed>> search(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("Feed search start");
        BaseResponse<List<Feed>> response = new BaseResponse<List<Feed>>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            List<Feed> res = null;
            Integer total = null;
            try
            {
                String feedId = request.getData();
                Integer offset = request.getOffset();
                total = feedBizService.count(feedId, user);
                res = feedBizService.list(feedId, offset, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("Get Feed info error," + e.getMessage());
            }
            response.setTotal(total);
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("Feed search end");
        return response;
    }

    @RequestMapping(value = "/updateFeed", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> updateFeed(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("Feed updateFeed start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean res = Boolean.FALSE;
            String feedId = null;
            try
            {
                String data = request.getData();
                if (!StringUtils.isEmpty(data))
                {
                    feedId = data;
                }
                res = feedBizService.saveFeed(feedId, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("update Feed info error," + e.getMessage());
            }
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("Feed updateFeed end");
        return response;
    }

    @RequestMapping(value = "/getFeedDetail", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<FeedDetail> cancelFeed(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("Feed getFeedDetail start");
        BaseResponse<FeedDetail> response = new BaseResponse<FeedDetail>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            FeedDetail res = null;
            try
            {
                String feedId = request.getData();
                res = feedBizService.getFeedDetail(feedId, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("Get Feed Detail error," + e.getMessage());
            }
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("Feed getFeedDetail end");
        return response;
    }

    @RequestMapping(value = "/uploadItem", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<String> uploadItem(HttpServletRequest request,
            @RequestParam("file") MultipartFile file, @RequestParam("token") String token)
    {
        LOGGER.info("Feed uploadItem start");
        BaseResponse<String> response = new BaseResponse<String>();
        UserInfo user = getUserByToken(token);
        if (user != null)
        {
            String res = null;
            try
            {
                res = feedBizService.uploadItem(file, user);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("upload Item error," + e.getMessage());
            }
            response.setData(res);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("Feed uploadItem end");
        return response;
    }
}