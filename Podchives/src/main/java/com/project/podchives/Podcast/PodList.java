package com.project.podchives.Podcast;

import com.project.podchives.Review.Review;
import com.project.podchives.User.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class PodList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listId;
    private String listUrl;
    private String title;
    @Column(length = 500)
    private String description;

//    One list has many podcasts
    @JsonManagedReference
    @OneToMany(mappedBy = "podcastList")
    private List<Podcast> podcasts;

//    Many lists for one user
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User userLister;
}
