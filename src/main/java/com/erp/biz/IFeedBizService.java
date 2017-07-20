package com.erp.biz;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.erp.db.model.Feed;
import com.erp.db.model.UserInfo;
import com.erp.model.FeedDetail;

/***
 * 
 * @author dev003
 *
 */
public interface IFeedBizService
{
    public static final String SERVICE_NAME = "IFeedBizService";

    public Boolean saveFeed(String feedId, UserInfo user) throws Exception;

    public FeedDetail getFeedDetail(String feedId, UserInfo user) throws Exception;

    public String uploadItem(MultipartFile file, UserInfo user) throws Exception;

    public List<Feed> list(String feedId, Integer offset, UserInfo user);

    public Integer count(String feedId, UserInfo user);

}
