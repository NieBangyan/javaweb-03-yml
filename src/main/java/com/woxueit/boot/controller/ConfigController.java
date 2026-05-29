package com.woxueit.boot.controller;

import com.woxueit.boot.config.CustomPropertiesConfig;
import com.woxueit.boot.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    //通过@Value读取配置
    //获取端口号
    @Value("${server.port}")
    private String port;
    //获取上下文路径
    @Value("${server.servlet.context-path}")
    private String contextPath;
    //获取当前Spring应用的名称
    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping
    public CommonResult getConfig(){
        String data = "端口："+port+",上下文路径："+contextPath+",应用名称"+applicationName;
        return new CommonResult(200, "success", data);
    }
    @Autowired
    private CustomPropertiesConfig customPropertiesConfig;

    @GetMapping("/custom")
    public CommonResult getCustomConfig() {
        return new CommonResult(200, "success", customPropertiesConfig);
    }
}
