package com.yidu.ssmdemo001.controller;

import com.yidu.ssmdemo001.entity.Menuinfo;
import com.yidu.ssmdemo001.entity.ResponseData;
import com.yidu.ssmdemo001.entity.Userinfo;
import com.yidu.ssmdemo001.service.MenuinfoService;
import com.yidu.ssmdemo001.service.impl.MenuinfoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (Menuinfo)表控制层
 *
 * @author makejava
 * @since 2021-04-12 14:09:08
 */
@Controller
public class MenuinfoController {
    /**
     * 服务对象
     */
    @Resource
    private MenuinfoServiceImpl menuinfoService;

    @RequestMapping("insertMenu")
    public @ResponseBody String insertMenu(Menuinfo menuinfo){
        //调用菜单表新增的方法
        Menuinfo insert = menuinfoService.insert(menuinfo);

        //判断是否新增成功
        if(insert != null){
            return "新增成功！"+menuinfo.toString();
        }else{
            return "新增失败！";
        }
    }

    //两个类用到同一个需要作用域         request只限制于这次请求到下次请求
    @RequestMapping("selectLimitMenu")
    public @ResponseBody ModelAndView selectLimitMenu(int page, int limit){
        ResponseData<Menuinfo> responseData = new ResponseData<>();
        ModelAndView mv = new ModelAndView();
        //调用分页查询菜单的方法
        List<Menuinfo> menuinfoList = menuinfoService.queryAllByLimit(page, limit);
        //调用查询总行数的方法
        int count = menuinfoService.count();
        //设置参数
        responseData.setCode(0);
        responseData.setMsg("");
        responseData.setCount(count);
        responseData.setData(menuinfoList);
        //将数据装进容器
        mv.setViewName("selectLimitMenu.jsp");
        mv.addObject("responseData",responseData);
        mv.addObject("menuinfoList",menuinfoList);

        return mv;
    }

    @RequestMapping("selectAllMenu")
    public String selectAll(HttpServletRequest request){
        //调用数据库方法得到菜单数据
        List<Menuinfo> menuinfoList = menuinfoService.selectAll();
        //将数据存到作用域
        request.setAttribute("menuinfoList",menuinfoList);
        //跳转到指定页面，显示数据
        return "selectAllMenu";
    }

    @RequestMapping("deleteMenuById")
    public String deleteMenuById(String menuid){
        //调用菜单删除的方法
        boolean deleteById = menuinfoService.deleteById(menuid);
        //判断是否删除成功
        if(deleteById==true){
            return "删除成功！";
        }else{
            return "删除失败！";
        }
    }

}