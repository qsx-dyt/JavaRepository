package com.post.postconsumer.service;

import com.hrms.common.dto.PostDto;
import com.hrms.common.util.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
@Service
public class PostService {
    @Resource
    private RestTemplate rtc;
    public CommonResult PostAdd(PostDto pd){
        CommonResult rst=null;
        rst=rtc.postForObject("http://POSTPROVIDER:8001/post/PostAdd",
                pd,CommonResult.class);
        return rst;
    }
    public CommonResult PostSearch(PostDto pd){
        CommonResult rst=null;
        rst=rtc.postForObject("http://POSTPROVIDER:8001/post/PostSearch",
                pd,CommonResult.class);
        return rst;
    }
    public CommonResult PostDelete(PostDto pd){
        CommonResult rst=null;
        rst=rtc.postForObject("http://POSTPROVIDER:8001/post/PostDelete",
                pd,CommonResult.class);
        return rst;
    }
    public CommonResult PostEdit(PostDto pd){
        CommonResult rst=null;
        rst=rtc.postForObject("http://POSTPROVIDER:8001/post/PostEdit",
                pd,CommonResult.class);
        return rst;
    }
    public CommonResult ShowPostStaff(){
        CommonResult rst=null;
        rst=rtc.postForObject("http://POSTPROVIDER:8001/post/PostStaffInfo",
                null,CommonResult.class);
        return rst;
    }
    public CommonResult UserLogin(PostDto pd){
        CommonResult rst=null;
        rst=rtc.postForObject("http://POSTPROVIDER:8001/post/UserLogin",
                pd,CommonResult.class);
        return rst;
    }
    public CommonResult UserRegister(PostDto pd){
        CommonResult rst=null;
        rst=rtc.postForObject("http://POSTPROVIDER:8001/post/UserRegister",
                pd,CommonResult.class);
        return rst;
    }
}
