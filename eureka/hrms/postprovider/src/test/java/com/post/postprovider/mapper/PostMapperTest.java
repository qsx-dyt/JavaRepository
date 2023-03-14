package com.post.postprovider.mapper;

import com.hrms.common.dto.PostDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class PostMapperTest {

    @Resource
    PostMapper pm;
    PostDto pd=new PostDto();
    @Test
    void postDelete() {
        int n=pm.PostDelete(pd);
        System.out.println(n);
    }

    @Test
    void postSearch() {
        List<PostDto> posts=pm.PostSearch(pd);
        System.out.println(posts);
    }

    @Test
    void postAdd() {
        pd.setPostName("ttt");
        pd.setPostId(999);
        int n=pm.PostAdd(pd);
        System.out.println(n);
    }

    @Test
    void showPostStaff() {
        List<PostDto> poststaffs=pm.ShowPostStaff();
        System.out.println(poststaffs);
    }

    @Test
    void postEdit() {
        int n=pm.PostEdit(pd);
        System.out.println(n);
    }

    @Test
    void userLogin() {
        PostDto user=pm.UserLogin(pd);
        System.out.println(user);
    }

    @Test
    void userSearch() {
        PostDto user=pm.UserSearch(pd);
        System.out.println(user);
    }

    @Test
    void userRegister() {
        int n=pm.UserRegister(pd);
        System.out.println(n);
    }
}