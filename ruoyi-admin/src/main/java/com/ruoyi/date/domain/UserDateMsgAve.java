package com.ruoyi.date.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 最新平均值对象 user_date_msg_ave
 * 
 * @author 1
 * @date 2024-02-29
 */
public class UserDateMsgAve extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 采集时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "采集时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 数据类型 */
    @Excel(name = "数据类型")
    private Long dateCategory;
    /** 数据类型名称 */
    @Excel(name = "数据类型")
    private String dateCategoryName;
    /** 值 */
    @Excel(name = "值")
    private Double value;

    /** 数值类型 */
    @Excel(name = "数值类型")
    private Long valueCategory;
    /** 数值类型名称 */
    @Excel(name = "数值类型")
    private String valueCategoryName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setDateCategory(Long dateCategory) 
    {
        this.dateCategory = dateCategory;
    }

    public Long getDateCategory() 
    {
        return dateCategory;
    }

    public void setdateCategoryName(String dateCategoryName)
    {
        this.dateCategoryName = dateCategoryName;
    }

    public String getdateCategoryName()
    {
        return dateCategoryName;
    }
    public void setValue(Double value)
    {
        this.value = value;
    }

    public Double getValue()
    {
        return value;
    }
    public void setValueCategory(Long valueCategory) 
    {
        this.valueCategory = valueCategory;
    }

    public Long getValueCategory() 
    {
        return valueCategory;
    }

    public void setValueCategoryName(String valueCategoryName)
    {
        this.valueCategoryName = valueCategoryName;
    }

    public String getValueCategoryName()
    {
        return valueCategoryName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("time", getTime())
            .append("dateCategory", getDateCategory())
            .append("value", getValue())
            .append("valueCategory", getValueCategory())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}
