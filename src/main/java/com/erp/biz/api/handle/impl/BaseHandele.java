package com.erp.biz.api.handle.impl;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.erp.biz.api.handle.HttpClientHelper;
import com.erp.biz.api.model.response.Error;
import com.erp.biz.api.model.response.Errors;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.HttpMethod;

public class BaseHandele
{
    private static final Logger LOGGER = LogManager.getLogger(BaseHandele.class);
    @Resource
    protected HttpClientHelper httpClient;

    public static String baseUrl = "https://marketplace.walmartapis.com/";
    protected static String consumerChannelType = "bddef1e9-a87d-465b-87bf-a08b756c325d";

    public static Map<String, Map<String, Object>> createMap(String finalUrl, String requestMethod, String consumerId,
            String privateEncodedStr, Boolean isMultipart)
    {
        String timestamp = String.valueOf(System.currentTimeMillis());
        String stringToSign = consumerId + "\n" + finalUrl + "\n" + requestMethod + "\n" + timestamp + "\n";
        String signedString = signData(stringToSign, privateEncodedStr);
        return setMap(signedString, timestamp, consumerId, consumerChannelType, isMultipart);
    }

    private static String signData(String stringToBeSigned, String encodedPrivateKey)
    {
        String signatureString = null;
        try
        {
            byte[] encodedKeyBytes = Base64.decodeBase64(encodedPrivateKey);
            PKCS8EncodedKeySpec privSpec = new PKCS8EncodedKeySpec(encodedKeyBytes);
            KeyFactory kf = KeyFactory.getInstance("RSA");
            PrivateKey myPrivateKey = kf.generatePrivate(privSpec);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(myPrivateKey);
            byte[] data = stringToBeSigned.getBytes("UTF-8");
            signature.update(data);
            byte[] signedBytes = signature.sign();
            signatureString = Base64.encodeBase64String(signedBytes);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return signatureString;
    }

    private static Map<String, Map<String, Object>> setMap(String signedString, String timestamp, String consumerId,
            String consumerChannelType, Boolean isMultipart)
    {
        Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();
        Map<String, Object> value = new HashMap<String, Object>();
        value.put("WM_SVC.NAME", "Walmart Marketplace");
        value.put("WM_SEC.AUTH_SIGNATURE", signedString);
        value.put("WM_CONSUMER.ID", consumerId);
        value.put("WM_SEC.TIMESTAMP", timestamp);
        value.put("WM_QOS.CORRELATION_ID", (int) (Math.random() * 9000 + 1000));
        value.put("Accept", "application/xml");
        if (isMultipart)
        {
            value.put("Content-Type", "multipart/form-data");
        }
        else
        {
            value.put("Content-Type", "application/xml");
        }
        if (consumerChannelType != null && consumerChannelType.length() > 0)
        {
            value.put("WM_CONSUMER.CHANNEL.TYPE", consumerChannelType);
        }
        // value.put("Host", "https://marketplace.walmartapis.com");
        map.put("head", value);
        return map;
    }

    protected void throwError(String xml) throws Exception
    {
        String error = "";
        Errors errors = JAXBUtil.converyToJavaBean(xml, Errors.class);
        for (Error er : errors.getError())
        {
            if (er.getCode() != null)
            {
                error += er.getCode() + ":" + er.getDescription();
            }
        }
        throw new Exception(error);
    }

    protected String baseSend(String finalUrl, Map<String, Map<String, Object>> map, HttpMethod httpMethod,
            String requestBoby) throws Exception
    {
        String xml;
        LOGGER.info(finalUrl);
        LOGGER.info(requestBoby);
        xml = httpClient.send(finalUrl, requestBoby, map, httpMethod);
        LOGGER.info(xml);
        return xml;
    }
}
