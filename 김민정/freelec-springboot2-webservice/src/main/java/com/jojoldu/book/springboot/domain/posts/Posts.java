package com.jojoldu.book.springboot.domain.posts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // 클래스 내 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity // 테이블과 링크될 클래스임을 나타냄

public class Posts {

    @Id // 해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙을 나타냄
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 칼럼을 나타냄, 굳이 선언하지 않아도 해당 클래스 필드는 모두 칼럼이 됨
    private String title;

    @Column(columnDefinition = "Text", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
