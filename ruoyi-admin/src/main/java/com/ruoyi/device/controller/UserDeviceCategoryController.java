package com.ruoyi.device.controller;

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
import com.ruoyi.device.domain.UserDeviceCategory;
import com.ruoyi.device.service.IUserDeviceCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备分类Controller
 * 
 * @author 1
 * @date 2024-02-27
 */
@RestController
@RequestMapping("/device/category")
public class UserDeviceCategoryController extends BaseController
{
    @Autowired
    private IUserDeviceCategoryService userDeviceCategoryService;
    /**
     * 查询所有设备分类列表
     */
    @PreAuthorize("@ss.hasPermi('device:category:listALLCategory')")
    @GetMapping("/listALLCategory")
    public TableDataInfo listALLCategory()
    {
        startPage();
        List<UserDeviceCategory> list = userDeviceCategoryService.selectUserDeviceCategoryList(null);
        return getDataTable(list);
    }
    /**
     * 查询设备分类列表
     */
    @PreAuthorize("@ss.hasPermi('device:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserDeviceCategory userDeviceCategory)
    {
        startPage();
        List<UserDeviceCategory> list = userDeviceCategoryService.selectUserDeviceCategoryList(userDeviceCategory);
        return getDataTable(list);
    }

    /**
     * 导出设备分类列表
     */
    @PreAuthorize("@ss.hasPermi('device:category:export')")
    @Log(title = "设备分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserDeviceCategory userDeviceCategory)
    {
        List<UserDeviceCategory> list = userDeviceCategoryService.selectUserDeviceCategoryList(userDeviceCategory);
        ExcelUtil<UserDeviceCategory> util = new ExcelUtil<UserDeviceCategory>(UserDeviceCategory.class);
        util.exportExcel(response, list, "设备分类数据");
    }

    /**
     * 获取设备分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('device:category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userDeviceCategoryService.selectUserDeviceCategoryById(id));
    }

    /**
     * 新增设备分类
     */
    @PreAuthorize("@ss.hasPermi('device:category:add')")
    @Log(title = "设备分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserDeviceCategory userDeviceCategory)
    {
        return toAjax(userDeviceCategoryService.insertUserDeviceCategory(userDeviceCategory));
    }

    /**
     * 修改设备分类
     */
    @PreAuthorize("@ss.hasPermi('device:category:edit')")
    @Log(title = "设备分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserDeviceCategory userDeviceCategory)
    {
        return toAjax(userDeviceCategoryService.updateUserDeviceCategory(userDeviceCategory));
    }

    /**
     * 删除设备分类
     */
    @PreAuthorize("@ss.hasPermi('device:category:remove')")
    @Log(title = "设备分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userDeviceCategoryService.deleteUserDeviceCategoryByIds(ids));
    }
}
