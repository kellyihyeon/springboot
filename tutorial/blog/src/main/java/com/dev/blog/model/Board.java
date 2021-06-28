package com.dev.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //auto_increment
    private int id;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob // 대용량 데이터를 쓸 때 사용
    private String content;  // 섬머노트 라이브러리: <html>태그가 섞여서 디자인이 됨.

    @ColumnDefault("0") // int 이기 때문에 '' 필요 없음
    private int count; // 조회수

    @ManyToOne  // Many = Board, One = User.    연관관계는 ManyToOne 으로 만들어진다.
    @JoinColumn(name = "userId")  // userId 라고만 들어가면, 이것과 User 가 연관관계가 없다. -> 필드 값은 userId 라고 만들어지고
    private User user;  // DB는 오브젝트를 저장할 수 없다. FK 사용 vs 자바는 오브젝트를 저장할 수 있다. Jpa 는 오브젝트를 저장할 수 있다.

    @CreationTimestamp
    private Timestamp createDate;
}
