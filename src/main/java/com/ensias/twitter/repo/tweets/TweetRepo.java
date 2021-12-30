package com.ensias.twitter.repo.tweets;

import com.ensias.twitter.model.tweets.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepo extends JpaRepository<Tweet, Long> {

}
