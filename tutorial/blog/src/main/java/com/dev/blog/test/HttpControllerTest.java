package com.dev.blog.test;

import org.springframework.web.bind.annotation.*;

// 사용자가 요청하면 데이터를 응답해주는 컨트롤러
// 사용자가 요청했을 때 html 파일을 응답해주는 컨트롤러 = @Controller
@RestController
public class HttpControllerTest {

    private static final String TAG = "HttpControllerTest: ";

    @GetMapping("/http/lombok")
    public String lombokTest() {
        Member member = Member.builder()
                .username("bubble")
                .password("1234")
                .email("bbgum@gmail.com")
                .build();

        System.out.println(TAG + member.getUsername());
        member.setUsername("bbMarcelline");
        System.out.println(TAG + member.getUsername());
        return "lombok test 완료";
    }

    // 인터넷 브라우저 요청은 무조건 get 요청밖에 할 수 없다.
    // http://localhost:8080/http/get (select)
    @GetMapping("/http/get")
    public String getTest(Member member) {                  // MessageConverter (스프링부트)

        return "get 요청: " + member.getId() + ", "+ member.getUsername()
                + ", " + member.getPassword() + ", " + member.getEmail();
    }

    // http://localhost:8080/http/post (insert)
    @PostMapping("/http/post")  // text/plain, application/json
    public String postTest(@RequestBody Member member) {    // MessageConverter (스프링부트)
        return "post 요청: " + member.getId() + ", "+ member.getUsername()
                + ", " + member.getPassword() + ", " + member.getEmail();
    }

    // http://localhost:8080/http/put (update)
    @PutMapping("/http/put")
    public String putTest(@RequestBody Member member) {
        return "put 요청: " + member.getId() + ", "+ member.getUsername()
                + ", " + member.getPassword() + ", " + member.getEmail();
    }

    // http://localhost:8080/http/delete (delete)
    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
    }
}
