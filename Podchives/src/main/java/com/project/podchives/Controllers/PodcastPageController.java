package com.example.mysqldraft3.Controllers;

import com.example.mysqldraft3.Podcast.Podcast;
import com.example.mysqldraft3.Podcast.PodcastRepository;
import com.example.mysqldraft3.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/podcast")
public class PodcastPageController {
    @Autowired
    private PodcastRepository podcastRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Podcast> getAllPodcasts() {
        return podcastRepository.findAll();
    }

    @GetMapping("/{podUrl}")
    public @ResponseBody Podcast getPodcast(@PathVariable String podUrl) {
        return podcastRepository.findByPodUrl(podUrl);
    }

}
