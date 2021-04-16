package com.yidu.ssmdemo001.controller;

import com.yidu.ssmdemo001.entity.Userinfo;
import com.yidu.ssmdemo001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 用户控制层，暂时处理登录与注册  增删改查
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @param userName 表单中传过来的用户名
     * @param userPass 表单中传过来的密码
     * @return 响应页面
     */
    @RequestMapping("login")
    public @ResponseBody Userinfo login(String userName, String userPass){
        System.out.println("userName = " + userName + ", userPass = " + userPass);
        //调用数据库登录查询方法
        return userService.login(userName,userPass);
        //返回结果
        //return "登录成功";
    }

    @RequestMapping("insertUser")
    public @ResponseBody String insertUser(Userinfo userinfo){
        //调用数据库用户新增的方法
        int insert = userService.insert(userinfo);
        //判断是否新增成功7
        if(insert > 0){
            return "新增成功";
        }else{
            return "新增失败";
        }
    }

    @RequestMapping("selectUser")
    public @ResponseBody ModelAndView selectUser(){
        ModelAndView mv = new ModelAndView();
        //调用查询所有的方法
        List<Userinfo> userinfoList = userService.selectAll();
        mv.setViewName("selectAllUser");
        mv.addObject("userinfoList",userinfoList);
        return mv;
    }

}
