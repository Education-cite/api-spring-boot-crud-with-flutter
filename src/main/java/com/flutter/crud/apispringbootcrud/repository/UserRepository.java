package com.flutter.crud.apispringbootcrud.repository;

import com.flutter.crud.apispringbootcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String name);
}
