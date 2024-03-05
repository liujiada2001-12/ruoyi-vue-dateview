package com.ruoyi.date.mapper;

import java.util.List;
import com.ruoyi.date.domain.UserDateHistory;

/**
 * 历史数据Mapper接口
 * 
 * @author 1
 * @date 2024-03-04
 */
public interface UserDateHistoryMapper 
{
    /**
     * 查询历史数据
     * 
     * @param time 历史数据主键
     * @return 历史数据
     */
    public UserDateHistory selectUserDateHistoryByTime(String time);

    /**
     * 查询历史数据列表
     * 
     * @param userDateHistory 历史数据
     * @return 历史数据集合
     */
    public List<UserDateHistory> selectUserDateHistoryList(UserDateHistory userDateHistory);

    /**
     * 新增历史数据
     * 
     * @param userDateHistory 历史数据
     * @return 结果
     */
    public int insertUserDateHistory(UserDateHistory userDateHistory);

    /**
     * 修改历史数据
     * 
     * @param userDateHistory 历史数据
     * @return 结果
     */
    public int updateUserDateHistory(UserDateHistory userDateHistory);

    /**
     * 删除历史数据
     * 
     * @param time 历史数据主键
     * @return 结果
     */
    public int deleteUserDateHistoryByTime(String time);

    /**
     * 批量删除历史数据
     * 
     * @param times 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserDateHistoryByTimes(String[] times);
}
