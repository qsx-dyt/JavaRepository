package com.pms.controller;

import com.pms.dto.PostDto;
import com.pms.service.PostService;
import com.pms.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@CrossOrigin
@RestController
@RequestMapping("/post")
public class PostController {
    @Resource
    private PostService ps;
    @RequestMapping("/PostAdd")
    public CommonResult PostAdd(@RequestBody PostDto pd){
        return ps.PostAdd(pd);
    }
    @RequestMapping("/PostSearch")
    public CommonResult PostSearch(@RequestBody PostDto pd){
        return ps.PostSearch(pd);
    }
    @RequestMapping("/PostDelete")
    public CommonResult PostDelete(@RequestBody PostDto pd){
        return ps.PostDelete(pd);
    }
}
