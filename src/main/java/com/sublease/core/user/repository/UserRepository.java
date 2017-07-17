package com.sublease.core.user.repository;

import com.sublease.core.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by jzhou237 on 2017-05-02.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select user from User user where user.name=:name and user.password=:password")
    User login(@Param("name") String name, @Param("password") String password);

    User findByName(String name);
}
