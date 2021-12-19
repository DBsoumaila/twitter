package com.bar.demo.repo;

import com.bar.demo.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends JpaRepository<Topic, Long> {

}
