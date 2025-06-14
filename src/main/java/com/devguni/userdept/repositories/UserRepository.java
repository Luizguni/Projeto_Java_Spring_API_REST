package com.devguni.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devguni.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
