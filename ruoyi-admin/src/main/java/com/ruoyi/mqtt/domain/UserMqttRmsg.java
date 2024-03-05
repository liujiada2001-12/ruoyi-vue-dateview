package com.ruoyi.mqtt.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * mqtt接收测试对象 user_mqtt_rmsg
 * 
 * @author 1
 * @date 2024-03-02
 */
public class UserMqttRmsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 主题 */
    @Excel(name = "主题")
    private String topic;

    /** Qos */
    @Excel(name = "Qos")
    private String qos;

    /** 信息 */
    @Excel(name = "信息")
    private String msg;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTopic(String topic) 
    {
        this.topic = topic;
    }

    public String getTopic() 
    {
        return topic;
    }
    public void setQos(String qos) 
    {
        this.qos = qos;
    }

    public String getQos() 
    {
        return qos;
    }
    public void setMsg(String msg) 
    {
        this.msg = msg;
    }

    public String getMsg() 
    {
        return msg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("topic", getTopic())
            .append("qos", getQos())
            .append("msg", getMsg())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("remark", getRemark())
            .toString();
    }
}
