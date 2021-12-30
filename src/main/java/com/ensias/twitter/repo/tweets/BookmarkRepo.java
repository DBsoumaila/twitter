package com.ensias.twitter.repo.tweets;

import com.ensias.twitter.model.tweets.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepo extends JpaRepository<Bookmark, Long> {

}
