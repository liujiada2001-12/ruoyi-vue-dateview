package com.ruoyi.device.service;

import java.util.List;
import com.ruoyi.device.domain.UserDeviceCategory;

/**
 * 设备分类Service接口
 * 
 * @author 1
 * @date 2024-02-27
 */
public interface IUserDeviceCategoryService 
{
    /**
     * 查询设备分类
     * 
     * @param id 设备分类主键
     * @return 设备分类
     */
    public UserDeviceCategory selectUserDeviceCategoryById(Long id);

    /**
     * 查询设备分类列表
     * 
     * @param userDeviceCategory 设备分类
     * @return 设备分类集合
     */
    public List<UserDeviceCategory> selectUserDeviceCategoryList(UserDeviceCategory userDeviceCategory);

    /**
     * 新增设备分类
     * 
     * @param userDeviceCategory 设备分类
     * @return 结果
     */
    public int insertUserDeviceCategory(UserDeviceCategory userDeviceCategory);

    /**
     * 修改设备分类
     * 
     * @param userDeviceCategory 设备分类
     * @return 结果
     */
    public int updateUserDeviceCategory(UserDeviceCategory userDeviceCategory);

    /**
     * 批量删除设备分类
     * 
     * @param ids 需要删除的设备分类主键集合
     * @return 结果
     */
    public int deleteUserDeviceCategoryByIds(Long[] ids);

    /**
     * 删除设备分类信息
     * 
     * @param id 设备分类主键
     * @return 结果
     */
    public int deleteUserDeviceCategoryById(Long id);
}
