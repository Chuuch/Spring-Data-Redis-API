package com.chuchulev.Spring_Data_Redis.repository;

import com.chuchulev.Spring_Data_Redis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
