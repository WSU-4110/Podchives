package com.podchives.loginbasic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class PageViewController extends WebMvcConfigurerAdapter {
    @RequestMapping("/outhome")
    public String outhome() {
        return "outhomealt.html";
    }
    @RequestMapping("/")
    public String outhome2() {
        return "outhomealt.html";
    }
//    @RequestMapping("/outhomealt")
//    public String outhomealt() {
//        return "outhomealt.html";}

    @RequestMapping("/inhome")
    public String inhome() {
        return "inhome.html";
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
