package com.ll.travel.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
public class PostPlace extends BaseTime {
    @ManyToOne
    private Member author;
    @ManyToOne
    private Post post;
    @ManyToOne
    private Place place;
}
