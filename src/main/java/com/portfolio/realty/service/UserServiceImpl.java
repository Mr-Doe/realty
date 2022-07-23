package com.portfolio.realty.service;

import com.portfolio.realty.domain.UserVO;
import com.portfolio.realty.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public int register(UserVO userVO) {
        return userDAO.insertUser(userVO);
    }

    @Override
    public List<UserVO> getListUser() {
        return userDAO.selectUserList();
    }

    @Override
    public UserVO getUser(long userId) {
        return userDAO.selectUser(userId);
    }

    @Override
    public int checkUser(String email) {
        return userDAO.checkEmail(email);
    }

    @Override
    public int modifyUser(UserVO userVO) {
        return userDAO.updateUser(userVO);
    }

    @Override
    public int removeUser(long userId) {
        return userDAO.deleteUser(userId);
    }
}
