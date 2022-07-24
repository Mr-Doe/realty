package com.portfolio.realty.repository;

import com.portfolio.realty.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDAO {
    int insertUser(UserVO userVO);
    List<UserVO> selectUserList();
    UserVO selectUser(String email);
    int checkEmail(String email);
    int updateUser(UserVO userVO);
    int deleteUser(long userId);
}
