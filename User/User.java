package com.example.mysqllogindraft.User;

import com.example.mysqllogindraft.Review.Review;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
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
    @Column(nullable = false, length = 64)
    private String password;
    @NonNull
    @Column(nullable = false, length = 20)
    private String firstName;
    @NonNull
    @Column(nullable = false, length = 20)
    private String lastName;

    @JoinColumn(name = "reviewId",referencedColumnName = "reviewId")
    @OneToMany(fetch = FetchType.LAZY)
    private Review review;


}
