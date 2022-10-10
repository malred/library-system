package com.malguy.service;

import com.github.pagehelper.PageInfo;
import com.malguy.pojo.BookInfo;

/**
 * @author malguy-wang sir
 * @create ---
 */
public interface BookInfoService {
    //因为剩下的name code typeid和实体类的字段可以对应,所以可以直接用实体类来接收
    PageInfo<BookInfo> getBookInfoList(Integer page, Integer limit, BookInfo bookInfo);
    int getBookInfoCount();
}
