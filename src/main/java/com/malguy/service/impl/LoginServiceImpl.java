package com.malguy.service.impl;

import com.malguy.dao.AdminDao;
import com.malguy.dao.ReaderInfoDao;
import com.malguy.pojo.Admin;
import com.malguy.pojo.ReaderInfo;
import com.malguy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Service
public class LoginServiceImpl implements LoginService {
    private static String ADMIN_TYPE="admin";
    private static String READER_TYPE="reader";
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private ReaderInfoDao readerInfoDao;
    @Override
    public boolean LoginIn(String username, String password, String type) {
        //判断类型并分别查询,看是否存在对应账户
        if(ADMIN_TYPE.equals(type)){ //这样可以防止空指针
            Admin admin = adminDao.getOneAdminInfo(username, password);
            if(admin!=null){
                return true;
            }
        }
        else if(READER_TYPE.equals(type)){
            ReaderInfo readInfo = readerInfoDao.getOneReadInfo(username, password);
            if(readInfo!=null){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePwdSubmit2( String username,String newPwd,String type) {
        if(ADMIN_TYPE.equals(type)){ //这样可以防止空指针
            int i = adminDao.updatePassword(username, newPwd);
            if(i>0){
                return true;
            }
        }
        else if(READER_TYPE.equals(type)){
            int i = readerInfoDao.updatePassword(username, newPwd);
            if(i>0){
                return true;
            }
        }
        return false;
    }
}
