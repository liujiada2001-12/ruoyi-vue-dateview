package com.ruoyi.mqtt.controller;

import com.ruoyi.mqtt.MqttPushClient;
import com.ruoyi.mqtt.PushCallback;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.mqtt.service.IUserMqttRmsgService;
@Controller
@RequestMapping("/mqtt/srmsg")
public class UserMqttSendReceiveController {
    private String prefix = "/mqtt/srmsg";

    @Autowired
    private MqttPushClient mqttPushClient;
    @Autowired
    private IUserMqttRmsgService userMqttRmsgService;

    //发送
    @PostMapping("/mqttsend")
    @ResponseBody
    public AjaxResult mqttsend(String topic, String msg)
    {
        AjaxResult res_publish = mqttPushClient.publish(0, false, topic, msg);
        return res_publish;
    }

    //接收
    @PostMapping("/mqttrece")
    @ResponseBody
    public String mqttrece()
    {
        PushCallback pushCallback = new PushCallback();
//        UserMqttMmsg userMqttMmsg;
//        userMqttMmsg.setTopic("mqtt/receive");
//        userMqttMmsg.setMsg("mqtt/receive");
//        userMqttMmsg.setQos("0");
//        userMqttMmsg.setCreateBy("admin");
        return pushCallback.receive();
    }
}
