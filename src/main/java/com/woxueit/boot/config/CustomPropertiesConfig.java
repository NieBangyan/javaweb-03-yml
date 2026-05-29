package com.woxueit.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

//属性配置类
@Component //表明这是一个系统组件
@ConfigurationProperties(prefix = "custom") //配置属性，会从配置文件中找到以：custom开头的属性配置
@Data
public class CustomPropertiesConfig {
    private String author;
    private Integer age;
    private List<String> skill;
    //set、get。省略了，用@Data注解
}
