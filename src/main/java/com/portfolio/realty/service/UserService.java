package com.portfolio.realty.service;

import com.portfolio.realty.domain.UserVO;

import java.util.List;

public interface UserService {
    int register(UserVO userVO);
    List<UserVO> getListUser();
    UserVO getUser(long userId);
    int checkUser(String email);
    int modifyUser(UserVO userVO);
    int removeUser(long userId );
}
