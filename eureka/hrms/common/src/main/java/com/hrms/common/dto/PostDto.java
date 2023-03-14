package com.hrms.common.dto;

import com.hrms.common.po.PostInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PostDto extends PostInfo {
    private Integer staffId;
    private String staffName;
    private String staffSex;
    private String staffNumber;
    private String staffPhone;
    private Integer dmtId;
    private String dmtName;
    private Date workDate;
    private String staffForm;
}
