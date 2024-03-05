package com.ruoyi.mqtt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.mqtt.mapper.UserMqttRmsgMapper;
import com.ruoyi.mqtt.domain.UserMqttRmsg;
import com.ruoyi.mqtt.service.IUserMqttRmsgService;

/**
 * mqtt接收测试Service业务层处理
 * 
 * @author 1
 * @date 2024-03-02
 */
@Service
public class UserMqttRmsgServiceImpl implements IUserMqttRmsgService 
{
    @Autowired
    private UserMqttRmsgMapper userMqttRmsgMapper;

    /**
     * 查询mqtt接收测试
     * 
     * @param id mqtt接收测试主键
     * @return mqtt接收测试
     */
    @Override
    public UserMqttRmsg selectUserMqttRmsgById(Long id)
    {
        return userMqttRmsgMapper.selectUserMqttRmsgById(id);
    }

    /**
     * 查询mqtt接收测试列表
     * 
     * @param userMqttRmsg mqtt接收测试
     * @return mqtt接收测试
     */
    @Override
    public List<UserMqttRmsg> selectUserMqttRmsgList(UserMqttRmsg userMqttRmsg)
    {
        return userMqttRmsgMapper.selectUserMqttRmsgList(userMqttRmsg);
    }

    /**
     * 新增mqtt接收测试
     * 
     * @param userMqttRmsg mqtt接收测试
     * @return 结果
     */
    @Override
    public int insertUserMqttRmsg(UserMqttRmsg userMqttRmsg)
    {
        userMqttRmsg.setCreateTime(DateUtils.getNowDate());
        return userMqttRmsgMapper.insertUserMqttRmsg(userMqttRmsg);
    }

    /**
     * 修改mqtt接收测试
     * 
     * @param userMqttRmsg mqtt接收测试
     * @return 结果
     */
    @Override
    public int updateUserMqttRmsg(UserMqttRmsg userMqttRmsg)
    {
        userMqttRmsg.setUpdateTime(DateUtils.getNowDate());
        return userMqttRmsgMapper.updateUserMqttRmsg(userMqttRmsg);
    }

    /**
     * 批量删除mqtt接收测试
     * 
     * @param ids 需要删除的mqtt接收测试主键
     * @return 结果
     */
    @Override
    public int deleteUserMqttRmsgByIds(Long[] ids)
    {
        return userMqttRmsgMapper.deleteUserMqttRmsgByIds(ids);
    }

    /**
     * 删除mqtt接收测试信息
     * 
     * @param id mqtt接收测试主键
     * @return 结果
     */
    @Override
    public int deleteUserMqttRmsgById(Long id)
    {
        return userMqttRmsgMapper.deleteUserMqttRmsgById(id);
    }
}
