package com.portfolio.realty.controller;

import com.portfolio.realty.domain.UserVO;
import com.portfolio.realty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/reg")
    public String registerUser(UserVO userVO) {
        int isOk = userService.register(userVO);
        return "";
    }



}
