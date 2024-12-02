//package com.test.RedisDemoProj.repository.impl;
//
//import com.test.RedisDemoProj.model.UserInfoRedis;
//import com.test.RedisDemoProj.model.UserPrePaidPrice;
//import com.test.RedisDemoProj.repository.TestRedisRepository;
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//
//@AllArgsConstructor
//@Slf4j
//@Component
//public class TestRedisRepositoryImpl implements TestRedisRepository {
//
//    private final RedisTemplate<String, String> redisTemplate;
//    private final String REDIS_KEY_PREFIX = "test_redis_";
//
//    @Override
//    public void setPriceObject() {
//        UserPrePaidPrice userPrePaidPrice = new UserPrePaidPrice(100, 200);
//        UserInfoRedis userInfoRedis = new UserInfoRedis("1", userPrePaidPrice);
//        redisTemplate.opsForHash().put(REDIS_KEY_PREFIX, "user", userInfoRedis);
//        log.info("###setPriceObject###");
//    }
//
//}
