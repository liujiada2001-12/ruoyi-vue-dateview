package com.ruoyi.device.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备信息对象 user_device_msg
 * 
 * @author 1
 * @date 2024-02-29
 */
public class UserDeviceMsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 类别 */
    @Excel(name = "类别")
    private Long categoryName;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 状态 */
    @Excel(name = "状态")
    private Long statusName;

    /** 上传时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上传时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date upTime;

    /** 上传者 */
    @Excel(name = "上传者")
    private String upBy;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCategoryName(Long categoryName) 
    {
        this.categoryName = categoryName;
    }

    public Long getCategoryName() 
    {
        return categoryName;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStatusName(Long statusName) 
    {
        this.statusName = statusName;
    }

    public Long getStatusName() 
    {
        return statusName;
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
            .append("name", getName())
            .append("statusName", getStatusName())
            .append("createTime", getCreateTime())
            .append("upTime", getUpTime())
            .append("createBy", getCreateBy())
            .append("upBy", getUpBy())
            .append("remark", getRemark())
            .toString();
    }
}
