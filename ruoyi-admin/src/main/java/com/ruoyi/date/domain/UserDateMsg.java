package com.ruoyi.date.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 数据汇总对象 user_date_msg
 * 
 * @author 1
 * @date 2024-02-29
 */
public class UserDateMsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 数据编号 */
    @Excel(name = "数据编号")
    private String number;

    /** 地点编号 */
    @Excel(name = "地点编号")
    private String siteCode;

    /** 值 */
    @Excel(name = "值")
    private Double value;

    /** 数据类型 */
    @Excel(name = "数据类型")
    private Long dateCategory;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setSiteCode(String siteCode) 
    {
        this.siteCode = siteCode;
    }

    public String getSiteCode() 
    {
        return siteCode;
    }
    public void setValue(Double value)
    {
        this.value = value;
    }

    public Double getValue()
    {
        return value;
    }
    public void setDateCategory(Long dateCategory) 
    {
        this.dateCategory = dateCategory;
    }

    public Long getDateCategory() 
    {
        return dateCategory;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("number", getNumber())
            .append("siteCode", getSiteCode())
            .append("value", getValue())
            .append("dateCategory", getDateCategory())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}
