package com.example.mysqldraft3.Review;

import com.example.mysqldraft3.Podcast.Podcast;
import com.example.mysqldraft3.User.User;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    @Column
    private String name;
    @Column
    private String review;
    @Column
    @Size(min = 1, max = 5)
    private int rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User userReviewer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "podId", referencedColumnName = "podId")
    private Podcast podcastReviewed;

    private Instant posted;


    public Review(String name, String review, int rating){
        this.name = name;
        this.review = review;
        this.rating = rating;
    }

//
//    public String getName(){
//        return name;
//    }
//    public String getReview(){
//        return name;
//    }
//    public int getRating(){
//        return rating;
//    }
}
