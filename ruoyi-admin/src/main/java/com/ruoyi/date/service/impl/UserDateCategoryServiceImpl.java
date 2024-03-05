package com.ruoyi.date.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.date.mapper.UserDateCategoryMapper;
import com.ruoyi.date.domain.UserDateCategory;
import com.ruoyi.date.service.IUserDateCategoryService;

/**
 * 数据分类Service业务层处理
 * 
 * @author 1
 * @date 2024-02-29
 */
@Service
public class UserDateCategoryServiceImpl implements IUserDateCategoryService 
{
    @Autowired
    private UserDateCategoryMapper userDateCategoryMapper;

    /**
     * 查询数据分类
     * 
     * @param id 数据分类主键
     * @return 数据分类
     */
    @Override
    public UserDateCategory selectUserDateCategoryById(Long id)
    {
        return userDateCategoryMapper.selectUserDateCategoryById(id);
    }

    /**
     * 查询数据分类列表
     * 
     * @param userDateCategory 数据分类
     * @return 数据分类
     */
    @Override
    public List<UserDateCategory> selectUserDateCategoryList(UserDateCategory userDateCategory)
    {
        return userDateCategoryMapper.selectUserDateCategoryList(userDateCategory);
    }

    /**
     * 新增数据分类
     * 
     * @param userDateCategory 数据分类
     * @return 结果
     */
    @Override
    public int insertUserDateCategory(UserDateCategory userDateCategory)
    {
        userDateCategory.setCreateTime(DateUtils.getNowDate());
        return userDateCategoryMapper.insertUserDateCategory(userDateCategory);
    }

    /**
     * 修改数据分类
     * 
     * @param userDateCategory 数据分类
     * @return 结果
     */
    @Override
    public int updateUserDateCategory(UserDateCategory userDateCategory)
    {
        userDateCategory.setUpdateTime(DateUtils.getNowDate());
        return userDateCategoryMapper.updateUserDateCategory(userDateCategory);
    }

    /**
     * 批量删除数据分类
     * 
     * @param ids 需要删除的数据分类主键
     * @return 结果
     */
    @Override
    public int deleteUserDateCategoryByIds(Long[] ids)
    {
        return userDateCategoryMapper.deleteUserDateCategoryByIds(ids);
    }

    /**
     * 删除数据分类信息
     * 
     * @param id 数据分类主键
     * @return 结果
     */
    @Override
    public int deleteUserDateCategoryById(Long id)
    {
        return userDateCategoryMapper.deleteUserDateCategoryById(id);
    }
}
