package com.hrms.common.util;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommonResult {
    private int code;
    private String msg;
    private Object result;
}
