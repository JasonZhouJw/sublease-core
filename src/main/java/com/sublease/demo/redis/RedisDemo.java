package com.sublease.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by jzhou237 on 2017-05-03.
 */
@Component
public class RedisDemo implements CommandLineRunner {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void run(String... args) throws Exception {

    }
}
