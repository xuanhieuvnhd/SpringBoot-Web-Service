package com.repository;

import com.model.UserWeather;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserWeather, Long> {
    UserWeather findByEmail(String email);
}
