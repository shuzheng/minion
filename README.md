# minion

![minion](minion.jpg)

## 项目结构
```
minion
├── minion-eureka 注册中心[10001]
├── minion-admin 监控中心[10011]
├── minion-config 配置中心[10021]
├── minion-gateway 服务网关[10031]
├── minion-zipkin 服务追踪[10041]
└── minion-demo
     ├── minion-demo-provider 服务提供者[20011]
     └── minion-demo-consumer 服务消费者[20021]
```

## 地址列表

- [注册中心] [http://127.0.0.1:10001](http://127.0.0.1:10001 "注册中心")

- [监控中心] [http://127.0.0.1:10011](http://127.0.0.1:10011 "监控中心")

- [服务网关过滤器] [http://127.0.0.1:10031/filters](http://127.0.0.1:10031/filters "服务网关过滤器")

- [服务网关路由器] [http://127.0.0.1:10031/routes](http://127.0.0.1:10031/routes "服务网关路由器")

- [服务追踪] [http://127.0.0.1:10041/zipkin/](http://127.0.0.1:10041/zipkin/ "服务追踪")

- [断路器监控] [http://127.0.0.1:20012/hystrix](http://127.0.0.1:20012/hystrix "断路器监控")