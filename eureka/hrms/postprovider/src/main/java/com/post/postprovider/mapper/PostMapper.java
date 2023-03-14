package com.post.postprovider.mapper;
import com.hrms.common.dto.PostDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    int PostAdd(PostDto pd);
    List<PostDto> ShowPostStaff();
    List<PostDto> PostSearch(PostDto pd);
    int PostDelete(PostDto pd);
    int PostEdit(PostDto pd);
    PostDto UserLogin(PostDto pd);
    PostDto UserSearch(PostDto pd);
    int UserRegister(PostDto pd);
}
