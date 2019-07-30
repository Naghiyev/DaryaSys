package com.manage.daryasystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/",""})
    public Model showIndexPage(Model model){

        System.out.println("for the testing");

        return model;
    }
}
