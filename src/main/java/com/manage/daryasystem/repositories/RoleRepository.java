package com.manage.daryasystem.repositories;

import com.manage.daryasystem.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role , String> {
}
