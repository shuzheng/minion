package cn.javay.minion.demo.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
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

    @RequestMapping("/demo")
    public String demo() {
        return "I'm from port:" + port;
    }

}
