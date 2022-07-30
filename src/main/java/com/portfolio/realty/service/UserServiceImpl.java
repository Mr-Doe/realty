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
    public int login(UserVO userVO) {
        int member = userDAO.checkEmail(userVO.getEmail());
        if(member == 0) {
            member = userDAO.insertUser(userVO);
        } else {
            UserVO updateInfo = userDAO.selectUser(userVO.getEmail());
            if (userVO.getNickName() != updateInfo.getNickName()
                    || userVO.getName() != updateInfo.getName()) {
                member = userDAO.updateUser(new UserVO(
                        updateInfo.getUserId(),
                        userVO.getNickName(),
                        userVO.getName()));
            }
        }
        return member;
    }

    @Override
    public List<UserVO> getListUser() {
        return userDAO.selectUserList();
    }

    @Override
    public UserVO getUser(String email) {
        return userDAO.selectUser(email);
    }

    @Override
    public int removeUser(long userId) {
        return userDAO.deleteUser(userId);
    }
}
