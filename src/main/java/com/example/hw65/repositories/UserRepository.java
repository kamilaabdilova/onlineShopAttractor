package com.example.hw65.repositories;

import com.example.hw65.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByName(String name);

    User findUserByAccount(String account);

    User findUserByEmail(String email);


}
