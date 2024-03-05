package com.ruoyi.date.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.date.mapper.UserDateHistoryMapper;
import com.ruoyi.date.domain.UserDateHistory;
import com.ruoyi.date.service.IUserDateHistoryService;

/**
 * 历史数据Service业务层处理
 * 
 * @author 1
 * @date 2024-03-04
 */
@Service
public class UserDateHistoryServiceImpl implements IUserDateHistoryService 
{
    @Autowired
    private UserDateHistoryMapper userDateHistoryMapper;

    /**
     * 查询历史数据
     * 
     * @param time 历史数据主键
     * @return 历史数据
     */
    @Override
    public UserDateHistory selectUserDateHistoryByTime(String time)
    {
        return userDateHistoryMapper.selectUserDateHistoryByTime(time);
    }

    /**
     * 查询历史数据列表
     * 
     * @param userDateHistory 历史数据
     * @return 历史数据
     */
    @Override
    public List<UserDateHistory> selectUserDateHistoryList(UserDateHistory userDateHistory)
    {
        return userDateHistoryMapper.selectUserDateHistoryList(userDateHistory);
    }

    /**
     * 新增历史数据
     * 
     * @param userDateHistory 历史数据
     * @return 结果
     */
    @Override
    public int insertUserDateHistory(UserDateHistory userDateHistory)
    {
        return userDateHistoryMapper.insertUserDateHistory(userDateHistory);
    }

    /**
     * 修改历史数据
     * 
     * @param userDateHistory 历史数据
     * @return 结果
     */
    @Override
    public int updateUserDateHistory(UserDateHistory userDateHistory)
    {
        return userDateHistoryMapper.updateUserDateHistory(userDateHistory);
    }

    /**
     * 批量删除历史数据
     * 
     * @param times 需要删除的历史数据主键
     * @return 结果
     */
    @Override
    public int deleteUserDateHistoryByTimes(String[] times)
    {
        return userDateHistoryMapper.deleteUserDateHistoryByTimes(times);
    }

    /**
     * 删除历史数据信息
     * 
     * @param time 历史数据主键
     * @return 结果
     */
    @Override
    public int deleteUserDateHistoryByTime(String time)
    {
        return userDateHistoryMapper.deleteUserDateHistoryByTime(time);
    }
}
