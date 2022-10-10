package com.malguy.service;


import javax.servlet.http.HttpServletRequest;

public interface LoginService {
    /**
     * 登录方法
     * @param username
     * @param password
     * @param type 用户身份
     * @return
     */
    boolean LoginIn(String username,String password,String type);

    /**
     * 修改密码
     * @param username
     * @param newPwd
     * @param type 账户类型
     * @return bool 修改成功失败
     */
    boolean updatePwdSubmit2(String username,String newPwd,String type);
}
