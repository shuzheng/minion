package cn.javay.minion.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MinionEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinionEurekaApplication.class, args);
	}

}
