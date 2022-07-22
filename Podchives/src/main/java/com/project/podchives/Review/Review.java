package com.example.mysqldraft3.Review;

import com.example.mysqldraft3.Podcast.Podcast;
import com.example.mysqldraft3.User.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @NonNull
    @Column(length = 500)
    private String review;

    @NonNull
    @Min(1)
    @Max(5)
    private int rating;

    // many reviews for one user
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User userReviewer;

    // many reviews for one podcast
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "podId", referencedColumnName = "podId")
    private Podcast podcastReviewed;

    @CreationTimestamp
    private Instant posted;

}
