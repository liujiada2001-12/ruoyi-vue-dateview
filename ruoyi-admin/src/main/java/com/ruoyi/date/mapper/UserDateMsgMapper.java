package com.ruoyi.date.mapper;

import java.util.List;
import com.ruoyi.date.domain.UserDateMsg;

/**
 * 数据汇总Mapper接口
 * 
 * @author 1
 * @date 2024-02-29
 */
public interface UserDateMsgMapper 
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
     * 删除数据汇总
     * 
     * @param id 数据汇总主键
     * @return 结果
     */
    public int deleteUserDateMsgById(Long id);

    /**
     * 批量删除数据汇总
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserDateMsgByIds(Long[] ids);
}
