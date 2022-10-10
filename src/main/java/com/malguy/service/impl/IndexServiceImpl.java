package com.malguy.service.impl;

import com.malguy.dao.NoticeDao;
import com.malguy.pojo.Notice;
import com.malguy.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private NoticeDao noticeDao;
    @Override
    public List<Notice> getNoticeList() {
        List<Notice> noticeList = noticeDao.getNoticeList();
        if(noticeList!=null){
            return noticeList;
        }
        return null;
    }
}
