package com.malguy.dao;

import com.malguy.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminDao {
    /**
     * 获取管理员用户信息
     * @param username
     * @param password
     * @return
     */
    Admin getOneAdminInfo(@Param("username") String username,@Param("password") String password);
    //修改密码
    int updatePassword(@Param("username") String username,@Param("password") String password);
}
