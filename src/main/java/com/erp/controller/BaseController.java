package com.erp.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.erp.db.service.IUserInfoService;

public abstract class BaseController
{
    protected final Logger logger = LogManager.getLogger(this.getClass());
    @Resource
    private IUserInfoService userInfoService;

    protected Integer getUserByToken(String token)
    {
        if (StringUtils.isEmpty(token))
        {
            return null;
        }
        return userInfoService.getUserByToken(token);
    }

    protected void sendCsvFileToPage(String filePath, String fileName, HttpServletResponse resp)
    {
        if (fileName.toLowerCase().endsWith(".csv"))
        {
            sendFileToPage(filePath, fileName, "text/csv", resp);
        }
        else if (fileName.toLowerCase().endsWith(".xls"))
        {
            sendFileToPage(filePath, fileName, "application/vnd.ms-excel", resp);
        }
        else if (fileName.toLowerCase().endsWith(".xlsx"))
        {
            sendFileToPage(filePath, fileName, "application/x-excel", resp);
        }
    }

    private void sendFileToPage(String filePath, String fileName, String contentType, HttpServletResponse resp)
    {
        String wholeName = filePath + fileName;
        logger.trace("Will download file: " + wholeName);
        File file = new File(wholeName);
        ServletOutputStream sOutputStream = null;
        try
        {
            sOutputStream = resp.getOutputStream();
        }
        catch (Exception e)
        {
            sOutputStream = null;
            logger.error("sendFileToPage IO Exception :" + e.getMessage(), e);
        }
        if (sOutputStream == null)
        {
            return;
        }
        resp.setContentType(contentType);
        resp.setHeader("Content-Disposition", "inline; filename=" + fileName);
        resp.setHeader("Content-Length", String.valueOf(file.length()));

        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(file);
        }
        catch (Exception e)
        {
            fis = null;
            logger.error("file not found error :" + e.getMessage(), e);
        }
        if (fis == null)
        {
            return;
        }
        BufferedInputStream bufis = new BufferedInputStream(fis);
        byte[] cacheBuf = new byte[1024];
        long readLength = 0l;

        try
        {
            while (readLength < file.length())
            {
                int j = bufis.read(cacheBuf, 0, 1024);
                readLength += j;
                sOutputStream.write(cacheBuf, 0, j);
            }
            sOutputStream.flush();
            sOutputStream.close();
            resp.flushBuffer();
            bufis.close();
            fis.close();
        }
        catch (Exception e)
        {
            logger.error("sendFileToPage IO Exception :" + e.getMessage(), e);
        }
        sOutputStream = null;
    }
}
