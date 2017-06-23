package com.erp.model;

import java.util.List;

import com.erp.biz.api.model.response.IngestionError;

public class FeedDetail
{
    private String feedId;
    private String feedStatus;
    private Integer itemsReceived;
    private Integer itemsSucceeded;
    private Integer itemsFailed;
    private Integer itemsProcessing;
    private Integer offset;
    private Integer limit;
    private List<FeedItemDetails> itemDetails;
    private List<IngestionError> ingestionError;

    public String getFeedId()
    {
        return feedId;
    }

    public void setFeedId(String feedId)
    {
        this.feedId = feedId;
    }

    public String getFeedStatus()
    {
        return feedStatus;
    }

    public void setFeedStatus(String feedStatus)
    {
        this.feedStatus = feedStatus;
    }

    public Integer getItemsReceived()
    {
        return itemsReceived;
    }

    public void setItemsReceived(Integer itemsReceived)
    {
        this.itemsReceived = itemsReceived;
    }

    public Integer getItemsSucceeded()
    {
        return itemsSucceeded;
    }

    public void setItemsSucceeded(Integer itemsSucceeded)
    {
        this.itemsSucceeded = itemsSucceeded;
    }

    public Integer getItemsFailed()
    {
        return itemsFailed;
    }

    public void setItemsFailed(Integer itemsFailed)
    {
        this.itemsFailed = itemsFailed;
    }

    public Integer getItemsProcessing()
    {
        return itemsProcessing;
    }

    public void setItemsProcessing(Integer itemsProcessing)
    {
        this.itemsProcessing = itemsProcessing;
    }

    public Integer getOffset()
    {
        return offset;
    }

    public void setOffset(Integer offset)
    {
        this.offset = offset;
    }

    public Integer getLimit()
    {
        return limit;
    }

    public void setLimit(Integer limit)
    {
        this.limit = limit;
    }

    public List<FeedItemDetails> getItemDetails()
    {
        return itemDetails;
    }

    public void setItemDetails(List<FeedItemDetails> itemDetails)
    {
        this.itemDetails = itemDetails;
    }

    public List<IngestionError> getIngestionError()
    {
        return ingestionError;
    }

    public void setIngestionError(List<IngestionError> ingestionError)
    {
        this.ingestionError = ingestionError;
    }

}
