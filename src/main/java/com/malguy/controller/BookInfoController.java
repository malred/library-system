package com.malguy.controller;

import com.github.pagehelper.PageInfo;
import com.malguy.dao.TypeInfoServiceDao;
import com.malguy.pojo.BookInfo;
import com.malguy.pojo.TypeInfo;
import com.malguy.service.BookInfoService;
import com.malguy.service.TypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Controller
public class BookInfoController {
    @GetMapping("/bookIndex")
    public String bookIndex(){
        return "/book/bookIndex";
    }
    @Autowired
    private TypeInfoService typeInfoService;
    @GetMapping("findBookTypeList")
    @ResponseBody
    public List<TypeInfo> findBookTypeList(){
        return typeInfoService.getTypeInfoList();
    }
    @Autowired
    private BookInfoService bookInfoService;
    @GetMapping("/bookAll")
    @ResponseBody
    public Map<String,Object> bookAll(Integer page, Integer limit, BookInfo bookInfo){
        PageInfo<BookInfo> bookInfoList = bookInfoService.getBookInfoList(page, limit, bookInfo);
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("data",bookInfoList.getList());
        map.put("msg","查询图书列表成功");
        map.put("count",bookInfoService.getBookInfoCount());
        return map;
    }
}
