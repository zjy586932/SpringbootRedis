package com.spring.redis;

import com.spring.redis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootRedisApp.class})
public class FIrstTest {

    @Autowired
    UserService userService;

    @Test
    public void findAll() throws Exception {
        userService.getAll();
        Thread.sleep(2000);
        userService.getAll();
    }
}
