package com.yidu.ssmdemo001.dao;

import com.yidu.ssmdemo001.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    /**
     * 登录
     * @param userName 用户账号
     * @param userPass 用户密码
     * @return 是否登录成功
     */
    Userinfo login(String userName,String userPass);

    /**
     * 用户新增
     * @param userinfo
     * @return
     */
    int insertUser(Userinfo userinfo);

    /**
     * 查询所有
     * @return 查出的所有信息
     */
    List<Userinfo> selectAll();

}
