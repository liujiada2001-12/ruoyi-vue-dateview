package com.ruoyi.date.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.date.domain.UserDateCategory;
import com.ruoyi.date.service.IUserDateCategoryService;
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
import com.ruoyi.date.domain.UserDateMsgAve;
import com.ruoyi.date.service.IUserDateMsgAveService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 最新平均值Controller
 * 
 * @author 1
 * @date 2024-02-29
 */
@RestController
@RequestMapping("/date/statistics")
public class UserDateMsgAveController extends BaseController
{
    @Autowired
    private IUserDateMsgAveService userDateMsgAveService;
    @Autowired
    private IUserDateCategoryService userDateCategoryService;

    /**
     * 查询所有平均值列表
     */
    @PreAuthorize("@ss.hasPermi('date:statistics:listALL')")
    @GetMapping("/listALL")
    public TableDataInfo listALL(UserDateMsgAve userDateMsgAve)
    {
        startPage();
        List<UserDateMsgAve> list = userDateMsgAveService.selectUserDateMsgAveList(null);
        return getDataTable(list);
    }

    /**
     * 查询最新平均值列表
     */
    @PreAuthorize("@ss.hasPermi('date:statistics:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserDateMsgAve userDateMsgAve)
    {
        startPage();
        List<UserDateMsgAve> list = userDateMsgAveService.selectUserDateMsgAveList(userDateMsgAve);
        if(list.size() > 0)
        {
            list.forEach(item -> {
                Long ValueCategory = item.getValueCategory();
                UserDateCategory userDateCategory = userDateCategoryService.selectUserDateCategoryById(ValueCategory);
                if(userDateCategory != null)
                {
                    item.setdateCategoryName(userDateCategory.getCategoryName());
                }
            });
        }
        return getDataTable(list);
    }

    /**
     * 导出最新平均值列表
     */
    @PreAuthorize("@ss.hasPermi('date:statistics:export')")
    @Log(title = "最新平均值", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserDateMsgAve userDateMsgAve)
    {
        List<UserDateMsgAve> list = userDateMsgAveService.selectUserDateMsgAveList(userDateMsgAve);
        ExcelUtil<UserDateMsgAve> util = new ExcelUtil<UserDateMsgAve>(UserDateMsgAve.class);
        util.exportExcel(response, list, "最新平均值数据");
    }

    /**
     * 获取最新平均值详细信息
     */
    @PreAuthorize("@ss.hasPermi('date:statistics:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userDateMsgAveService.selectUserDateMsgAveById(id));
    }

    /**
     * 新增最新平均值
     */
    @PreAuthorize("@ss.hasPermi('date:statistics:add')")
    @Log(title = "最新平均值", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserDateMsgAve userDateMsgAve)
    {
        return toAjax(userDateMsgAveService.insertUserDateMsgAve(userDateMsgAve));
    }

    /**
     * 修改最新平均值
     */
    @PreAuthorize("@ss.hasPermi('date:statistics:edit')")
    @Log(title = "最新平均值", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserDateMsgAve userDateMsgAve)
    {
        return toAjax(userDateMsgAveService.updateUserDateMsgAve(userDateMsgAve));
    }

    /**
     * 删除最新平均值
     */
    @PreAuthorize("@ss.hasPermi('date:statistics:remove')")
    @Log(title = "最新平均值", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userDateMsgAveService.deleteUserDateMsgAveByIds(ids));
    }
}
