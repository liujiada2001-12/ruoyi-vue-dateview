package com.ruoyi.device.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.device.mapper.UserDeviceStatusMapper;
import com.ruoyi.device.domain.UserDeviceStatus;
import com.ruoyi.device.service.IUserDeviceStatusService;

/**
 * 设备状态Service业务层处理
 * 
 * @author 1
 * @date 2024-02-27
 */
@Service
public class UserDeviceStatusServiceImpl implements IUserDeviceStatusService 
{
    @Autowired
    private UserDeviceStatusMapper userDeviceStatusMapper;

    /**
     * 查询设备状态
     * 
     * @param id 设备状态主键
     * @return 设备状态
     */
    @Override
    public UserDeviceStatus selectUserDeviceStatusById(Long id)
    {
        return userDeviceStatusMapper.selectUserDeviceStatusById(id);
    }

    /**
     * 查询设备状态列表
     * 
     * @param userDeviceStatus 设备状态
     * @return 设备状态
     */
    @Override
    public List<UserDeviceStatus> selectUserDeviceStatusList(UserDeviceStatus userDeviceStatus)
    {
        return userDeviceStatusMapper.selectUserDeviceStatusList(userDeviceStatus);
    }

    /**
     * 新增设备状态
     * 
     * @param userDeviceStatus 设备状态
     * @return 结果
     */
    @Override
    public int insertUserDeviceStatus(UserDeviceStatus userDeviceStatus)
    {
        userDeviceStatus.setCreateTime(DateUtils.getNowDate());
        return userDeviceStatusMapper.insertUserDeviceStatus(userDeviceStatus);
    }

    /**
     * 修改设备状态
     * 
     * @param userDeviceStatus 设备状态
     * @return 结果
     */
    @Override
    public int updateUserDeviceStatus(UserDeviceStatus userDeviceStatus)
    {
        userDeviceStatus.setUpdateTime(DateUtils.getNowDate());
        return userDeviceStatusMapper.updateUserDeviceStatus(userDeviceStatus);
    }

    /**
     * 批量删除设备状态
     * 
     * @param ids 需要删除的设备状态主键
     * @return 结果
     */
    @Override
    public int deleteUserDeviceStatusByIds(Long[] ids)
    {
        return userDeviceStatusMapper.deleteUserDeviceStatusByIds(ids);
    }

    /**
     * 删除设备状态信息
     * 
     * @param id 设备状态主键
     * @return 结果
     */
    @Override
    public int deleteUserDeviceStatusById(Long id)
    {
        return userDeviceStatusMapper.deleteUserDeviceStatusById(id);
    }
}
