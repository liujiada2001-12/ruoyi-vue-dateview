package com.ruoyi.date.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.date.mapper.UserDateMsgMapper;
import com.ruoyi.date.domain.UserDateMsg;
import com.ruoyi.date.service.IUserDateMsgService;

/**
 * 数据汇总Service业务层处理
 * 
 * @author 1
 * @date 2024-02-29
 */
@Service
public class UserDateMsgServiceImpl implements IUserDateMsgService 
{
    @Autowired
    private UserDateMsgMapper userDateMsgMapper;

    /**
     * 查询数据汇总
     * 
     * @param id 数据汇总主键
     * @return 数据汇总
     */
    @Override
    public UserDateMsg selectUserDateMsgById(Long id)
    {
        return userDateMsgMapper.selectUserDateMsgById(id);
    }

    /**
     * 查询数据汇总列表
     * 
     * @param userDateMsg 数据汇总
     * @return 数据汇总
     */
    @Override
    public List<UserDateMsg> selectUserDateMsgList(UserDateMsg userDateMsg)
    {
        return userDateMsgMapper.selectUserDateMsgList(userDateMsg);
    }

    /**
     * 新增数据汇总
     * 
     * @param userDateMsg 数据汇总
     * @return 结果
     */
    @Override
    public int insertUserDateMsg(UserDateMsg userDateMsg)
    {
        userDateMsg.setCreateTime(DateUtils.getNowDate());
        String Sitecode="0000"+userDateMsg.getSiteCode();
        String Category="000"+userDateMsg.getDateCategory();
        int size1=Sitecode.length();
        int size2=Category.length();
        String number=Sitecode.substring(size1-4,size1)+Category.substring(size2-2,size2)+""+DateUtils.dateTimeNow().substring(0,12);
        userDateMsg.setNumber(number);



        return userDateMsgMapper.insertUserDateMsg(userDateMsg);
    }

    /**
     * 修改数据汇总
     * 
     * @param userDateMsg 数据汇总
     * @return 结果
     */
    @Override
    public int updateUserDateMsg(UserDateMsg userDateMsg)
    {
        userDateMsg.setUpdateTime(DateUtils.getNowDate());
        return userDateMsgMapper.updateUserDateMsg(userDateMsg);
    }

    /**
     * 批量删除数据汇总
     * 
     * @param ids 需要删除的数据汇总主键
     * @return 结果
     */
    @Override
    public int deleteUserDateMsgByIds(Long[] ids)
    {
        return userDateMsgMapper.deleteUserDateMsgByIds(ids);
    }

    /**
     * 删除数据汇总信息
     * 
     * @param id 数据汇总主键
     * @return 结果
     */
    @Override
    public int deleteUserDateMsgById(Long id)
    {
        return userDateMsgMapper.deleteUserDateMsgById(id);
    }
}
