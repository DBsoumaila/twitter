package com.bar.demo.repo;

import com.bar.demo.model.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepo extends JpaRepository<Bookmark, Long> {

}
