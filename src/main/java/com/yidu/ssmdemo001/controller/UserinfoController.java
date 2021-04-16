package com.yidu.ssmdemo001.controller;

import com.yidu.ssmdemo001.entity.Userinfo;
import com.yidu.ssmdemo001.service.UserinfoService;
import com.yidu.ssmdemo001.service.impl.UserinfoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Userinfo)表控制层
 *
 * @author makejava
 * @since 2021-04-12 14:40:34
 */
@Controller
public class UserinfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoServiceImpl userinfoService;

    @RequestMapping("loginUserinfo")
    public @ResponseBody String loginUserinfo(Userinfo userinfo){
        //调用权限管理用户登录的方法
        Userinfo login = userinfoService.login(userinfo.getUsername(), userinfo.getUserpass());
        //判断是否登录成功
        if(login!=null){
            return "登录成功！";
        }else{
            return "登录失败！";
        }
    }

    @RequestMapping("registerUserinfo")
    public @ResponseBody String registerUserinfo(Userinfo userinfo){
        System.out.println(userinfo.toString());
        //调用权限管理用户注册的方法
        int register = userinfoService.register(userinfo);
        //判断是否注册成功
        if(register > 0){
            return "注册成功！";
        }else{
            return "注册失败！";
        }
    }

    @RequestMapping("insertUserinfo")
    public @ResponseBody String insertUserinfo(Userinfo userinfo){
        //调用权限管理用户新增的方法
        Userinfo insert = userinfoService.insert(userinfo);
        //判断是否新增成功
        if(insert!=null){
            return "新增成功！"+userinfo.toString();
        }else{
            return "新增失败！";
        }
    }

}