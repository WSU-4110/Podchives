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
@Builder
@Entity
@Table(name = "podcasts")
public class Podcast {

    @Id
    // Not a long or int value, manually created string will be used for url
    private String podId;

    @NonNull
    private String title;

    @NonNull
    private String creator;

    @NonNull
    private String description;

    @NonNull
    private String genre;

    private String link;

    private String coverImage;

    private double avgRating;

    @OneToMany(mappedBy = "podcastReviewed")
    private List<Review> reviews;
}
