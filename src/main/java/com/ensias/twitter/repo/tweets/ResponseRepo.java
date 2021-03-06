package com.ensias.twitter.repo.tweets;

import com.ensias.twitter.model.tweets.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepo extends JpaRepository<Response, Long> {
}
