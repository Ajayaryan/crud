package com.personal.restfulwebservice.repository;

import com.personal.restfulwebservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}