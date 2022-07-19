package com.example.mysqldraft3.Podcast;

import com.example.mysqldraft3.Review.Review;
import com.example.mysqldraft3.User.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "podcasts")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long podId;

    @NonNull
    @Column(unique = true)
    private String podUrl;

    @NonNull
    private String title;

    @NonNull
    private String creator;

    @NonNull
    @Column(length = 500)
    private String description;

    @NonNull
    private String genre;

    @NonNull
    private String link;

    @NonNull
    private String coverImage;

    @CreationTimestamp
    private Instant added;

//    @Builder.Default
    @Column(columnDefinition = "double default 0")
    private double avgRating = 0.0;

    // one podcast has many reviews
    @JsonManagedReference
    @OneToMany(mappedBy = "podcastReviewed")
    private List<Review> reviews;

    // many podcasts for one list
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "listId", referencedColumnName = "listId")
    private PodList podcastList;


//    five/many favorited podcasts for one list
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User userFaves;



}
