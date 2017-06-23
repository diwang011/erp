package com.erp.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.axis.utils.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.erp.biz.IFeedBizService;
import com.erp.biz.api.handle.BaseCsvable;
import com.erp.biz.api.handle.ConversionMPItemFeedv3;
import com.erp.biz.api.handle.FeedHandele;
import com.erp.biz.api.handle.ItemHandele;
import com.erp.biz.api.model.mp.MPItemFeed;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.FeedRecord;
import com.erp.biz.api.model.response.FeedRecordResponse;
import com.erp.biz.api.model.response.IngestionError;
import com.erp.biz.api.model.response.PartnerFeedResponse;
import com.erp.biz.api.model.response.PartnerItemIngestionStatus;
import com.erp.biz.impl.conversion.ConversionMPItem;
import com.erp.biz.util.Helper;
import com.erp.db.model.Feed;
import com.erp.db.model.UserInfo;
import com.erp.db.service.IFeedService;
import com.erp.model.FeedDetail;
import com.erp.model.FeedItemDetails;

/**
 * 
 * @author dev003
 *
 */
@Service("IFeedBizService")
@Transactional(rollbackFor = { Exception.class })
public class FeedBizServiceImpl extends BaseBizService implements IFeedBizService
{
    @Resource
    private IFeedService feedService;

    @Override
    public Boolean saveFeed(String feedId, Integer userId) throws Exception
    {
        UserInfo user = getUserById(userId);
        if (user == null)
        {
            return false;
        }
        String consumerId = user.getConsumerId();
        String privateEncodedStr = user.getPrivateKey();
        FeedHandele FeedHandele = new FeedHandele(consumerId, privateEncodedStr);
        FeedRecordResponse res = null;
        try
        {
            res = FeedHandele.getFeedsv3(feedId);
        }
        catch (Exception e)
        {
            try
            {
                res = FeedHandele.getFeedsv3(feedId);
            }
            catch (Exception e1)
            {
                throw e1;

            }
        }
        if (res == null)
        {
            throw new Exception("res  is null");
        }
        for (FeedRecord feed : res.getResults().getFeed())
        {
            Feed oo = null;
            int i = 0;
            feedService.deleteByUserIdAndFeedId(feed.getFeedId(), userId);
            oo = copyBean(feed, userId);
            i = feedService.insert(oo);
            if (i != 1)
            {
                throw new Exception("insert error");
            }
        }
        return true;
    }

    private Feed copyBean(FeedRecord fromBean, Integer userId)
    {
        Feed toBean = new Feed();
        BeanUtils.copyProperties(fromBean, toBean);
        toBean.setUserId(userId);
        toBean.setItemDataErrorCount((int) fromBean.getItemDataErrorCount());
        toBean.setItemsFailed((int) fromBean.getItemsFailed());
        toBean.setItemsProcessing((int) fromBean.getItemsProcessing());
        toBean.setItemsReceived((int) fromBean.getItemsReceived());
        toBean.setItemsSucceeded((int) fromBean.getItemsSucceeded());
        toBean.setItemTimeoutErrorCount((int) fromBean.getItemTimeoutErrorCount());
        toBean.setItemTimeoutErrorCount((int) fromBean.getItemTimeoutErrorCount());
        toBean.setModifiedDtm(Helper.convertToDate(fromBean.getModifiedDtm()));
        toBean.setFeedDate(Helper.convertToDate(fromBean.getFeedDate()));
        return toBean;
    }

    @Override
    public FeedDetail getFeedDetail(String feedId, Integer userId) throws Exception
    {
        UserInfo user = getUserById(userId);
        if (user == null || StringUtils.isEmpty(feedId))
        {
            return null;
        }
        String consumerId = user.getConsumerId();
        String privateEncodedStr = user.getPrivateKey();
        PartnerFeedResponse res = null;
        try
        {
            FeedHandele feedHandele = new FeedHandele(consumerId, privateEncodedStr);
            res = feedHandele.getFeedsv3ByFeedId(feedId);
        }
        catch (Exception e)
        {
            throw e;

        }
        saveFeed(feedId, userId);
        FeedDetail detail = conversionPartnerFeedResponse(res);
        return detail;
    }

    private FeedDetail conversionPartnerFeedResponse(PartnerFeedResponse res)
    {
        FeedDetail detail = new FeedDetail();
        BeanUtils.copyProperties(res, detail);
        detail.setFeedStatus(res.getFeedStatus().name());
        detail.setIngestionError(res.getIngestionErrors().getIngestionError());
        List<PartnerItemIngestionStatus> list = res.getItemDetails().getItemIngestionStatus();
        List<FeedItemDetails> itemDetails = new ArrayList<FeedItemDetails>();
        for (PartnerItemIngestionStatus partnerItemIngestionStatus : list)
        {
            FeedItemDetails item = new FeedItemDetails();
            BeanUtils.copyProperties(partnerItemIngestionStatus, item);
            String ingestionErrors = "";
            List<IngestionError> errorList = partnerItemIngestionStatus.getIngestionErrors().getIngestionError();
            for (IngestionError ingestionError : errorList)
            {
                ingestionErrors += ingestionError.getDescription();
            }
            item.setIngestionErrors(ingestionErrors);
            itemDetails.add(item);
        }
        detail.setItemDetails(itemDetails);
        return detail;
    }

    @Override
    public String uploadItem(MultipartFile multipartFile, Integer userId) throws Exception
    {
        UserInfo user = getUserById(userId);
        if (user == null)
        {
            return null;
        }
        String consumerId = user.getConsumerId();
        String privateEncodedStr = user.getPrivateKey();
        FeedAcknowledgement res = null;
        try
        {
            ItemHandele itemHandele = new ItemHandele(consumerId, privateEncodedStr);
            // List<BaseCsvable> dataList = readXlsContent(multipartFile, BaseCsvable.class);
            // MPItemFeed mpItemFeed = ConversionMPItemFeedv3.bildMPItemFeed(dataList, "ElectronicsAccessories");
            String fileName = multipartFile.getOriginalFilename();
            if (fileName != null)
            {
                fileName = fileName.substring(0, fileName.indexOf("."));
            }
            List<List<Object>> dataList = readXlsmContent(multipartFile);
            MPItemFeed mpItemFeed = ConversionMPItem.bildMPItemFeed(dataList, fileName);

            res = itemHandele.uploadSku(mpItemFeed);
        }
        catch (Exception e)
        {
            throw e;

        }
        String feedId = null;
        if (res != null)
        {
            feedId = res.getFeedId();
            saveFeed(feedId, userId);
        }
        return feedId;
    }

    @Override
    public List<Feed> list(String feedId, Integer offset, Integer userId)
    {
        return feedService.list(feedId, offset, userId);
    }

    @Override
    public Integer count(String feedId, Integer userId)
    {
        return feedService.count(feedId, userId);
    }

}
