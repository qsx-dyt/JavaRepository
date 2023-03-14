package com.example.provider.service;

import com.example.common.dto.BookDto;
import com.example.common.util.CommonResult;
import com.example.provider.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookService {
    @Resource
    private BookMapper bm;
    public CommonResult findAll() {
        CommonResult rst=new CommonResult();
        List<BookDto> books=bm.findAll();
        rst.setRst(books);
        return rst;
    }
}
