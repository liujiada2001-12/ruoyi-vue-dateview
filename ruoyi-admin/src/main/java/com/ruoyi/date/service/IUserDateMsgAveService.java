package com.ruoyi.date.service;

import java.util.List;
import com.ruoyi.date.domain.UserDateMsgAve;

/**
 * 最新平均值Service接口
 * 
 * @author 1
 * @date 2024-02-29
 */
public interface IUserDateMsgAveService 
{
    /**
     * 查询最新平均值
     * 
     * @param id 最新平均值主键
     * @return 最新平均值
     */
    public UserDateMsgAve selectUserDateMsgAveById(Long id);

    /**
     * 查询最新平均值列表
     * 
     * @param userDateMsgAve 最新平均值
     * @return 最新平均值集合
     */
    public List<UserDateMsgAve> selectUserDateMsgAveList(UserDateMsgAve userDateMsgAve);

    /**
     * 新增最新平均值
     * 
     * @param userDateMsgAve 最新平均值
     * @return 结果
     */
    public int insertUserDateMsgAve(UserDateMsgAve userDateMsgAve);

    /**
     * 修改最新平均值
     * 
     * @param userDateMsgAve 最新平均值
     * @return 结果
     */
    public int updateUserDateMsgAve(UserDateMsgAve userDateMsgAve);

    /**
     * 批量删除最新平均值
     * 
     * @param ids 需要删除的最新平均值主键集合
     * @return 结果
     */
    public int deleteUserDateMsgAveByIds(Long[] ids);

    /**
     * 删除最新平均值信息
     * 
     * @param id 最新平均值主键
     * @return 结果
     */
    public int deleteUserDateMsgAveById(Long id);
}
