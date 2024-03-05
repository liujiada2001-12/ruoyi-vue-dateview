package com.ruoyi.date.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 平均值对象 user_date_avg_sum
 * 
 * @author 1
 * @date 2024-02-29
 */
public class UserDateAvgSum extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 类型 */
    @Excel(name = "类型")
    private String cType;

    /** 值 */
    @Excel(name = "值")
    private Double cValue;

    /** 值类型 */
    @Excel(name = "值类型")
    private String vType;

    public void setcType(String cType) 
    {
        this.cType = cType;
    }

    public String getcType() 
    {
        return cType;
    }
    public void setcValue(Double cValue)
    {
        this.cValue = cValue;
    }

    public Double getcValue()
    {
        return cValue;
    }
    public void setvType(String vType) 
    {
        this.vType = vType;
    }

    public String getvType() 
    {
        return vType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cType", getcType())
            .append("cValue", getcValue())
            .append("vType", getvType())
            .toString();
    }
}
