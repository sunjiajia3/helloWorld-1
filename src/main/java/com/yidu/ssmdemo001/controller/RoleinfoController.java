package com.yidu.ssmdemo001.controller;

import com.yidu.ssmdemo001.entity.Roleinfo;
import com.yidu.ssmdemo001.service.impl.RoleinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleinfoController {

    @Autowired
    private RoleinfoServiceImpl roleinfoService;

    @RequestMapping("selectByRoleid")
    public @ResponseBody String selectByRoleid(int roleid){
        //调用根据id查询的方法
        Roleinfo roleinfo = roleinfoService.selectById(roleid);
        //判断是否存在，如果存在就输出查询出的角色
        if(roleinfo!=null){
            return "查询成功！"+roleinfo;
        }else{
            return "查询失败！没有此角色。";
        }
    }

}
