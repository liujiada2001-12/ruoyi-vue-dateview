package com.ruoyi.device.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.device.mapper.UserDeviceCategoryMapper;
import com.ruoyi.device.domain.UserDeviceCategory;
import com.ruoyi.device.service.IUserDeviceCategoryService;

/**
 * 设备分类Service业务层处理
 * 
 * @author 1
 * @date 2024-02-27
 */
@Service
public class UserDeviceCategoryServiceImpl implements IUserDeviceCategoryService 
{
    @Autowired
    private UserDeviceCategoryMapper userDeviceCategoryMapper;

    /**
     * 查询设备分类
     * 
     * @param id 设备分类主键
     * @return 设备分类
     */
    @Override
    public UserDeviceCategory selectUserDeviceCategoryById(Long id)
    {
        return userDeviceCategoryMapper.selectUserDeviceCategoryById(id);
    }

    /**
     * 查询设备分类列表
     * 
     * @param userDeviceCategory 设备分类
     * @return 设备分类
     */
    @Override
    public List<UserDeviceCategory> selectUserDeviceCategoryList(UserDeviceCategory userDeviceCategory)
    {
        return userDeviceCategoryMapper.selectUserDeviceCategoryList(userDeviceCategory);
    }

    /**
     * 新增设备分类
     * 
     * @param userDeviceCategory 设备分类
     * @return 结果
     */
    @Override
    public int insertUserDeviceCategory(UserDeviceCategory userDeviceCategory)
    {
        userDeviceCategory.setCreateTime(DateUtils.getNowDate());
        return userDeviceCategoryMapper.insertUserDeviceCategory(userDeviceCategory);
    }

    /**
     * 修改设备分类
     * 
     * @param userDeviceCategory 设备分类
     * @return 结果
     */
    @Override
    public int updateUserDeviceCategory(UserDeviceCategory userDeviceCategory)
    {
        return userDeviceCategoryMapper.updateUserDeviceCategory(userDeviceCategory);
    }

    /**
     * 批量删除设备分类
     * 
     * @param ids 需要删除的设备分类主键
     * @return 结果
     */
    @Override
    public int deleteUserDeviceCategoryByIds(Long[] ids)
    {
        return userDeviceCategoryMapper.deleteUserDeviceCategoryByIds(ids);
    }

    /**
     * 删除设备分类信息
     * 
     * @param id 设备分类主键
     * @return 结果
     */
    @Override
    public int deleteUserDeviceCategoryById(Long id)
    {
        return userDeviceCategoryMapper.deleteUserDeviceCategoryById(id);
    }
}
