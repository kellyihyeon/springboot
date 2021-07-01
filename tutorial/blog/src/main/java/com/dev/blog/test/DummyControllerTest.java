package com.dev.blog.test;

import com.dev.blog.model.RoleType;
import com.dev.blog.model.User;
import com.dev.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Supplier;

@RestController
public class DummyControllerTest {

    @Autowired
    private UserRepository userRepository;

    // http://localhost:8000/blog/dummy/user/
    @GetMapping("/dummy/user")
    public List<User> list() {
        return userRepository.findAll();
    }

    // 한 페이지당 2건의 데이터를 리턴받아 볼 예정
    @GetMapping("/dummy/user/page")
    public Page<User> pageList(@PageableDefault(size = 2, sort="id", direction = Sort.Direction.DESC)Pageable pageable) {
        Page<User> users = userRepository.findAll(pageable);
        return users;
    }

    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id) {
        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("해당 유저는 없습니다. id: " + id);
            }
        });

        return user;
    }


    @PostMapping("/dummy/join")
    public String join(User user) {    // key=value (약속된 규칙)
        System.out.println("id = " + user.getId());
        System.out.println("role = " + user.getRole());
        System.out.println("createDate = " + user.getCreateDate());

        System.out.println("username = " + user.getUsername());
        System.out.println("password = " + user.getPassword());
        System.out.println("email = " + user.getEmail());

        user.setRole(RoleType.USER);
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }

}
