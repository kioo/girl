package com.imooc.utils;

import com.imooc.domain.Result;

/**
 * Created by Jackie on 2018/3/8.
 */
public class ResultUtil {
    // 请求成功返回的信息
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    // 请求成功没有参数返回时的信息
    public static Result success(){
        return success(null);
    }
    // 请求失败时返回的信息
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
