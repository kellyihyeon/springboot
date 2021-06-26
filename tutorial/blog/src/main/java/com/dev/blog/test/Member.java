package com.dev.blog.test;

import lombok.*;

@Data
@NoArgsConstructor
public class Member {

    // 데이터는 db 에서 들고 올테니, 불변성을 유지하기 위해 final 설정.
    private int id;
    private String username;
    private String password;
    private String email;

    @Builder
    public Member(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
