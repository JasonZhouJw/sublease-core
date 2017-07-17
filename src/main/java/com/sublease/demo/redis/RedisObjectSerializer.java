package com.sublease.demo.redis;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * Created by jzhou237 on 2017-05-03.
 */
public class RedisObjectSerializer implements RedisSerializer {
    @Override
    public byte[] serialize(Object o) throws SerializationException {
        return new byte[0];
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        return null;
    }
}
