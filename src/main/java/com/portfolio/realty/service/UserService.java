package com.portfolio.realty.service;

import com.portfolio.realty.domain.UserVO;

import java.util.List;

public interface UserService {
    int login(UserVO userVO);
    List<UserVO> getListUser();
    UserVO getUser(String email);
    int removeUser(long userId );
}
