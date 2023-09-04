package dev.cgomezu.learningspringboot3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
    List<Video> findByName(String name);
}
