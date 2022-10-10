package com.malguy.controller;

import com.malguy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginIn")
    public String loginIn(HttpServletRequest request,String username, String password, String type, Model model) {
        boolean loginIn = loginService.LoginIn(username, password, type);
        if (!loginIn) {
            model.addAttribute("msg", "账号或者密码错误");
            return "login"; //返回到首页
        }
        //前端是从session里获取的数据
        Map<String,Object> user=new HashMap<>();
        user.put("username",username);
        user.put("password",password);
        HttpSession session=request.getSession();
        session.setAttribute("user",user);
        session.setAttribute("type",type);
        return "index";
    }
    //修改密码
    @PostMapping("/updatePwdSubmit2")
    @ResponseBody
    public Map<String, Object> updatePwdSubmit2(HttpServletRequest request, String oldPwd, String newPwd){
        Map<String,Object> resultMap=new HashMap<>();
        if(oldPwd.equals(newPwd)){
            resultMap.put("code",1);
            resultMap.put("msg","新旧密码不能一样");
            return resultMap;
        }
        //获取用户信息
        HttpSession session = request.getSession();
        Map<String,Object> user = (Map<String, Object>) session.getAttribute("user");
        String type = (String) session.getAttribute("type");
        boolean updateFlag=loginService.updatePwdSubmit2(user.get("username").toString(),newPwd,type);
        if (updateFlag){
            resultMap.put("code",0);
            resultMap.put("msg","密码修改成功");
            return resultMap;
        }
        resultMap.put("code",1);
        resultMap.put("msg","密码修改失败");
        return resultMap;
    }
    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        //清除session信息
        session.removeAttribute("user");
        session.removeAttribute("type");
        return "login";
    }
}
