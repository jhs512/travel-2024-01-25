package com.ll.travel.domain.repository;

import com.ll.travel.domain.entity.Member;
import com.ll.travel.domain.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
