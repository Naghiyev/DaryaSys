package com.manage.daryasystem;

import com.manage.daryasystem.entities.Task;
import com.manage.daryasystem.entities.User;
import com.manage.daryasystem.services.TaskService;
import com.manage.daryasystem.services.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaryasystemApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private TaskService taskService;

    @Before
    public void initDb() {
        {
            User newUser = new User("testUser@mail.com", "testUser", "123456");
            userService.CreateUser(newUser);
        }

        {
            User newUser = new User("testAdmin@mail.com", "testAdmin", "123456");
            userService.CreateAdmin(newUser);
        }

        Task userTask = new Task("29/07/2019", "11:00", "11:00", "you need to work today");
        User user = userService.findOne("testUser@mail.com");
        taskService.addTask(userTask, user);
    }

    @Test
    public void testUser(){
        User user = userService.findOne("testUser@mail.com");
        Assert.assertNotNull(user);

        User admin = userService.findOne("testAdmin@mail.com");
        Assert.assertEquals(admin.getEmail(), "testAdmin@mail.com");
    }


    @Test
    public void testTask(){

        User user = userService.findOne("testAdmin@mail.com");

        List<Task> taskList = taskService.findUserTask(user);
        Assert.assertNotNull(taskList);

    }

}
