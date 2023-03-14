package com.example.consumer.service;

import com.example.common.util.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class BookService {
    @Resource
    private RestTemplate rtc;
    public CommonResult findAll(){
        CommonResult rst=null;
        rst=rtc.postForObject("http://PROVIDER:8001/book/showInfo",
                null,CommonResult.class);
        return rst;
    }
}
