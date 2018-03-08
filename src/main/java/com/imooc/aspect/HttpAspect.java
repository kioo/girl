package com.imooc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 用于切面的类
 */
@Aspect
@Component
public class HttpAspect {
    @Before("execution(public * com.imooc.controller.GirlController.*(..))")
    public void log(){
        System.out.println("我是一个切面，我先切了一下");
    }
}
