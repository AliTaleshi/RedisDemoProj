package com.test.RedisDemoProj.repository;

import com.test.RedisDemoProj.model.UserInfoRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRedisRepository extends CrudRepository<UserInfoRedis, String> {
}
