package com.yshs.demo;

import com.yshs.demo.domain.User;
import com.yshs.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public User getUserById(Integer id) {
        return userService.selectByPrimaryKey(id);
    }
}
