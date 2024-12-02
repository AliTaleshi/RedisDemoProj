package com.test.RedisDemoProj.controller;

import com.test.RedisDemoProj.model.UserInfoRedis;
import com.test.RedisDemoProj.model.UserPrePaidPrice;
import com.test.RedisDemoProj.repository.TestRedisRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController {

    private final TestRedisRepository testRedisRepository;

    @GetMapping("/test")
    public HttpStatus test() {
//        testRedisRepository.setPriceObject();
        UserPrePaidPrice userPrePaidPrice = new UserPrePaidPrice(100, 200);
        UserInfoRedis userInfoRedis = new UserInfoRedis("1", userPrePaidPrice);
        testRedisRepository.save(userInfoRedis);
        return HttpStatus.OK;
    }
}
