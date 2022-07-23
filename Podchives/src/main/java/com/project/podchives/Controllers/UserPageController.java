package com.project.podchives.Controllers;


import com.project.podchives.Podcast.Podcast;
import com.project.podchives.Podcast.PodcastRepository;
import com.project.podchives.User.User;
import com.project.podchives.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserPageController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public @ResponseBody User getUser(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }




}
