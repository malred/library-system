package com.malguy.service.impl;

import com.malguy.dao.TypeInfoServiceDao;
import com.malguy.pojo.TypeInfo;
import com.malguy.service.TypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Service
public class TypeInfoServiceImpl implements TypeInfoService {
    @Autowired
    private TypeInfoServiceDao dao;
    @Override
    public List<TypeInfo> getTypeInfoList() {
        return dao.getTypeInfoList();
    }
}
