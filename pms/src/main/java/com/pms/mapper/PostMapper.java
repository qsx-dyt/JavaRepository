package com.pms.mapper;

import com.pms.dto.PostDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PostMapper {
    int PostAdd(PostDto pd);
    List<PostDto> PostSearch(PostDto pd);
    int PostDelete(PostDto pd);
}
