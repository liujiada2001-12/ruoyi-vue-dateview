package com.ruoyi.mqtt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mqtt.mapper.UserMqttMmsgMapper;
import com.ruoyi.mqtt.domain.UserMqttMmsg;
import com.ruoyi.mqtt.service.IUserMqttMmsgService;
import com.ruoyi.mqtt.MqttPushClient;

/**
 * mqtt消息测试Service业务层处理
 * 
 * @author 1
 * @date 2024-03-01
 */
@Service
public class UserMqttMmsgServiceImpl implements IUserMqttMmsgService 
{
    @Autowired
    private UserMqttMmsgMapper userMqttMmsgMapper;

    /**
     * 查询mqtt消息测试
     * 
     * @param id mqtt消息测试主键
     * @return mqtt消息测试
     */
    @Override
    public UserMqttMmsg selectUserMqttMmsgById(Long id)
    {
        return userMqttMmsgMapper.selectUserMqttMmsgById(id);
    }

    /**
     * 查询mqtt消息测试列表
     * 
     * @param userMqttMmsg mqtt消息测试
     * @return mqtt消息测试
     */
    @Override
    public List<UserMqttMmsg> selectUserMqttMmsgList(UserMqttMmsg userMqttMmsg)
    {
        return userMqttMmsgMapper.selectUserMqttMmsgList(userMqttMmsg);
    }

    /**
     * 新增mqtt消息测试
     * 
     * @param userMqttMmsg mqtt消息测试
     * @return 结果
     */
    @Autowired
    private MqttPushClient mqttPushClient;
    @Override
    public int insertUserMqttMmsg(UserMqttMmsg userMqttMmsg)
    {
        userMqttMmsg.setCreateTime(DateUtils.getNowDate());
//        mqttPushClient.publish(0, false, "topic1", "新增");
//        mqttPushClient.publish(0, false, userMqttMmsg.getTopic(), userMqttMmsg.getMsg());
        return userMqttMmsgMapper.insertUserMqttMmsg(userMqttMmsg);
    }

    /**
     * 修改mqtt消息测试
     * 
     * @param userMqttMmsg mqtt消息测试
     * @return 结果
     */
    @Override
    public int updateUserMqttMmsg(UserMqttMmsg userMqttMmsg)
    {
        userMqttMmsg.setUpdateTime(DateUtils.getNowDate());
//        mqttPushClient.publish(0, false, "topic1", "修改");
//        mqttPushClient.publish(0, false, userMqttMmsg.getTopic(), userMqttMmsg.getMsg());
        return userMqttMmsgMapper.updateUserMqttMmsg(userMqttMmsg);
    }

    /**
     * 批量删除mqtt消息测试
     * 
     * @param ids 需要删除的mqtt消息测试主键
     * @return 结果
     */
    @Override
    public int deleteUserMqttMmsgByIds(Long[] ids)
    {
        return userMqttMmsgMapper.deleteUserMqttMmsgByIds(ids);
    }

    /**
     * 删除mqtt消息测试信息
     * 
     * @param id mqtt消息测试主键
     * @return 结果
     */
    @Override
    public int deleteUserMqttMmsgById(Long id)
    {
        return userMqttMmsgMapper.deleteUserMqttMmsgById(id);
    }
}
