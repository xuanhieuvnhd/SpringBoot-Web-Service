package com.repository;

import com.model.RoleWeather;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleWeather, Long> {
    RoleWeather findByName(String name);
}
