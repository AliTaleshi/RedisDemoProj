package com.test.RedisDemoProj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash(value = "userInfo")
public class UserInfoRedis {

    @Id
    private String id;
    private UserPrePaidPrice userPrePaidPrice;
}
