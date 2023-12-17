package com.spring.data.jpa.demp.springdatajpapostgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.demp.springdatajpapostgres.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
