package cn.javay.minion.demo.consumer.controller;

import cn.javay.minion.demo.consumer.service.local.ConsumerService;
import cn.javay.minion.demo.consumer.service.remote.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuzheng on 2018/1/3.
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/demo")
    Object demo() {
        return consumerService.demo();
    }

}
