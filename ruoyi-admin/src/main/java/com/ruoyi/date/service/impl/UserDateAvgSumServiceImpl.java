package com.ruoyi.date.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.date.mapper.UserDateAvgSumMapper;
import com.ruoyi.date.domain.UserDateAvgSum;
import com.ruoyi.date.service.IUserDateAvgSumService;

/**
 * 平均值Service业务层处理
 * 
 * @author 1
 * @date 2024-02-29
 */
@Service
public class UserDateAvgSumServiceImpl implements IUserDateAvgSumService 
{
    @Autowired
    private UserDateAvgSumMapper userDateAvgSumMapper;

    /**
     * 查询平均值
     * 
     * @param cType 平均值主键
     * @return 平均值
     */
    @Override
    public UserDateAvgSum selectUserDateAvgSumByCType(String cType)
    {
        return userDateAvgSumMapper.selectUserDateAvgSumByCType(cType);
    }

    /**
     * 查询平均值列表
     * 
     * @param userDateAvgSum 平均值
     * @return 平均值
     */
    @Override
    public List<UserDateAvgSum> selectUserDateAvgSumList(UserDateAvgSum userDateAvgSum)
    {
        return userDateAvgSumMapper.selectUserDateAvgSumList(userDateAvgSum);
    }

    /**
     * 新增平均值
     * 
     * @param userDateAvgSum 平均值
     * @return 结果
     */
    @Override
    public int insertUserDateAvgSum(UserDateAvgSum userDateAvgSum)
    {
        return userDateAvgSumMapper.insertUserDateAvgSum(userDateAvgSum);
    }

    /**
     * 修改平均值
     * 
     * @param userDateAvgSum 平均值
     * @return 结果
     */
    @Override
    public int updateUserDateAvgSum(UserDateAvgSum userDateAvgSum)
    {
        return userDateAvgSumMapper.updateUserDateAvgSum(userDateAvgSum);
    }

    /**
     * 批量删除平均值
     * 
     * @param cTypes 需要删除的平均值主键
     * @return 结果
     */
    @Override
    public int deleteUserDateAvgSumByCTypes(String[] cTypes)
    {
        return userDateAvgSumMapper.deleteUserDateAvgSumByCTypes(cTypes);
    }

    /**
     * 删除平均值信息
     * 
     * @param cType 平均值主键
     * @return 结果
     */
    @Override
    public int deleteUserDateAvgSumByCType(String cType)
    {
        return userDateAvgSumMapper.deleteUserDateAvgSumByCType(cType);
    }
}
