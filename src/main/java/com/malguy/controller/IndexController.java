package com.malguy.controller;

import com.malguy.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    /**
     * 首页的路由
     * @param username 用户名
     * @param password 密码
     * @param type 身份(权限)
     * @return 返回首页视图
     */
    @RequestMapping({"/","/index"})
    public String index(String username,String password,String type){
        return "index";
    }
    //首页
    @Autowired
    private IndexService indexService;
    @GetMapping("welcome")
    public ModelAndView welcome(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("noticeList",indexService.getNoticeList());
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
    //修改密码
    @GetMapping("/updatePassword")
    public String updatePwd(){
        return "/pwdUpdate/updatePwd";
    }
}
