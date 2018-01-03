package cn.javay.minion.demo.consumer.service.local;

import cn.javay.minion.demo.consumer.service.remote.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shuzheng on 2018/1/3.
 */
@Service
public class ConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    ProviderService providerService;

    public Object demo() {
        return providerService.demo();
    }

}
