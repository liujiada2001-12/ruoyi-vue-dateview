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
import com.ruoyi.date.domain.UserDateHistory;
import com.ruoyi.date.service.IUserDateHistoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 历史数据Controller
 * 
 * @author 1
 * @date 2024-03-04
 */
@RestController
@RequestMapping("/date/history")
public class UserDateHistoryController extends BaseController
{
    @Autowired
    private IUserDateHistoryService userDateHistoryService;

    /**
     * 查询所有历史数据列表
     */
    @PreAuthorize("@ss.hasPermi('date:history:listALL')")
    @GetMapping("/listALL")
    public TableDataInfo listALL(UserDateHistory userDateHistory)
    {
        startPage();
        List<UserDateHistory> list = userDateHistoryService.selectUserDateHistoryList(null);
        return getDataTable(list);
    }

    /**
     * 查询历史数据列表
     */
    @PreAuthorize("@ss.hasPermi('date:history:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserDateHistory userDateHistory)
    {
        startPage();
        List<UserDateHistory> list = userDateHistoryService.selectUserDateHistoryList(userDateHistory);
        return getDataTable(list);
    }

    /**
     * 导出历史数据列表
     */
    @PreAuthorize("@ss.hasPermi('date:history:export')")
    @Log(title = "历史数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserDateHistory userDateHistory)
    {
        List<UserDateHistory> list = userDateHistoryService.selectUserDateHistoryList(userDateHistory);
        ExcelUtil<UserDateHistory> util = new ExcelUtil<UserDateHistory>(UserDateHistory.class);
        util.exportExcel(response, list, "历史数据数据");
    }

    /**
     * 获取历史数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('date:history:query')")
    @GetMapping(value = "/{time}")
    public AjaxResult getInfo(@PathVariable("time") String time)
    {
        return success(userDateHistoryService.selectUserDateHistoryByTime(time));
    }

    /**
     * 新增历史数据
     */
    @PreAuthorize("@ss.hasPermi('date:history:add')")
    @Log(title = "历史数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserDateHistory userDateHistory)
    {
        return toAjax(userDateHistoryService.insertUserDateHistory(userDateHistory));
    }

    /**
     * 修改历史数据
     */
    @PreAuthorize("@ss.hasPermi('date:history:edit')")
    @Log(title = "历史数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserDateHistory userDateHistory)
    {
        return toAjax(userDateHistoryService.updateUserDateHistory(userDateHistory));
    }

    /**
     * 删除历史数据
     */
    @PreAuthorize("@ss.hasPermi('date:history:remove')")
    @Log(title = "历史数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{times}")
    public AjaxResult remove(@PathVariable String[] times)
    {
        return toAjax(userDateHistoryService.deleteUserDateHistoryByTimes(times));
    }
}
