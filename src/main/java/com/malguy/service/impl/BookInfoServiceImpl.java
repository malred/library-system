package com.malguy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.malguy.dao.BookInfoDao;
import com.malguy.pojo.BookInfo;
import com.malguy.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Service
public class BookInfoServiceImpl implements BookInfoService {
    @Autowired
    BookInfoDao bookInfoDao;

    @Override
    public int getBookInfoCount() {
        return bookInfoDao.getBookInfoCount();
    }

    @Override
    public PageInfo<BookInfo> getBookInfoList(Integer page, Integer limit, BookInfo bookInfo) {
        int pageStart=(page-1)*limit;
        PageHelper.startPage(page,limit);
//        bookInfoDao.getBookInfoListByPage(pageStart,limit,bookInfo);
//        List<BookInfo> bookInfoList = bookInfoDao.getBookInfoList();
        List<BookInfo> bookInfoList = bookInfoDao.getBookInfoList(bookInfo);
        PageInfo<BookInfo> bookInfoPageInfo = new PageInfo<>(bookInfoList);
        return bookInfoPageInfo;
    }
}
