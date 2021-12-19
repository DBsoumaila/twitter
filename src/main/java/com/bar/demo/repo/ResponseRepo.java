package com.bar.demo.repo;

import com.bar.demo.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepo extends JpaRepository<Response, Long> {
}
