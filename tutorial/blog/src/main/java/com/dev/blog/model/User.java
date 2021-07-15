package com.dev.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

//@DynamicInsert
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder  // 빌더 패턴
// ORM -> Java(다른언어도) Object -> 테이블로 매핑해주는 기술
@Entity // User 클래스가 MySql 에 테이블이 생성이 된다.
public class User {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 프로젝트에서 연결된 DB(MySql)의 넘버링 전략을 따라간다.
    private int id;  // 시퀀스(Oracle), auto_increment(MySql)

    @Column(nullable = false, length = 30, unique = true)  // 최대 30
    private String username; // 아이디

    @Column(nullable = false, length = 100)     // 왜 100이나 주지? 넉넉하게. 123456 => 해쉬(비밀번호 암호화). 암호화 된 비밀번호를 db에 넣을 것이기 때문.
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

//    @ColumnDefault("'user'")
    @Enumerated(EnumType.STRING)
    private RoleType role;    // Enum 을 쓰는 게 좋다. admin, user, manager -> 실수로 manager 라고 오타로 넣을 수 있기 때문. Enum 은 도메인으로 넣을 수 있다.

    @CreationTimestamp      // 현재 시간이 자동으로 입력. 테이블에 insert 될 때
    private Timestamp createDate;
}


