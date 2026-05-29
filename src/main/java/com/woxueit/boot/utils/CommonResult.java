package com.woxueit.boot.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult {
    private int code;
    private String msg;
    private Object data;
    //两个参数的构造器
    public CommonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
