package com.ruoyi.date.service;

import java.util.List;
import com.ruoyi.date.domain.UserDateAvgSum;

/**
 * 平均值Service接口
 * 
 * @author 1
 * @date 2024-02-29
 */
public interface IUserDateAvgSumService 
{
    /**
     * 查询平均值
     * 
     * @param cType 平均值主键
     * @return 平均值
     */
    public UserDateAvgSum selectUserDateAvgSumByCType(String cType);

    /**
     * 查询平均值列表
     * 
     * @param userDateAvgSum 平均值
     * @return 平均值集合
     */
    public List<UserDateAvgSum> selectUserDateAvgSumList(UserDateAvgSum userDateAvgSum);

    /**
     * 新增平均值
     * 
     * @param userDateAvgSum 平均值
     * @return 结果
     */
    public int insertUserDateAvgSum(UserDateAvgSum userDateAvgSum);

    /**
     * 修改平均值
     * 
     * @param userDateAvgSum 平均值
     * @return 结果
     */
    public int updateUserDateAvgSum(UserDateAvgSum userDateAvgSum);

    /**
     * 批量删除平均值
     * 
     * @param cTypes 需要删除的平均值主键集合
     * @return 结果
     */
    public int deleteUserDateAvgSumByCTypes(String[] cTypes);

    /**
     * 删除平均值信息
     * 
     * @param cType 平均值主键
     * @return 结果
     */
    public int deleteUserDateAvgSumByCType(String cType);
}
