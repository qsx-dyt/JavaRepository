package com.example.consumer.controller;

import com.example.common.util.CommonResult;
import com.example.consumer.service.BookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Resource
    private BookService bs;
    @RequestMapping("/showInfo")
    public CommonResult findAll(){
        return bs.findAll();
    }
}
