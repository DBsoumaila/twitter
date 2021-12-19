package com.bar.demo.repo;

import com.bar.demo.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepo extends JpaRepository<Tweet, Long> {

}
