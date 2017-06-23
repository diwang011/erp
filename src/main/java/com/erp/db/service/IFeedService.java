package com.erp.db.service;

import com.erp.db.base.IBaseService;
import com.erp.db.model.Feed;

import java.util.List;

/***
 * 
 * @author dev003
 *
 */
public interface IFeedService extends IBaseService<Feed, Integer>
{
    public static final String SERVICE_NAME = "IOrderService";

    public List<Feed> list(String feedId, Integer offset, Integer userId);

    public Integer count(String feedId, Integer userId);

    public int deleteByUserIdAndFeedId(String feedId, Integer userId);

}
