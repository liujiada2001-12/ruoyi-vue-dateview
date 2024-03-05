package com.ruoyi.device.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备分类对象 user_device_category
 * 
 * @author 1
 * @date 2024-02-27
 */
public class UserDeviceCategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 类别 */
    @Excel(name = "类别")
    private String categoryName;

    /** 父类id */
    @Excel(name = "父类id")
    private Long parentId;

    /** 上传时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上传时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date upTime;

    /** 更新者 */
    @Excel(name = "更新者")
    private String upBy;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCategoryName(String categoryName) 
    {
        this.categoryName = categoryName;
    }

    public String getCategoryName() 
    {
        return categoryName;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setUpTime(Date upTime) 
    {
        this.upTime = upTime;
    }

    public Date getUpTime() 
    {
        return upTime;
    }
    public void setUpBy(String upBy) 
    {
        this.upBy = upBy;
    }

    public String getUpBy() 
    {
        return upBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("categoryName", getCategoryName())
            .append("parentId", getParentId())
            .append("createTime", getCreateTime())
            .append("upTime", getUpTime())
            .append("createBy", getCreateBy())
            .append("upBy", getUpBy())
            .append("remark", getRemark())
            .toString();
    }
}
