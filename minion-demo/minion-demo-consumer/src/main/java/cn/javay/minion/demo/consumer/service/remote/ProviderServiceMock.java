package cn.javay.minion.demo.consumer.service.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by shuzheng on 2018/1/3.
 */
@Component
public class ProviderServiceMock implements ProviderService {

    private static final Logger logger = LoggerFactory.getLogger(ProviderServiceMock.class);

    @Override
    public String demo() {
        logger.error("ProviderServiceMock.demo() mock");
        return null;
    }

}
