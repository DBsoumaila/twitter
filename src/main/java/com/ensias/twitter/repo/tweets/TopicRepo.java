package com.ensias.twitter.repo.tweets;

import com.ensias.twitter.model.tweets.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends JpaRepository<Topic, Long> {

}
