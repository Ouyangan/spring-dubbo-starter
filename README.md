# spring-dubbo-starter
spring+dubbo脚手架

# 启动
- 将服务提供方和消费方的注册中心地址修改为你自己的地址 <dubbo:registry address="zookeeper://10.120.44.79:2181"/>
- 运行provider
- 运行consumer

- 运行结果
```
2017-09-01 18:25:32.300 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=b9c77a4f-1e4c-4e9f-87b7-7ce2b88fcab1}
2017-09-01 18:25:32.302 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=d9e5fc38-84d5-4fc3-9533-83a57fb65529}
2017-09-01 18:25:32.304 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=07467bbb-327a-4548-8909-4969248c2e5c}
2017-09-01 18:25:32.307 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=d73f9eee-f752-4d8d-a88f-3662da5d2efc}
2017-09-01 18:25:32.308 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=e8475118-f36b-401d-a405-479ebbe177b3}
2017-09-01 18:25:32.310 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=8a745c5b-21a2-4030-933f-6be8ac896180}
2017-09-01 18:25:32.311 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=b7a306bb-a1cf-4673-837e-71d7040e9900}
2017-09-01 18:25:32.312 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=8e3e2a14-bc7c-4cef-b808-143b3d66a331}
2017-09-01 18:25:32.314 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=938f1d06-5e0e-4c9d-a27a-88efd2816f69}
2017-09-01 18:25:32.317 DEBUG com.consumer.Consumer.main(21) - Result{code=10000, msg='success', data=bb1a3bfe-a82e-4d05-aef7-8133840c94c7}
```