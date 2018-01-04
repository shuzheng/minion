package cn.javay.minion.demo.consumer.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by shuzheng on 2018/1/3.
 */
@FeignClient(value = "minion-demo-provider", fallback = ProviderServiceMock.class)
public interface ProviderService {

    @GetMapping("/provider/demo")
    String demo();

}
