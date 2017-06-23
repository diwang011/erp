package com.erp.biz.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.multipart.MultipartFile;

import com.erp.biz.util.ExcelReportFileReaderWriterUtil;
import com.erp.biz.util.ReadExcelUtil;
import com.erp.biz.util.Reportable;
import com.erp.common.Common;
import com.erp.db.model.UserInfo;
import com.erp.db.service.IUserInfoService;

public abstract class BaseBizService
{
    @Resource
    private IUserInfoService userInfoService;

    protected UserInfo getUserById(Integer userId)
    {
        UserInfo user = null;
        try
        {
            user = userInfoService.queryById(userId);
        }
        catch (Exception e)
        {
            return null;
        }
        return user;
    }

    protected <T extends Reportable> List<T> readXlsContent(MultipartFile multipartFile, Class<T> csvClazz)
    {
        List<T> dataList = null;
        ExcelReportFileReaderWriterUtil<T> excelUtil = new ExcelReportFileReaderWriterUtil<T>();

        String fileName = multipartFile.getOriginalFilename();
        fileName = Common.FILE_PATH + fileName;

        File file = null;
        try
        {
            File files = new File(Common.FILE_PATH);
            if (!files.exists())
            {
                files.mkdirs();
            }
            file = new File(fileName);
            // multipartFile.transferTo(file);
            byte[] bytes = multipartFile.getBytes();
            BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(file));
            buffStream.write(bytes);
            buffStream.close();
            dataList = excelUtil.readReportFile(csvClazz, fileName);
            file.delete();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            if (file != null)
            {
                file.delete();
            }
            return null;
        }

        return dataList;
    }

    protected List<List<Object>> readXlsmContent(MultipartFile multipartFile)
    {
        List<List<Object>> dataList = null;
        ReadExcelUtil excelUtil = new ReadExcelUtil();

        String fileName = multipartFile.getOriginalFilename();

        SimpleDateFormat dateTimeFormatForFileName = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateName = dateTimeFormatForFileName.format(new Date());
        String path = Common.FILE_PATH + dateName + fileName;
        File file = null;
        try
        {
            File files = new File(Common.FILE_PATH);
            if (!files.exists())
            {
                files.mkdirs();
            }
            file = new File(path);
            byte[] bytes = multipartFile.getBytes();
            BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(file));
            buffStream.write(bytes);
            buffStream.close();
            dataList = excelUtil.readExcelContent(path, fileName);
            file.delete();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            if (file != null)
            {
                file.delete();
            }
            return null;
        }

        return dataList;
    }
}
