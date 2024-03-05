package com.ruoyi.device.service;

import java.util.List;
import com.ruoyi.device.domain.UserDeviceMsg;

/**
 * 设备信息Service接口
 * 
 * @author 1
 * @date 2024-02-29
 */
public interface IUserDeviceMsgService 
{
    /**
     * 查询设备信息
     * 
     * @param id 设备信息主键
     * @return 设备信息
     */
    public UserDeviceMsg selectUserDeviceMsgById(Long id);

    /**
     * 查询设备信息列表
     * 
     * @param userDeviceMsg 设备信息
     * @return 设备信息集合
     */
    public List<UserDeviceMsg> selectUserDeviceMsgList(UserDeviceMsg userDeviceMsg);

    /**
     * 新增设备信息
     * 
     * @param userDeviceMsg 设备信息
     * @return 结果
     */
    public int insertUserDeviceMsg(UserDeviceMsg userDeviceMsg);

    /**
     * 修改设备信息
     * 
     * @param userDeviceMsg 设备信息
     * @return 结果
     */
    public int updateUserDeviceMsg(UserDeviceMsg userDeviceMsg);

    /**
     * 批量删除设备信息
     * 
     * @param ids 需要删除的设备信息主键集合
     * @return 结果
     */
    public int deleteUserDeviceMsgByIds(Long[] ids);

    /**
     * 删除设备信息信息
     * 
     * @param id 设备信息主键
     * @return 结果
     */
    public int deleteUserDeviceMsgById(Long id);
}
