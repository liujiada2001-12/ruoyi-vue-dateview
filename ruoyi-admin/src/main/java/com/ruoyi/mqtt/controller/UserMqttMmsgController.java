package com.ruoyi.mqtt.controller;

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
import com.ruoyi.mqtt.domain.UserMqttMmsg;
import com.ruoyi.mqtt.service.IUserMqttMmsgService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * mqtt消息测试Controller
 * 
 * @author 1
 * @date 2024-03-01
 */
@RestController
@RequestMapping("/mqtt/mmsg")
public class UserMqttMmsgController extends BaseController
{
    @Autowired
    private IUserMqttMmsgService userMqttMmsgService;

    /**
     * 查询mqtt消息测试列表
     */
    @PreAuthorize("@ss.hasPermi('mqtt:mmsg:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserMqttMmsg userMqttMmsg)
    {
        startPage();
        List<UserMqttMmsg> list = userMqttMmsgService.selectUserMqttMmsgList(userMqttMmsg);
        return getDataTable(list);
    }

    /**
     * 导出mqtt消息测试列表
     */
    @PreAuthorize("@ss.hasPermi('mqtt:mmsg:export')")
    @Log(title = "mqtt消息测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserMqttMmsg userMqttMmsg)
    {
        List<UserMqttMmsg> list = userMqttMmsgService.selectUserMqttMmsgList(userMqttMmsg);
        ExcelUtil<UserMqttMmsg> util = new ExcelUtil<UserMqttMmsg>(UserMqttMmsg.class);
        util.exportExcel(response, list, "mqtt消息测试数据");
    }

    /**
     * 获取mqtt消息测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('mqtt:mmsg:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userMqttMmsgService.selectUserMqttMmsgById(id));
    }

    /**
     * 新增mqtt消息测试
     */
    @PreAuthorize("@ss.hasPermi('mqtt:mmsg:add')")
    @Log(title = "mqtt消息测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserMqttMmsg userMqttMmsg)
    {
        return toAjax(userMqttMmsgService.insertUserMqttMmsg(userMqttMmsg));
    }

    /**
     * 修改mqtt消息测试
     */
    @PreAuthorize("@ss.hasPermi('mqtt:mmsg:edit')")
    @Log(title = "mqtt消息测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserMqttMmsg userMqttMmsg)
    {
        return toAjax(userMqttMmsgService.updateUserMqttMmsg(userMqttMmsg));
    }

    /**
     * 删除mqtt消息测试
     */
    @PreAuthorize("@ss.hasPermi('mqtt:mmsg:remove')")
    @Log(title = "mqtt消息测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userMqttMmsgService.deleteUserMqttMmsgByIds(ids));
    }
}
