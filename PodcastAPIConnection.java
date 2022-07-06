package com.tutorial.externalapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PodcastAPIConnection {

    @PostMapping ("/podapi")
    private String getPodClient() {
        String uri = "https://api.podchaser.com/graphql";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, restTemplate, String.class);
    }

}
