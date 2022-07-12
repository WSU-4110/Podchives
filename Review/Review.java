package com.example.mysqllogindraft.Review;

import com.example.mysqllogindraft.User.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
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
    private int rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

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
