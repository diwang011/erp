package com.erp.biz.api.handle;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

import com.erp.biz.api.model.response.Error;
import com.erp.biz.api.model.response.Errors;
import com.erp.biz.util.HttpClientHelper;
import com.erp.biz.util.JAXBUtil;

public class BaseHandele
{
    public static String baseUrl = "https://marketplace.walmartapis.com/";
    protected static String consumerId;
    protected static String privateEncodedStr;
    protected static String consumerChannelType = "bddef1e9-a87d-465b-87bf-a08b756c325d";

    public BaseHandele(String consumerId, String privateEncodedStr)
    {
        this.consumerId = consumerId;
        this.privateEncodedStr = privateEncodedStr;
    }

    public static HttpClientHelper createHttpClient(String finalUrl, String requestMethod)
    {
        HttpClientHelper httpClient = new HttpClientHelper();
        String timestamp = String.valueOf(System.currentTimeMillis());
        String stringToSign = consumerId + "\n" + finalUrl + "\n" + requestMethod + "\n" + timestamp + "\n";
        String signedString = signData(stringToSign, privateEncodedStr);
        httpClient.setMap(setMap(signedString, timestamp, consumerId, consumerChannelType));
        return httpClient;
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
            String consumerChannelType)
    {
        Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();
        Map<String, Object> value = new HashMap<String, Object>();
        value.put("WM_SVC.NAME", "Walmart Marketplace");
        value.put("WM_SEC.AUTH_SIGNATURE", signedString);
        value.put("WM_CONSUMER.ID", consumerId);
        value.put("WM_SEC.TIMESTAMP", timestamp);
        value.put("WM_QOS.CORRELATION_ID", (int) (Math.random() * 9000 + 1000));
        value.put("Accept", "application/xml");
        value.put("Content-Type", "application/xml");
        String boundary = UUID.randomUUID().toString().replace("-", "");
        // value.put("Content-Type", "multipart/form-data");
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
        String error = null;
        Errors errors = JAXBUtil.converyToJavaBean(xml, Errors.class);
        for (Error er : errors.getError())
        {
            if (er.getCode() != null)
            {
                error += er.getCode();
            }
        }
        throw new Exception(error);
    }

}
