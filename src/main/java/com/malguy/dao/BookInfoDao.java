package com.malguy.dao;

import com.github.pagehelper.PageInfo;
import com.malguy.pojo.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.Nullable;

import java.util.List;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Mapper
public interface BookInfoDao {
    List<BookInfo> getBookInfoListByPage(@Param("pageStart") Integer pageStart,
                                   @Param("limit") Integer limit,
                                   @Param("bookInfo") BookInfo bookInfo);
   List<BookInfo> getBookInfoList(BookInfo bookInfo);
//   List<BookInfo> getBookInfoList();
    int getBookInfoCount();
}
