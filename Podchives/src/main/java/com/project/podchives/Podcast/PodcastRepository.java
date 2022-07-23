package com.project.podchives.Podcast;

import com.project.podchives.Review.Review;
import com.project.podchives.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PodcastRepository extends JpaRepository<Podcast, Long> {

//    Select avg(rating) from reviews where pod_id={currentpodcastid};
//    @Query("SELECT AVG(rating) FROM Reviews WHERE P.Podcast = ?1")
//    void updateAvg()
//
//    @Query("SELECT POD_ID FROM PODCASTS WHERE POD_URL = ?1")
    @Query(value = "SELECT * FROM PODCASTS WHERE POD_URL=?1", nativeQuery = true)
    Podcast findByPodUrl(String podUrl);

    @Query(value = "SELECT * FROM REVIEWS WHERE POD_ID=?1", nativeQuery = true)
    List<Review> findReviewsforPod(int podId);

}
