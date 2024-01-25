package com.ll.travel.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
public class Post extends BaseTime {
    private String title;
    private String body;
    @ManyToOne
    private Member author;
    @OneToMany(mappedBy = "post", cascade = ALL, orphanRemoval = true)
    @Builder.Default
    @OrderBy("id ASC")
    private List<PostPlace> postPlaces = new ArrayList<>();

    public void addPlace(Place place) {
        PostPlace postPlace = PostPlace.builder()
                .post(this)
                .place(place)
                .build();
        postPlaces.add(postPlace);
    }
}
