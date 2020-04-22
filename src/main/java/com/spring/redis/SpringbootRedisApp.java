package com.spring.redis;

import com.spring.redis.dao.UserRepository;
import com.spring.redis.service.RedisService;
import com.spring.redis.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
public class SpringbootRedisApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootRedisApp.class, args);
        UserService service = context.getBean(UserService.class);
        service.getAll();
    }
}
