package com.ruoyi.mqtt.service;

import java.util.List;
import com.ruoyi.mqtt.domain.UserMqttMmsg;

/**
 * mqtt消息测试Service接口
 * 
 * @author 1
 * @date 2024-03-01
 */
public interface IUserMqttMmsgService 
{
    /**
     * 查询mqtt消息测试
     * 
     * @param id mqtt消息测试主键
     * @return mqtt消息测试
     */
    public UserMqttMmsg selectUserMqttMmsgById(Long id);

    /**
     * 查询mqtt消息测试列表
     * 
     * @param userMqttMmsg mqtt消息测试
     * @return mqtt消息测试集合
     */
    public List<UserMqttMmsg> selectUserMqttMmsgList(UserMqttMmsg userMqttMmsg);

    /**
     * 新增mqtt消息测试
     * 
     * @param userMqttMmsg mqtt消息测试
     * @return 结果
     */
    public int insertUserMqttMmsg(UserMqttMmsg userMqttMmsg);

    /**
     * 修改mqtt消息测试
     * 
     * @param userMqttMmsg mqtt消息测试
     * @return 结果
     */
    public int updateUserMqttMmsg(UserMqttMmsg userMqttMmsg);

    /**
     * 批量删除mqtt消息测试
     * 
     * @param ids 需要删除的mqtt消息测试主键集合
     * @return 结果
     */
    public int deleteUserMqttMmsgByIds(Long[] ids);

    /**
     * 删除mqtt消息测试信息
     * 
     * @param id mqtt消息测试主键
     * @return 结果
     */
    public int deleteUserMqttMmsgById(Long id);
}
