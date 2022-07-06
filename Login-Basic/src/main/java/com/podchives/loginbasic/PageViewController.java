package com.podchives.loginbasic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class PageViewController extends WebMvcConfigurerAdapter {

    @RequestMapping("/")
    public String home() {
        return "home.html";
    }
    @RequestMapping("/home")
    public String home2() {
        return "home.html";
    }

    @RequestMapping("/profile")
    public String profile() {
        return "profile.html";
    }

    @RequestMapping("/login")
    public String login() {
        return "login.html";
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/*");
    }
}
