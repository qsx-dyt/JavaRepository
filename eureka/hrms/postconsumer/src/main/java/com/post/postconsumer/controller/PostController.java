package com.post.postconsumer.controller;

import com.hrms.common.dto.PostDto;
import com.hrms.common.util.CommonResult;
import com.post.postconsumer.service.PostService;
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
    @RequestMapping("/PostEdit")
    public CommonResult PostEdit(@RequestBody PostDto pd){
        return ps.PostEdit(pd);
    }
    @RequestMapping("/PostStaffInfo")
    public CommonResult ShowPostStaff(){
        return ps.ShowPostStaff();
    }
    @RequestMapping("/UserLogin")
    public CommonResult UserLogin(@RequestBody PostDto pd){
        return ps.UserLogin(pd);
    }
    @RequestMapping("/UserRegister")
    public CommonResult UserRegister(@RequestBody PostDto pd){
        return ps.UserRegister(pd);
    }
}
