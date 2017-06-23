package com.erp.biz;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.erp.db.model.Feed;
import com.erp.model.FeedDetail;

/***
 * 
 * @author dev003
 *
 */
public interface IFeedBizService
{
    public static final String SERVICE_NAME = "IFeedBizService";

    public Boolean saveFeed(String feedId, Integer userId) throws Exception;

    public FeedDetail getFeedDetail(String feedId, Integer userId) throws Exception;

    public String uploadItem(MultipartFile file, Integer userId) throws Exception;

    public List<Feed> list(String feedId, Integer offset, Integer userId);

    public Integer count(String feedId, Integer userId);

}
