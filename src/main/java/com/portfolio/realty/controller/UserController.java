package com.portfolio.realty.controller;

import com.portfolio.realty.domain.UserVO;
import com.portfolio.realty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String loginUser(UserVO userVO) {
        int isOk = userService.login(userVO);
        return "";
    }

    @GetMapping("?")
    public String userList() {
        userService.getListUser();
        return "";
    }

    @GetMapping("/?/{email}")
    public String userDetail(@PathVariable("email")String email) {
        userService.getUser(email);
        return "";
    }

    @DeleteMapping("/?/{userId}")
    public String userRemove(@PathVariable("userId")long userId) {
        userService.removeUser(userId);
        return "";
    }
}
