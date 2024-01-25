package com.ll.travel.domain.entity;

import jakarta.persistence.Entity;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
public class Place extends BaseTime {
    private String name;
    private String coordinate;
}
