package cn.javay.minion.demo.provider.controller;

import cn.javay.minion.demo.provider.service.DemoUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuzheng on 2018/1/3.
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    private static final Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @Value("${server.port}")
    String port;

    @Value("${spring.profiles.active}")
    String active;

    @Autowired
    DemoUserService demoUserService;

    @RequestMapping("/demo")
    public String demo() {
        return "I'm from port:" + port + " by " + active;
    }

    @GetMapping("/ip")
    public String ip() {
        InetUtils.HostInfo firstNonLoopbackHostInfo = InetUtils.getFirstNonLoopbackHostInfo();
        return firstNonLoopbackHostInfo.getIpAddress();
    }

    @GetMapping("/insert")
    public Object insert() {
        return demoUserService.insert();
    }

}
