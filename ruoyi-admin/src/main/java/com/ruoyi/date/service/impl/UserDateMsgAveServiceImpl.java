package com.ruoyi.date.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.date.mapper.UserDateMsgAveMapper;
import com.ruoyi.date.domain.UserDateMsgAve;
import com.ruoyi.date.service.IUserDateMsgAveService;

/**
 * 最新平均值Service业务层处理
 * 
 * @author 1
 * @date 2024-02-29
 */
@Service
public class UserDateMsgAveServiceImpl implements IUserDateMsgAveService 
{
    @Autowired
    private UserDateMsgAveMapper userDateMsgAveMapper;

    /**
     * 查询最新平均值
     * 
     * @param id 最新平均值主键
     * @return 最新平均值
     */
    @Override
    public UserDateMsgAve selectUserDateMsgAveById(Long id)
    {
        return userDateMsgAveMapper.selectUserDateMsgAveById(id);
    }

    /**
     * 查询最新平均值列表
     * 
     * @param userDateMsgAve 最新平均值
     * @return 最新平均值
     */
    @Override
    public List<UserDateMsgAve> selectUserDateMsgAveList(UserDateMsgAve userDateMsgAve)
    {
        return userDateMsgAveMapper.selectUserDateMsgAveList(userDateMsgAve);
    }

    /**
     * 新增最新平均值
     * 
     * @param userDateMsgAve 最新平均值
     * @return 结果
     */
    @Override
    public int insertUserDateMsgAve(UserDateMsgAve userDateMsgAve)
    {
        userDateMsgAve.setCreateTime(DateUtils.getNowDate());
        return userDateMsgAveMapper.insertUserDateMsgAve(userDateMsgAve);
    }

    /**
     * 修改最新平均值
     * 
     * @param userDateMsgAve 最新平均值
     * @return 结果
     */
    @Override
    public int updateUserDateMsgAve(UserDateMsgAve userDateMsgAve)
    {
        userDateMsgAve.setUpdateTime(DateUtils.getNowDate());
        return userDateMsgAveMapper.updateUserDateMsgAve(userDateMsgAve);
    }

    /**
     * 批量删除最新平均值
     * 
     * @param ids 需要删除的最新平均值主键
     * @return 结果
     */
    @Override
    public int deleteUserDateMsgAveByIds(Long[] ids)
    {
        return userDateMsgAveMapper.deleteUserDateMsgAveByIds(ids);
    }

    /**
     * 删除最新平均值信息
     * 
     * @param id 最新平均值主键
     * @return 结果
     */
    @Override
    public int deleteUserDateMsgAveById(Long id)
    {
        return userDateMsgAveMapper.deleteUserDateMsgAveById(id);
    }
}
