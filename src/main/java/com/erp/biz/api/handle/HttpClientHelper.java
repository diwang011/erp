package com.erp.biz.api.handle;

import java.util.Map;

import com.erp.common.HttpMethod;

public interface HttpClientHelper
{
    public String send(String url, String strEntity, Map<String, Map<String, Object>> map, HttpMethod httpMethod)
            throws Exception;
}
