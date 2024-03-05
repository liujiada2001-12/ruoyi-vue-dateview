package com.ruoyi.device.mapper;

import java.util.List;
import com.ruoyi.device.domain.UserDeviceStatus;

/**
 * 设备状态Mapper接口
 * 
 * @author 1
 * @date 2024-02-27
 */
public interface UserDeviceStatusMapper 
{
    /**
     * 查询设备状态
     * 
     * @param id 设备状态主键
     * @return 设备状态
     */
    public UserDeviceStatus selectUserDeviceStatusById(Long id);

    /**
     * 查询设备状态列表
     * 
     * @param userDeviceStatus 设备状态
     * @return 设备状态集合
     */
    public List<UserDeviceStatus> selectUserDeviceStatusList(UserDeviceStatus userDeviceStatus);

    /**
     * 新增设备状态
     * 
     * @param userDeviceStatus 设备状态
     * @return 结果
     */
    public int insertUserDeviceStatus(UserDeviceStatus userDeviceStatus);

    /**
     * 修改设备状态
     * 
     * @param userDeviceStatus 设备状态
     * @return 结果
     */
    public int updateUserDeviceStatus(UserDeviceStatus userDeviceStatus);

    /**
     * 删除设备状态
     * 
     * @param id 设备状态主键
     * @return 结果
     */
    public int deleteUserDeviceStatusById(Long id);

    /**
     * 批量删除设备状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserDeviceStatusByIds(Long[] ids);
}
