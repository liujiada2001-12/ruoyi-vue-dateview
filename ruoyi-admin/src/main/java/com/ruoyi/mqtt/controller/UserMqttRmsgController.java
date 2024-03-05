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
import com.ruoyi.mqtt.domain.UserMqttRmsg;
import com.ruoyi.mqtt.service.IUserMqttRmsgService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * mqtt接收测试Controller
 * 
 * @author 1
 * @date 2024-03-02
 */
@RestController
@RequestMapping("/mqtt/rmsg")
public class UserMqttRmsgController extends BaseController
{
    @Autowired
    private IUserMqttRmsgService userMqttRmsgService;

    /**
     * 查询mqtt接收测试列表
     */
    @PreAuthorize("@ss.hasPermi('mqtt:rmsg:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserMqttRmsg userMqttRmsg)
    {
        startPage();
        List<UserMqttRmsg> list = userMqttRmsgService.selectUserMqttRmsgList(userMqttRmsg);
        return getDataTable(list);
    }

    /**
     * 导出mqtt接收测试列表
     */
    @PreAuthorize("@ss.hasPermi('mqtt:rmsg:export')")
    @Log(title = "mqtt接收测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserMqttRmsg userMqttRmsg)
    {
        List<UserMqttRmsg> list = userMqttRmsgService.selectUserMqttRmsgList(userMqttRmsg);
        ExcelUtil<UserMqttRmsg> util = new ExcelUtil<UserMqttRmsg>(UserMqttRmsg.class);
        util.exportExcel(response, list, "mqtt接收测试数据");
    }

    /**
     * 获取mqtt接收测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('mqtt:rmsg:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userMqttRmsgService.selectUserMqttRmsgById(id));
    }

    /**
     * 新增mqtt接收测试
     */
    @PreAuthorize("@ss.hasPermi('mqtt:rmsg:add')")
    @Log(title = "mqtt接收测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserMqttRmsg userMqttRmsg)
    {
        return toAjax(userMqttRmsgService.insertUserMqttRmsg(userMqttRmsg));
    }

    /**
     * 修改mqtt接收测试
     */
    @PreAuthorize("@ss.hasPermi('mqtt:rmsg:edit')")
    @Log(title = "mqtt接收测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserMqttRmsg userMqttRmsg)
    {
        return toAjax(userMqttRmsgService.updateUserMqttRmsg(userMqttRmsg));
    }

    /**
     * 删除mqtt接收测试
     */
    @PreAuthorize("@ss.hasPermi('mqtt:rmsg:remove')")
    @Log(title = "mqtt接收测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userMqttRmsgService.deleteUserMqttRmsgByIds(ids));
    }
}
