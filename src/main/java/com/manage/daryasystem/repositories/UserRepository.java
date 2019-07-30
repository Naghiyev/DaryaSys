package com.manage.daryasystem.repositories;

import com.manage.daryasystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , String> {
}
