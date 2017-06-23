package com.erp.biz.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.FilePartSource;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;

/**
 * http get&post respose string(json,xml)
 * 
 * @author omniselling
 * 
 */
public class HttpClientHelper
{
    private static Logger log = LogManager.getLogger(HttpClientHelper.class);
    
    public static final String HEAD = "head";
    public static final String REQUIRED = "required";
    public static final String OPTIONAL = "optional";
    // 连接超时时间，默认120秒
    private static int socketTimeout = 120000;
    // 传输超时时间，默认360秒
    private static int connectTimeout = 360000;
    private Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();

    /**
     * doHttpGet
     * 
     * @param url
     * @return
     * @throws Exception
     */
    public String doHttpGet(String url) throws Exception
    {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
                .setConnectTimeout(connectTimeout).build();
        try
        {
            if (null != map)
            {

                url = keyValue2Url(keyValue2Url(url, map.get(REQUIRED), true), map.get(OPTIONAL), false);
            }
            HttpGet httpget = new HttpGet(url);
            httpget.setConfig(requestConfig);
            if (null != map && null != map.get(HEAD))
            {
                for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
                {
                    httpget.addHeader(head.getKey(), "" + head.getValue());
                }
            }
            log.info("Executing request " + httpget.getRequestLine());
            final Status s = new Status();
            ResponseHandler<String> responseHandler = new ResponseHandler<String>()
            {
                @Override
                public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException
                {
                    int status = response.getStatusLine().getStatusCode();
                    s.setStatus(status);
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;

                }
            };
            log.info(JSON.toJSONString(httpget));
            String responseBody = httpclient.execute(httpget, responseHandler);
            log.info("--------------------response status: " + s.getStatus() + "--------------------");
            log.info(responseBody);
            return responseBody;
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
     * doHttpDelete
     * 
     * @param url
     * @return
     * @throws Exception
     */
    public String doHttpDelete(String url) throws Exception
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
                .setConnectTimeout(connectTimeout).build();
        try
        {
            if (null != map)
            {

                url = keyValue2Url(keyValue2Url(url, map.get(REQUIRED), true), map.get(OPTIONAL), false);
            }

            HttpDelete httpDelete = new HttpDelete(url);
            httpDelete.setConfig(requestConfig);
            if (null != map && null != map.get(HEAD))
            {
                for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
                {
                    httpDelete.addHeader(head.getKey(), "" + head.getValue());
                }
            }
            log.info("Executing request " + httpDelete.getRequestLine());
            final Status s = new Status();
            ResponseHandler<String> responseHandler = new ResponseHandler<String>()
            {
                @Override
                public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException
                {
                    int status = response.getStatusLine().getStatusCode();
                    s.setStatus(status);

                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;

                }
            };
            outHeader(httpDelete.getAllHeaders());
            String responseBody = httpclient.execute(httpDelete, responseHandler);
            log.info("--------------------response status: " + s.getStatus() + "--------------------");
            log.info(responseBody);
            return responseBody;
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
     * doHttpPost
     * 
     * @param url
     * @param strEntity
     * @return
     * @throws Exception
     */
    public String doHttpPost(String url, String obj) throws Exception
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
                .setConnectTimeout(connectTimeout).build();
        try
        {
            HttpPost httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            if (null != map && null != map.get(HEAD))
            {
                for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
                {
                    httpPost.addHeader(head.getKey(), "" + head.getValue());
                }
            }

            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            if (null != map && null != map.get(REQUIRED))
            {
                for (Map.Entry<String, Object> entry : map.get(REQUIRED).entrySet())
                {
                    nvps.add(new BasicNameValuePair(entry.getKey(),
                            "" + (null == entry.getValue() ? "" : entry.getValue())));
                }
            }
            if (null != map && null != map.get(OPTIONAL))
            {
                for (Map.Entry<String, Object> omap : map.get(OPTIONAL).entrySet())
                {
                    if (null != omap.getValue())
                    {
                        nvps.add(new BasicNameValuePair(omap.getKey(),
                                "" + (null == omap.getValue() ? "" : omap.getValue())));
                    }
                }
            }
            CloseableHttpResponse response = null;
            try
            {
                if (null != obj && !"".equals(obj))
                {
                    if (obj instanceof String)
                    {
                        StringEntity se = new StringEntity(obj, "utf-8");
                        httpPost.setEntity(se);
                    }
                }
                else
                {
                    httpPost.setEntity(new UrlEncodedFormEntity(nvps));
                }
                outHeader(httpPost.getAllHeaders());
                log.info(JSON.toJSONString(httpPost));
                response = httpclient.execute(httpPost);
                log.info(response.getStatusLine());
                HttpEntity entity = response.getEntity();
                String str = EntityUtils.toString(entity);
                log.info(str);
                return str;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                throw e;
            }
            finally
            {
                try
                {
                    response.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        finally
        {
            try
            {
                httpclient.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * doHttpPostMultipart
     * 
     * @param url
     * @param obj
     * @return
     * @throws Exception
     */
    public String doHttpPostMultipart(String url, Object obj) throws Exception
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
                .setConnectTimeout(connectTimeout).build();
        try
        {
            HttpPost httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            if (null != map && null != map.get(HEAD))
            {
                for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
                {
                    if ("Content-Type".equals(head.getKey()))
                    {
                        continue;
                    }
                    httpPost.addHeader(head.getKey(), "" + head.getValue());
                }
            }
            httpPost.addHeader("Content-Type", "multipart/form-data");
            if (null != obj && !"".equals(obj))
            {
                StringBody comment = new StringBody((String) obj, ContentType.TEXT_XML);

                HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("comment", comment).build();
                httpPost.setEntity(reqEntity);

            }

            log.info("executing request " + httpPost.getRequestLine());
            outHeader(httpPost.getAllHeaders());
            CloseableHttpResponse response = httpclient.execute(httpPost);
            HttpEntity resEntity = null;
            String responseBody = null;
            try
            {
                log.info("----------------------------------------");
                log.info(response.getStatusLine());
                resEntity = response.getEntity();
                if (resEntity != null)
                {
                    log.info("Response content length: " + resEntity.getContentLength());
                    responseBody = EntityUtils.toString(resEntity);
                }
                return responseBody;
            }

            finally
            {
                if (resEntity != null)
                {
                    EntityUtils.consume(resEntity);
                }
                response.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            httpclient.close();
        }
    }

    private void outHeader(Header[] allHeaders)
    {
        for (Header header : allHeaders)
        {
            log.info(header.getName() + ":" + header.getValue());
        }
    }

    /**
     * doHttpPostMethod
     * 
     * @param url
     * @param obj
     * @return
     * @throws Exception
     */
    public String doHttpPostMethod(String url, Object obj) throws Exception
    {
        HttpClient httpclient = new HttpClient();
        PostMethod httpPost = new PostMethod(url);
        if (null != map && null != map.get(HEAD))
        {
            for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
            {
                httpPost.addRequestHeader(head.getKey(), "" + head.getValue());
            }
        }

        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        if (null != map && null != map.get(REQUIRED))
        {
            for (Map.Entry<String, Object> entry : map.get(REQUIRED).entrySet())
            {
                nvps.add(new BasicNameValuePair(entry.getKey(),
                        "" + (null == entry.getValue() ? "" : entry.getValue())));
            }
        }
        if (null != map && null != map.get(OPTIONAL))
        {
            for (Map.Entry<String, Object> omap : map.get(OPTIONAL).entrySet())
            {
                if (null != omap.getValue())
                {
                    nvps.add(new BasicNameValuePair(omap.getKey(),
                            "" + (null == omap.getValue() ? "" : omap.getValue())));
                }
            }
        }
        try
        {
            if (null != obj && !"".equals(obj))
            {

                RequestEntity se = new StringRequestEntity(obj.toString(), "text/xml", "utf-8");
                httpPost.setRequestEntity(se);

            }
            log.info(JSON.toJSONString(httpPost));
            httpclient.executeMethod(httpPost);
            String str = httpPost.getResponseBodyAsString();
            log.info(str);
            return str;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }

    }

    /**
     * doHttpPut
     * 
     * @param url
     * @param obj
     * @return
     * @throws Exception
     */
    public String doHttpPut(String url, Object obj) throws Exception
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
                .setConnectTimeout(connectTimeout).build();
        try
        {
            HttpPut httpPut = new HttpPut(url);
            httpPut.setConfig(requestConfig);
            if (null != map && null != map.get(HEAD))
            {
                for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
                {
                    httpPut.addHeader(head.getKey(), "" + head.getValue());
                }
            }

            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            if (null != map && null != map.get(REQUIRED))
            {
                for (Map.Entry<String, Object> entry : map.get(REQUIRED).entrySet())
                {
                    nvps.add(new BasicNameValuePair(entry.getKey(),
                            "" + (null == entry.getValue() ? "" : entry.getValue())));
                }
            }
            if (null != map && null != map.get(OPTIONAL))
            {
                for (Map.Entry<String, Object> omap : map.get(OPTIONAL).entrySet())
                {
                    if (null != omap.getValue())
                    {
                        nvps.add(new BasicNameValuePair(omap.getKey(),
                                "" + (null == omap.getValue() ? "" : omap.getValue())));
                    }
                }
            }
            CloseableHttpResponse response = null;
            try
            {
                if (null != obj && !"".equals(obj))
                {
                    if (obj instanceof String)
                    {
                        StringEntity se = new StringEntity((String) obj, "utf-8");
                        httpPut.setEntity(se);
                    }
                    if (obj instanceof File)
                    {
                        FileEntity se = new FileEntity((File) obj);
                        httpPut.setEntity(se);
                    }
                }
                else
                {
                    httpPut.setEntity(new UrlEncodedFormEntity(nvps));
                }
                outHeader(httpPut.getAllHeaders());
                log.info(JSON.toJSONString(httpPut));
                response = httpclient.execute(httpPut);
                log.info(response.getStatusLine());
                HttpEntity entity = response.getEntity();
                String str = EntityUtils.toString(entity);
                log.info(str);
                return str;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                throw e;
            }
            finally
            {
                try
                {
                    response.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        finally
        {
            try
            {
                httpclient.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public String doHttpPostFile(String url, File file) throws Exception
    {
        HttpClient httpclient = new HttpClient();
        PostMethod postMethod = new PostMethod(url);
        if (null != map && null != map.get(HEAD))
        {
            for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
            {
                postMethod.addRequestHeader(head.getKey(), "" + head.getValue());
            }
        }

        {
            if (null != file && !"".equals(file))
            {
                List<Part> parts = new ArrayList<Part>();
                // 增加文件参数，strParaFileName是参数名，使用本地文件
                FilePart part = new FilePart("new.xml", new FilePartSource(file));
                parts.add(part);
                // 设置请求体
                postMethod.setRequestEntity(
                        new MultipartRequestEntity(parts.toArray(new Part[0]), new HttpMethodParams()));

            }
            httpclient.executeMethod(postMethod);
            return postMethod.getResponseBodyAsString();
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

    /**
     * 
     * @param url
     * @param fileName
     * @return
     */
    public byte[] doHttpPostAndSaveFile(String url, String fileName)
    {
        Map<String, Object> requiredMap = map.get(REQUIRED);
        Map<String, Object> optionalMap = map.get(OPTIONAL);
        byte[] content = new byte[0];
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
            HttpPost httpPost = new HttpPost(url);
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            if (null != requiredMap)
            {
                for (Map.Entry<String, Object> entry : requiredMap.entrySet())
                {
                    nvps.add(new BasicNameValuePair(entry.getKey(),
                            "" + (null == entry.getValue() ? "" : entry.getValue())));
                }
            }
            if (null != optionalMap)
            {
                for (Map.Entry<String, Object> omap : optionalMap.entrySet())
                {
                    if (null != omap.getValue())
                    {
                        nvps.add(new BasicNameValuePair(omap.getKey(),
                                "" + (null == omap.getValue() ? "" : omap.getValue())));
                    }
                }
            }
            CloseableHttpResponse response = null;
            try
            {
                httpPost.setEntity(new UrlEncodedFormEntity(nvps));
                response = httpclient.execute(httpPost);
                log.info(response.getStatusLine());
                HttpEntity entity = response.getEntity();
                content = EntityUtils.toByteArray(entity);

            }
            catch (UnsupportedEncodingException e)
            {
                e.printStackTrace();
            }
            catch (ClientProtocolException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    response.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        finally
        {
            try
            {
                httpclient.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return content;
    }

    public byte[] doHttpGetAndSaveFile(String url, String fileName)
    {
        byte[] content = new byte[0];
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try
        {
            if (null != map)
            {

                url = keyValue2Url(keyValue2Url(url, map.get(REQUIRED), true), map.get(OPTIONAL), false);
            }

            HttpGet httpget = new HttpGet(url);
            if (null != map && null != map.get(HEAD))
            {
                for (Map.Entry<String, Object> head : map.get(HEAD).entrySet())
                {
                    httpget.addHeader(head.getKey(), "" + head.getValue());
                }
            }
            log.info("Executing request " + httpget.getRequestLine());
            final Status s = new Status();
            ResponseHandler<byte[]> responseHandler = new ResponseHandler<byte[]>()
            {
                @Override
                public byte[] handleResponse(final HttpResponse response) throws ClientProtocolException, IOException
                {
                    int status = response.getStatusLine().getStatusCode();
                    s.setStatus(status);
                    log.info("--------------------response status: " + status + "--------------------");
                    HttpEntity entity = response.getEntity();
                    return EntityUtils.toByteArray(entity);

                }
            };
            content = httpclient.execute(httpget, responseHandler);

            return content;
        }
        catch (ClientProtocolException e)
        {
            log.error(e);
        }
        catch (IOException e)
        {
            log.error(e);
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
        return null;
    }

    /**
     * 
     * @param key
     * @param value
     * @param flag
     *            true---->(http parameter required) false------>(http parameter optional)
     */
    public HttpClientHelper parameter2Http(String key, Object value, boolean flag)
    {
        if (flag)
        {
            if (null == map.get(REQUIRED))
            {
                map.put(REQUIRED, new HashMap<String, Object>());
            }
            map.get(REQUIRED).put(key, value);
        }
        else
        {
            if (null == map.get(OPTIONAL))
            {
                map.put(OPTIONAL, new HashMap<String, Object>());
            }
            map.get(OPTIONAL).put(key, value);
        }
        return this;
    };

    /**
     * 
     * @param key
     * @return
     */
    public String removeFromHeader(String key)
    {
        String value = null;
        if (null == map.get(HEAD))
        {
            map.put(HEAD, new HashMap<String, Object>());
            return null;
        }
        if (null != map.get(HEAD).get(key))
        {
            value = "" + map.get(HEAD).remove(key);
        }

        return value;
    };

    /**
     * http head parameter eg:"Content-Type", "text/xml"
     * 
     * @param key
     * @param value
     */
    public HttpClientHelper parameter2Head(String key, Object value)
    {
        if (null == map)
        {
            throw new NullPointerException();
        }

        if (null == map.get(HEAD))
        {
            map.put(HEAD, new HashMap<String, Object>());
        }
        map.get(HEAD).put(key, value);
        return this;
    };

    public static void write2File(InputStream input, String fileName)
    {
        PrintStream ps = null;
        BufferedInputStream bis = null;
        try
        {
            bis = new BufferedInputStream(input);
            ps = new PrintStream(new FileOutputStream(new File(fileName)));
            int readBytes = 0;
            while ((readBytes = bis.read()) != -1)
            {
                ps.write(readBytes);
            }
            ps.close();
            bis.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void setMap(Map<String, Map<String, Object>> map)
    {
        this.map = map;
    }

//    public static void main(String[] args) throws Exception
//    {
//
//    }

    class Status
    {
        private int status;

        public int getStatus()
        {
            return status;
        }

        public void setStatus(int status)
        {
            this.status = status;
        }
    }

}
