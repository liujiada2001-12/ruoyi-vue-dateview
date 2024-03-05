package com.ruoyi.mqtt.service;

import java.util.List;
import com.ruoyi.mqtt.domain.UserMqttRmsg;

/**
 * mqtt接收测试Service接口
 * 
 * @author 1
 * @date 2024-03-02
 */
public interface IUserMqttRmsgService 
{
    /**
     * 查询mqtt接收测试
     * 
     * @param id mqtt接收测试主键
     * @return mqtt接收测试
     */
    public UserMqttRmsg selectUserMqttRmsgById(Long id);

    /**
     * 查询mqtt接收测试列表
     * 
     * @param userMqttRmsg mqtt接收测试
     * @return mqtt接收测试集合
     */
    public List<UserMqttRmsg> selectUserMqttRmsgList(UserMqttRmsg userMqttRmsg);

    /**
     * 新增mqtt接收测试
     * 
     * @param userMqttRmsg mqtt接收测试
     * @return 结果
     */
    public int insertUserMqttRmsg(UserMqttRmsg userMqttRmsg);

    /**
     * 修改mqtt接收测试
     * 
     * @param userMqttRmsg mqtt接收测试
     * @return 结果
     */
    public int updateUserMqttRmsg(UserMqttRmsg userMqttRmsg);

    /**
     * 批量删除mqtt接收测试
     * 
     * @param ids 需要删除的mqtt接收测试主键集合
     * @return 结果
     */
    public int deleteUserMqttRmsgByIds(Long[] ids);

    /**
     * 删除mqtt接收测试信息
     * 
     * @param id mqtt接收测试主键
     * @return 结果
     */
    public int deleteUserMqttRmsgById(Long id);
}
