package com.ll.travel.domain.repository;

import com.ll.travel.domain.entity.Member;
import com.ll.travel.domain.entity.PostPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostPlaceRepository extends JpaRepository<PostPlace, Long> {
}
