package cn.javay.minion.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试配置中心数据
 * Created by shuzheng on 2018/1/26.
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${times}")
    int times;

    @GetMapping("/config")
    Object config() {
        return times;
    }

}
