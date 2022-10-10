package com.malguy.service;

import com.malguy.pojo.Notice;

import java.util.List;

/**
 * @author malguy-wang sir
 * @create ---
 */
public interface IndexService {
    /**
     * 获取公告列表
     * @return
     */
    List<Notice> getNoticeList();
}
