package com.ll.travel.domain.repository;

import com.ll.travel.domain.entity.Member;
import com.ll.travel.domain.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
