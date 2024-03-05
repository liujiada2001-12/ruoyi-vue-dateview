package com.ruoyi.date.service;

import java.util.List;
import com.ruoyi.date.domain.UserDateMsg;

/**
 * 数据汇总Service接口
 * 
 * @author 1
 * @date 2024-02-29
 */
public interface IUserDateMsgService 
{
    /**
     * 查询数据汇总
     * 
     * @param id 数据汇总主键
     * @return 数据汇总
     */
    public UserDateMsg selectUserDateMsgById(Long id);

    /**
     * 查询数据汇总列表
     * 
     * @param userDateMsg 数据汇总
     * @return 数据汇总集合
     */
    public List<UserDateMsg> selectUserDateMsgList(UserDateMsg userDateMsg);

    /**
     * 新增数据汇总
     * 
     * @param userDateMsg 数据汇总
     * @return 结果
     */
    public int insertUserDateMsg(UserDateMsg userDateMsg);

    /**
     * 修改数据汇总
     * 
     * @param userDateMsg 数据汇总
     * @return 结果
     */
    public int updateUserDateMsg(UserDateMsg userDateMsg);

    /**
     * 批量删除数据汇总
     * 
     * @param ids 需要删除的数据汇总主键集合
     * @return 结果
     */
    public int deleteUserDateMsgByIds(Long[] ids);

    /**
     * 删除数据汇总信息
     * 
     * @param id 数据汇总主键
     * @return 结果
     */
    public int deleteUserDateMsgById(Long id);
}
