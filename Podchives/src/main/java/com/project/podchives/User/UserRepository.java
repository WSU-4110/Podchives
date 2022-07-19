package com.example.mysqldraft3.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("SELECT u FROM User u WHERE u.username = ?1")
    @Query(value = "SELECT * FROM USERS WHERE USERNAME=?1",nativeQuery = true)
    User findByUsername(String username);

}
