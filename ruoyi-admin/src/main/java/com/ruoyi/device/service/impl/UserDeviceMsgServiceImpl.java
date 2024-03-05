package com.ruoyi.device.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.device.mapper.UserDeviceMsgMapper;
import com.ruoyi.device.domain.UserDeviceMsg;
import com.ruoyi.device.service.IUserDeviceMsgService;

/**
 * 设备信息Service业务层处理
 * 
 * @author 1
 * @date 2024-02-29
 */
@Service
public class UserDeviceMsgServiceImpl implements IUserDeviceMsgService 
{
    @Autowired
    private UserDeviceMsgMapper userDeviceMsgMapper;

    /**
     * 查询设备信息
     * 
     * @param id 设备信息主键
     * @return 设备信息
     */
    @Override
    public UserDeviceMsg selectUserDeviceMsgById(Long id)
    {
        return userDeviceMsgMapper.selectUserDeviceMsgById(id);
    }

    /**
     * 查询设备信息列表
     * 
     * @param userDeviceMsg 设备信息
     * @return 设备信息
     */
    @Override
    public List<UserDeviceMsg> selectUserDeviceMsgList(UserDeviceMsg userDeviceMsg)
    {
        return userDeviceMsgMapper.selectUserDeviceMsgList(userDeviceMsg);
    }

    /**
     * 新增设备信息
     * 
     * @param userDeviceMsg 设备信息
     * @return 结果
     */
    @Override
    public int insertUserDeviceMsg(UserDeviceMsg userDeviceMsg)
    {
        userDeviceMsg.setCreateTime(DateUtils.getNowDate());
        return userDeviceMsgMapper.insertUserDeviceMsg(userDeviceMsg);
    }

    /**
     * 修改设备信息
     * 
     * @param userDeviceMsg 设备信息
     * @return 结果
     */
    @Override
    public int updateUserDeviceMsg(UserDeviceMsg userDeviceMsg)
    {
        return userDeviceMsgMapper.updateUserDeviceMsg(userDeviceMsg);
    }

    /**
     * 批量删除设备信息
     * 
     * @param ids 需要删除的设备信息主键
     * @return 结果
     */
    @Override
    public int deleteUserDeviceMsgByIds(Long[] ids)
    {
        return userDeviceMsgMapper.deleteUserDeviceMsgByIds(ids);
    }

    /**
     * 删除设备信息信息
     * 
     * @param id 设备信息主键
     * @return 结果
     */
    @Override
    public int deleteUserDeviceMsgById(Long id)
    {
        return userDeviceMsgMapper.deleteUserDeviceMsgById(id);
    }
}
