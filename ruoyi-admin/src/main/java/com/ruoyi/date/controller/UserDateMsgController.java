package com.ruoyi.date.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.date.domain.UserDateMsg;
import com.ruoyi.date.service.IUserDateMsgService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据汇总Controller
 * 
 * @author 1
 * @date 2024-02-29
 */
@RestController
@RequestMapping("/date/msg")
public class UserDateMsgController extends BaseController
{
    @Autowired
    private IUserDateMsgService userDateMsgService;

    /**
     * 查询数据汇总列表
     */
    @PreAuthorize("@ss.hasPermi('date:msg:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserDateMsg userDateMsg)
    {
        startPage();
        List<UserDateMsg> list = userDateMsgService.selectUserDateMsgList(userDateMsg);
        return getDataTable(list);
    }

    /**
     * 导出数据汇总列表
     */
    @PreAuthorize("@ss.hasPermi('date:msg:export')")
    @Log(title = "数据汇总", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserDateMsg userDateMsg)
    {
        List<UserDateMsg> list = userDateMsgService.selectUserDateMsgList(userDateMsg);
        ExcelUtil<UserDateMsg> util = new ExcelUtil<UserDateMsg>(UserDateMsg.class);
        util.exportExcel(response, list, "数据汇总数据");
    }

    /**
     * 获取数据汇总详细信息
     */
    @PreAuthorize("@ss.hasPermi('date:msg:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userDateMsgService.selectUserDateMsgById(id));
    }

    /**
     * 新增数据汇总
     */
    @PreAuthorize("@ss.hasPermi('date:msg:add')")
    @Log(title = "数据汇总", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserDateMsg userDateMsg)
    {
        return toAjax(userDateMsgService.insertUserDateMsg(userDateMsg));
    }

    /**
     * 修改数据汇总
     */
    @PreAuthorize("@ss.hasPermi('date:msg:edit')")
    @Log(title = "数据汇总", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserDateMsg userDateMsg)
    {
        return toAjax(userDateMsgService.updateUserDateMsg(userDateMsg));
    }

    /**
     * 删除数据汇总
     */
    @PreAuthorize("@ss.hasPermi('date:msg:remove')")
    @Log(title = "数据汇总", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userDateMsgService.deleteUserDateMsgByIds(ids));
    }
}
