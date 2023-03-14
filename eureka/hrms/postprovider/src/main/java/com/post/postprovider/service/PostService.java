package com.post.postprovider.service;

import com.hrms.common.dto.PostDto;
import com.hrms.common.util.CommonResult;
import com.post.postprovider.mapper.PostMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PostService {
    @Resource
    private PostMapper pm;
    public CommonResult PostAdd(PostDto pd){
        CommonResult rst=new CommonResult();
        if(pd.getPostId()==null){
            rst.setCode(100);
            rst.setMsg("失败");
        }
        else{
        int row=pm.PostAdd(pd);
        if(row==0){
            rst.setCode(100);
            rst.setMsg("失败");
        }
        else{
            rst.setMsg("添加成功");
        }}
        return rst;
    }

    public CommonResult PostSearch(PostDto pd) {
        CommonResult rst=new CommonResult();
        List<PostDto> posts=pm.PostSearch(pd);
        rst.setResult(posts);
        return rst;
    }
    public CommonResult PostDelete(PostDto pd) {
        CommonResult rst=new CommonResult();
        int row=pm.PostDelete(pd);
        if(row==0){
            rst.setCode(100);
            rst.setMsg("部门员工不为空！");
        }
        else{
            rst.setMsg("删除成功");
        }
        return rst;
    }

    public CommonResult PostEdit(PostDto pd) {
        CommonResult rst=new CommonResult();
        int row=pm.PostEdit(pd);
        if(row==0){
            rst.setCode(100);
            rst.setMsg("修改失败！");
        }
        else{
            rst.setMsg("修改成功");
        }
        return rst;
    }
    public CommonResult ShowPostStaff() {
        CommonResult rst=new CommonResult();
        List<PostDto> poststaffs=pm.ShowPostStaff();
        rst.setResult(poststaffs);
        return rst;
    }
    public CommonResult UserLogin(PostDto pd) {
        CommonResult rst=new CommonResult();
        PostDto user=pm.UserLogin(pd);
        if(user==null){
            rst.setCode(100);
            rst.setMsg("用户不存在！");
        }
        else if(user.getUserPwd().equals(pd.getUserPwd())){
            rst.setCode(200);
            rst.setMsg("登陆成功！");
        }
        else{
            rst.setCode(100);
            rst.setMsg("密码不正确！");
        }
        return rst;
    }
    public CommonResult UserRegister(PostDto pd) {
        CommonResult rst=new CommonResult();
        PostDto user=pm.UserSearch(pd);
        if(user==null){
            pm.UserRegister(pd);
            rst.setCode(200);
            rst.setMsg("注册成功！");
        }
        else{
            rst.setCode(100);
            rst.setMsg("用户已存在！");
        }
        return rst;
    }
}
