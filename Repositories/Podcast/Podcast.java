package com.example.mysqldraft3.Podcast;

import com.example.mysqldraft3.Review.Review;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
//@Builder
@Entity
@Table(name = "podcasts")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long podId; // or should it be a string id for the url?

    @Column
    @NonNull
    private String title;

    @Column
    @NonNull
    private String creator;

    @Column
    @NonNull
    private String description;

    @Column
    private String genre; //s??

    @Column
    private String language; //s??

    @Column
    private String linkApple;
    @Column
    private String linkSpotify;
    @Column
    private String linkStitcher;
    @Column
    private String linkTuneIn;
    @Column
    private String linkGoogle;

    @Column
    private String coverImage;

    @Column
    private double avgRating;

    @OneToMany(mappedBy = "podcastReviewed")
    private List<Review> reviews;
}
