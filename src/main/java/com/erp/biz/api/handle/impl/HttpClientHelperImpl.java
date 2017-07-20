package com.erp.biz.api.handle.impl;

import java.io.IOException;
import java.util.Map;

import org.apache.axis.utils.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.erp.biz.api.handle.HttpClientHelper;
import com.erp.common.HttpMethod;

@Service
public class HttpClientHelperImpl implements HttpClientHelper
{
    private static Logger log = LogManager.getLogger(HttpClientHelperImpl.class);

    public static final String HEAD = "head";
    public static final String REQUIRED = "required";
    public static final String OPTIONAL = "optional";
    // 连接超时时间，默认120秒
    private static int socketTimeout = 120000;
    // 传输超时时间，默认360秒
    private static int connectTimeout = 360000;

    @Override
    public String send(String url, String strEntity, Map<String, Map<String, Object>> map, HttpMethod httpMethod)
            throws Exception
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
                    .setConnectTimeout(connectTimeout).build();
            if (null != map)
            {
                url = keyValue2Url(keyValue2Url(url, map.get(REQUIRED), true), map.get(OPTIONAL), false);
            }
            HttpRequestBase reqObj = null;
            switch (httpMethod)
            {
            case GET:
                reqObj = new HttpGet(url);
                break;
            case POST:
                reqObj = new HttpPost(url);
                break;
            case PUT:
                reqObj = new HttpPut(url);
                break;
            case DELETE:
                reqObj = new HttpDelete(url);
                break;
            default:
                break;
            }
            reqObj.setConfig(requestConfig);
            Boolean flag = Boolean.FALSE;
            if (null != map && null != map.get(HEAD))
            {
                for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
                {
                    if ("multipart/form-data".equals(head.getValue()))
                    {
                        flag = true;
                    }
                    reqObj.addHeader(head.getKey(), "" + head.getValue());
                }
            }
            if (!StringUtils.isEmpty(strEntity) && reqObj instanceof HttpEntityEnclosingRequestBase)
            {
                HttpEntity se = null;
                if (flag)
                {
                    StringBody comment = new StringBody((String) strEntity, ContentType.TEXT_XML);
                    se = MultipartEntityBuilder.create().addPart("comment", comment).build();
                }
                else
                {
                    se = new StringEntity(strEntity, "utf-8");
                }
                ((HttpEntityEnclosingRequestBase) reqObj).setEntity(se);
            }
            try
            {
                log.info("Executing request " + reqObj.getRequestLine());
                log.info("request json--->" + JSON.toJSONString(reqObj));
            }
            catch (Exception e)
            {
            }
            CloseableHttpResponse response = httpclient.execute(reqObj);
            log.info("response json--->" + JSON.toJSONString(response));
            log.info("--------------------response status: " + response.getStatusLine() + "--------------------");
            HttpEntity entity = response.getEntity();
            return entity != null ? EntityUtils.toString(entity) : null;
        }
        catch (Exception e)
        {
            log.error(e);
            throw e;
        }
        finally
        {
            try
            {
                httpclient.close();
            }
            catch (IOException e)
            {
                log.error("close exception " + e);
            }
        }
    }

    /**
     * 
     * @param url
     * @param parameterMap
     * @param flag
     *            =true REQUIRED, false optional
     * @return
     */
    private String keyValue2Url(String url, Map<String, Object> parameterMap, boolean flag)
    {
        StringBuilder sb = new StringBuilder("");
        if (flag)
        {
            if (null != parameterMap)
            {
                for (Map.Entry<String, Object> entry : parameterMap.entrySet())
                {
                    sb.append(entry.getKey()).append("=").append(null == entry.getValue() ? "" : entry.getValue())
                            .append("&");
                }
            }
            if (sb.length() > 0)
            {
                if (url.indexOf("?") != -1)
                {
                    url += sb.toString();
                }
                else
                {
                    url += "?" + sb.toString();
                }
            }
        }
        else
        {
            if (null != parameterMap)
            {
                for (Map.Entry<String, Object> entry : parameterMap.entrySet())
                {
                    if (null != entry.getValue())
                    {
                        sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
                    }
                }
            }
            if (sb.length() > 0)
            {

                if (url.indexOf("?") != -1)
                {
                    url += sb.substring(0, sb.length() - 1);
                }
                else
                {
                    url += "?" + sb.substring(0, sb.length() - 1);
                }
            }
        }
        return url;
    }

}
