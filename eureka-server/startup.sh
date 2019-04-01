java -jar eureka-server.jar --server.port=8761 --eureka.instance.ip-address=127.0.0.1 --spring.application.name=eureka-server --spring.cloud.config.enabled=false --spring.cloud.config.discovery.enabled=false --spring.cloud.config.discovery.service-id=config-server --eureka.client.service-url.defaultZone=http://eureka-server1:8761/eureka/,http://eureka-server2:8761/eureka/,http://eureka-server3:8761/eureka/



