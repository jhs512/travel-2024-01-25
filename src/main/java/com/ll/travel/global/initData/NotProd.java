package com.ll.travel.global.initData;

import com.ll.travel.domain.entity.Member;
import com.ll.travel.domain.entity.Place;
import com.ll.travel.domain.entity.Post;
import com.ll.travel.domain.repository.MemberRepository;
import com.ll.travel.domain.repository.PlaceRepository;
import com.ll.travel.domain.repository.PostPlaceRepository;
import com.ll.travel.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
public class NotProd {
    @Bean
    ApplicationRunner applicationRunner(
            MemberRepository memberRepository,
            PostRepository postRepository,
            PlaceRepository placeRepository,
            PostPlaceRepository postPlaceRepository
    ) {
        return new ApplicationRunner() {
            @Override
            @Transactional
            public void run(ApplicationArguments args) throws Exception {
                // 회원1 생성
                Member memeber1 = memberRepository.save(
                        Member.builder()
                                .username("user1")
                                .password("1234")
                                .build()
                );

                // 회원2 생성
                Member memeber2 = memberRepository.save(
                        Member.builder()
                                .username("user2")
                                .password("1234")
                                .build()
                );

                // 장소1 생성
                Place place1 = placeRepository.save(
                        Place.builder()
                                .name("place1")
                                .coordinate("coordinate1")
                                .build()
                );

                // 장소2 생성
                Place place2 = placeRepository.save(
                        Place.builder()
                                .name("place2")
                                .coordinate("coordinate2")
                                .build()
                );

                // 회원1이 글1 을 작성
                Post post1 = postRepository.save(
                        Post.builder()
                                .title("title1")
                                .body("content1")
                                .author(memeber1)
                                .build()
                );

                // 글1에 장소2 를 추가
                post1.addPlace(place2);
                post1.addPlace(place1);

                // 회원2가 글2를 작성
                Post post2 = postRepository.save(
                        Post.builder()
                                .title("title2")
                                .body("content2")
                                .author(memeber2)
                                .build()
                );

                post2.addPlace(place1);
            }
        };
    }
}
