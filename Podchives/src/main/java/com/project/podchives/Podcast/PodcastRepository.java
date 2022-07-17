package com.project.podchives.Podcast;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PodcastRepository extends JpaRepository<Podcast, Long> {
   @Query(value = "SELECT * FROM PODCASTS WHERE POD_URL=?1", nativeQuery = true)
    Podcast findByPodUrl(String podUrl);
}
