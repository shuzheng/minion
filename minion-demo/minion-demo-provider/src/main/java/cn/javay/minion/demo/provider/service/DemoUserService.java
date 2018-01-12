package cn.javay.minion.demo.provider.service;

import cn.javay.minion.demo.provider.entity.DemoUser;
import cn.javay.minion.demo.provider.repository.DemoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shuzheng on 2018/1/12.
 */
@Service
public class DemoUserService {

    @Autowired
    DemoUserRepository demoUserRepository;

    /**
     * 增
     * @return
     */
    public DemoUser insert() {
        DemoUser demoUser = new DemoUser();
        demoUser.setUsername("shuzheng");
        demoUser.setPassword("123456");
        demoUserRepository.save(demoUser);
        return demoUser;
    }

    /**
     * 删
     */
    public void delete() {
        demoUserRepository.delete(0);
    }

}
