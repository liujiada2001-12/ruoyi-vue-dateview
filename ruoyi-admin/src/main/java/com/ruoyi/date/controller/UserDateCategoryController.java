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
import com.ruoyi.date.domain.UserDateCategory;
import com.ruoyi.date.service.IUserDateCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据分类Controller
 * 
 * @author 1
 * @date 2024-02-29
 */
@RestController
@RequestMapping("/date/category")
public class UserDateCategoryController extends BaseController
{
    @Autowired
    private IUserDateCategoryService userDateCategoryService;

    /**
     * 查询数据分类列表
     */
    @PreAuthorize("@ss.hasPermi('date:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserDateCategory userDateCategory)
    {
        startPage();
        List<UserDateCategory> list = userDateCategoryService.selectUserDateCategoryList(userDateCategory);
        return getDataTable(list);
    }

    /**
     * 导出数据分类列表
     */
    @PreAuthorize("@ss.hasPermi('date:category:export')")
    @Log(title = "数据分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserDateCategory userDateCategory)
    {
        List<UserDateCategory> list = userDateCategoryService.selectUserDateCategoryList(userDateCategory);
        ExcelUtil<UserDateCategory> util = new ExcelUtil<UserDateCategory>(UserDateCategory.class);
        util.exportExcel(response, list, "数据分类数据");
    }

    /**
     * 获取数据分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('date:category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userDateCategoryService.selectUserDateCategoryById(id));
    }

    /**
     * 新增数据分类
     */
    @PreAuthorize("@ss.hasPermi('date:category:add')")
    @Log(title = "数据分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserDateCategory userDateCategory)
    {
        return toAjax(userDateCategoryService.insertUserDateCategory(userDateCategory));
    }

    /**
     * 修改数据分类
     */
    @PreAuthorize("@ss.hasPermi('date:category:edit')")
    @Log(title = "数据分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserDateCategory userDateCategory)
    {
        return toAjax(userDateCategoryService.updateUserDateCategory(userDateCategory));
    }

    /**
     * 删除数据分类
     */
    @PreAuthorize("@ss.hasPermi('date:category:remove')")
    @Log(title = "数据分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userDateCategoryService.deleteUserDateCategoryByIds(ids));
    }
}
