package com.erp.biz.model;

import java.util.List;
import java.util.Map;

public class RowData
{
    private Integer rowNum;
    private List<Map<String, String>> callDatas;

    public Integer getRowNum()
    {
        return rowNum;
    }

    public void setRowNum(Integer rowNum)
    {
        this.rowNum = rowNum;
    }

    public List<Map<String, String>> getCallDatas()
    {
        return callDatas;
    }

    public void setCallDatas(List<Map<String, String>> callDatas)
    {
        this.callDatas = callDatas;
    }

}
