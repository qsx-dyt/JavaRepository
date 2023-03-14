package com.hrms.common.po;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostInfo extends UserInfo{
    private Integer postId;
    private String postName;
    private String postType;
}
