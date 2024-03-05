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
import com.ruoyi.date.domain.UserDateAvgSum;
import com.ruoyi.date.service.IUserDateAvgSumService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 平均值Controller
 * 
 * @author 1
 * @date 2024-02-29
 */
@RestController
@RequestMapping("/date/ave_record")
public class UserDateAvgSumController extends BaseController
{
    @Autowired
    private IUserDateAvgSumService userDateAvgSumService;

    /**
     * 查询平均值列表
     */
    @PreAuthorize("@ss.hasPermi('date:ave_record:listALL')")
    @GetMapping("/listALL")
    public TableDataInfo listALL(UserDateAvgSum userDateAvgSum)
    {
        List<UserDateAvgSum> list = userDateAvgSumService.selectUserDateAvgSumList(null);
        return getDataTable(list);
    }

    /**
     * 查询平均值列表
     */
    @PreAuthorize("@ss.hasPermi('date:ave_record:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserDateAvgSum userDateAvgSum)
    {
        startPage();
        List<UserDateAvgSum> list = userDateAvgSumService.selectUserDateAvgSumList(userDateAvgSum);
        return getDataTable(list);
    }

    /**
     * 导出平均值列表
     */
    @PreAuthorize("@ss.hasPermi('date:ave_record:export')")
    @Log(title = "平均值", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserDateAvgSum userDateAvgSum)
    {
        List<UserDateAvgSum> list = userDateAvgSumService.selectUserDateAvgSumList(userDateAvgSum);
        ExcelUtil<UserDateAvgSum> util = new ExcelUtil<UserDateAvgSum>(UserDateAvgSum.class);
        util.exportExcel(response, list, "平均值数据");
    }

    /**
     * 获取平均值详细信息
     */
    @PreAuthorize("@ss.hasPermi('date:ave_record:query')")
    @GetMapping(value = "/{cType}")
    public AjaxResult getInfo(@PathVariable("cType") String cType)
    {
        return success(userDateAvgSumService.selectUserDateAvgSumByCType(cType));
    }

    /**
     * 新增平均值
     */
    @PreAuthorize("@ss.hasPermi('date:ave_record:add')")
    @Log(title = "平均值", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserDateAvgSum userDateAvgSum)
    {
        return toAjax(userDateAvgSumService.insertUserDateAvgSum(userDateAvgSum));
    }

    /**
     * 修改平均值
     */
    @PreAuthorize("@ss.hasPermi('date:ave_record:edit')")
    @Log(title = "平均值", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserDateAvgSum userDateAvgSum)
    {
        return toAjax(userDateAvgSumService.updateUserDateAvgSum(userDateAvgSum));
    }

    /**
     * 删除平均值
     */
    @PreAuthorize("@ss.hasPermi('date:ave_record:remove')")
    @Log(title = "平均值", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cTypes}")
    public AjaxResult remove(@PathVariable String[] cTypes)
    {
        return toAjax(userDateAvgSumService.deleteUserDateAvgSumByCTypes(cTypes));
    }
}
