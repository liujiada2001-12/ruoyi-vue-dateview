package com.ruoyi.date.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 历史数据对象 user_date_history
 * 
 * @author 1
 * @date 2024-03-04
 */
public class UserDateHistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 时间 */
    @Excel(name = "时间")
    private String time;

    /** 值 */
    @Excel(name = "值")
    private Double value;

    public void setTime(String time) 
    {
        this.time = time;
    }

    public String getTime() 
    {
        return time;
    }
    public void setValue(Double value) 
    {
        this.value = value;
    }

    public Double getValue() 
    {
        return value;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("time", getTime())
            .append("value", getValue())
            .toString();
    }
}
