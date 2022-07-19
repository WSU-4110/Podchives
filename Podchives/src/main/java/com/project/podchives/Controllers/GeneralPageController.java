package com.example.mysqldraft3.Controllers;


import com.example.mysqldraft3.User.User;
import com.example.mysqldraft3.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;


@Controller
public class GeneralPageController{// extends WebMvcConfigurerAdapter {
//
//    @Autowired
//    UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/home")
    public String home2() {
        return "home";
    }
//
//
//
//    @GetMapping("/login")
//    public String login(){return "login";}
//
//
//    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/*");
    }
}
