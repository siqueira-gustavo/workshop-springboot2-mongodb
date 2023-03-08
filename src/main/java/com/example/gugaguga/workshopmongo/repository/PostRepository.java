package com.example.gugaguga.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.gugaguga.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

  @Query("{'title': { $regex: ?0, $options: 'i' }}")
  List<Post> searchTitle(String text);

  List<Post> findByTitleContainingIgnoreCase(String text);
}
