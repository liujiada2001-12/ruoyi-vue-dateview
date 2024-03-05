package com.ruoyi.device.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.device.domain.UserDeviceCategory;
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
import com.ruoyi.device.domain.UserDeviceStatus;
import com.ruoyi.device.service.IUserDeviceStatusService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备状态Controller
 * 
 * @author 1
 * @date 2024-02-27
 */
@RestController
@RequestMapping("/device/status")
public class UserDeviceStatusController extends BaseController
{
    @Autowired
    private IUserDeviceStatusService userDeviceStatusService;

    /**
     * 查询设备状态列表
     */
    @PreAuthorize("@ss.hasPermi('device:status:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserDeviceStatus userDeviceStatus)
    {
        startPage();
        List<UserDeviceStatus> list = userDeviceStatusService.selectUserDeviceStatusList(userDeviceStatus);
        return getDataTable(list);
    }
    /**
     * 查询所有设备分类列表
     */
    @PreAuthorize("@ss.hasPermi('device:status:listALLStatus')")
    @GetMapping("/listALLStatus")
    public TableDataInfo listALLStatus()
    {
        startPage();
        List<UserDeviceStatus> list = userDeviceStatusService.selectUserDeviceStatusList(null);
        return getDataTable(list);
    }
    /**
     * 导出设备状态列表
     */
    @PreAuthorize("@ss.hasPermi('device:status:export')")
    @Log(title = "设备状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserDeviceStatus userDeviceStatus)
    {
        List<UserDeviceStatus> list = userDeviceStatusService.selectUserDeviceStatusList(userDeviceStatus);
        ExcelUtil<UserDeviceStatus> util = new ExcelUtil<UserDeviceStatus>(UserDeviceStatus.class);
        util.exportExcel(response, list, "设备状态数据");
    }

    /**
     * 获取设备状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('device:status:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userDeviceStatusService.selectUserDeviceStatusById(id));
    }

    /**
     * 新增设备状态
     */
    @PreAuthorize("@ss.hasPermi('device:status:add')")
    @Log(title = "设备状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserDeviceStatus userDeviceStatus)
    {
        return toAjax(userDeviceStatusService.insertUserDeviceStatus(userDeviceStatus));
    }

    /**
     * 修改设备状态
     */
    @PreAuthorize("@ss.hasPermi('device:status:edit')")
    @Log(title = "设备状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserDeviceStatus userDeviceStatus)
    {
        return toAjax(userDeviceStatusService.updateUserDeviceStatus(userDeviceStatus));
    }

    /**
     * 删除设备状态
     */
    @PreAuthorize("@ss.hasPermi('device:status:remove')")
    @Log(title = "设备状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userDeviceStatusService.deleteUserDeviceStatusByIds(ids));
    }
}
