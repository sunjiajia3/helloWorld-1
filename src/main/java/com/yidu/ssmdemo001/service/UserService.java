package com.yidu.ssmdemo001.service;

import com.yidu.ssmdemo001.dao.UserDao;
import com.yidu.ssmdemo001.entity.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public Userinfo login(String userName,String userPass){
        return userDao.login(userName,userPass);
    }

    public int insert(Userinfo userinfo){
        return userDao.insertUser(userinfo);
    }

    public List<Userinfo> selectAll(){
        return userDao.selectAll();
    }

}
