package com.manage.daryasystem.repositories;

import com.manage.daryasystem.entities.Task;
import com.manage.daryasystem.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task , Long> {

    List<Task> findByUser(User user);
}
