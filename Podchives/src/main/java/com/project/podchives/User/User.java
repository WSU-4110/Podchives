package com.example.mysqldraft3.User;

import com.example.mysqldraft3.Podcast.PodList;
import com.example.mysqldraft3.Podcast.Podcast;
import com.example.mysqldraft3.Review.Review;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NonNull
    @Column(nullable = false, unique = true, length = 60)
    private String email;
    @NonNull
    @Column(nullable = false, unique = true, length = 60)
    private String username;
    @NonNull
    @Column(nullable = false, length = 64)
    private String password;
    @NonNull
    @Column(nullable = false, length = 20)
    private String firstName;
    @NonNull
    @Column(nullable = false, length = 20)
    private String lastName;

    // one user has many reviews
    @JsonManagedReference
    @OneToMany(mappedBy="userReviewer")
    private List<Review> userReviews;

    // FAVORITES LIST
    @Size(max = 5)
    @JsonManagedReference
    @OneToMany(mappedBy="userFaves")
    private List<Podcast> favorites;

    // list of lists - one user has many lists
    @JsonManagedReference
    @OneToMany(mappedBy="userLister")
    private List<PodList> userLists;

// Builder Example for reference
//    User testUser = User.builder()
//            .email("hello@email.com")
//            .username("hellohello")
//            .password("asdfasd")
//            .firstName("Example")
//            .lastName("User")
//            .build();

}
