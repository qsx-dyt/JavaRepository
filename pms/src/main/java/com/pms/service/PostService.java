package com.pms.service;

import com.pms.dto.PostDto;
import com.pms.mapper.PostMapper;
import com.pms.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ConcurrentModificationException;
import java.util.List;

@Service
public class PostService {
    @Resource
    private PostMapper pm;

    public CommonResult PostAdd(PostDto pd){
        CommonResult rst=new CommonResult();
        int row=pm.PostAdd(pd);
        if(row==0){
            rst.setCode(100);
            rst.setMsg("失败");
        }
        return rst;
    }

    public CommonResult PostSearch(PostDto pd){
        CommonResult rst=new CommonResult();
        List<PostDto> posts=pm.PostSearch(pd);
        rst.setRst(posts);
        return rst;
    }
    public CommonResult PostDelete(PostDto pd){
        CommonResult rst=new CommonResult();
        return rst;
    }
}
