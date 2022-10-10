package com.malguy.dao;

import com.malguy.pojo.ReaderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sun.reflect.generics.visitor.Reifier;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Mapper
public interface ReaderInfoDao {
    /**
     * 获取读者信息
     * @param username
     * @param password
     * @return
     */
    ReaderInfo getOneReadInfo(
            //多个参数要带这个注解
            @Param("username") String username,
            @Param("password") String password);
    int updatePassword(@Param("username") String username,@Param("password") String password);

}
