package com.example.mysqllogindraft.Podcast;

import com.example.mysqllogindraft.Review.Review;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "podcasts")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long podId;

    @Column
    @NonNull
    private String title;

    @Column
    @NonNull
    private String description;

    @Column
    private String genre;

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

    @JoinColumn(name = "reviewId", referencedColumnName = "reviewId")
    @OneToMany(fetch = FetchType.EAGER)
    private List<Review> reviews;
}
