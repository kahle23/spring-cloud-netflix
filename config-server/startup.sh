java -jar config-server.jar --server.port=8888 --spring.application.name=config-server --spring.cloud.config.server.git.uri=https://github.com/kahlkn/config-repo --spring.cloud.config.server.git.username=test --spring.cloud.config.server.git.password=test --spring.cloud.config.server.git.basedir=/temp/config --eureka.client.service-url.defaultZone=http://eureka-server1:8761/eureka/,http://eureka-server2:8761/eureka/,http://eureka-server3:8761/eureka/



