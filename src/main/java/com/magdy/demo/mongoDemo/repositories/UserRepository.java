package com.magdy.demo.mongoDemo.repositories;

import com.magdy.demo.mongoDemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
