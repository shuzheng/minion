package cn.javay.minion.demo.provider.repository;

import cn.javay.minion.demo.provider.entity.DemoUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shuzheng on 2018/1/12.
 */
public interface DemoUserRepository extends JpaRepository<DemoUser, Integer> {

}
