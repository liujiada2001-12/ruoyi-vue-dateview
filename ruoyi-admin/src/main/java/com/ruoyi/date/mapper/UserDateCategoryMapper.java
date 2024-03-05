package com.ruoyi.date.mapper;

import java.util.List;
import com.ruoyi.date.domain.UserDateCategory;

/**
 * 数据分类Mapper接口
 * 
 * @author 1
 * @date 2024-02-29
 */
public interface UserDateCategoryMapper 
{
    /**
     * 查询数据分类
     * 
     * @param id 数据分类主键
     * @return 数据分类
     */
    public UserDateCategory selectUserDateCategoryById(Long id);

    /**
     * 查询数据分类列表
     * 
     * @param userDateCategory 数据分类
     * @return 数据分类集合
     */
    public List<UserDateCategory> selectUserDateCategoryList(UserDateCategory userDateCategory);

    /**
     * 新增数据分类
     * 
     * @param userDateCategory 数据分类
     * @return 结果
     */
    public int insertUserDateCategory(UserDateCategory userDateCategory);

    /**
     * 修改数据分类
     * 
     * @param userDateCategory 数据分类
     * @return 结果
     */
    public int updateUserDateCategory(UserDateCategory userDateCategory);

    /**
     * 删除数据分类
     * 
     * @param id 数据分类主键
     * @return 结果
     */
    public int deleteUserDateCategoryById(Long id);

    /**
     * 批量删除数据分类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserDateCategoryByIds(Long[] ids);
}
