package com.example.common.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResult<T> {
    private int code=200;
    private String msg="成功";
    private T rst;
}
