package com.malguy.dao;

import com.malguy.pojo.TypeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Mapper
public interface TypeInfoServiceDao {
    //获取图书类型列表
    List<TypeInfo> getTypeInfoList();
}
