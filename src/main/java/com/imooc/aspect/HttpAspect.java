package com.imooc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 用于切面的类
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

   /* // 1.方法执行之前执行
    @Before("execution(public * com.imooc.controller.GirlController.*(..))")
    public void log(){
        logger.info("我是一个切面，在方法执行之前我先执行了一下");
    }
   // 2. 方法执行之后执行
    @After("execution(public * com.imooc.controller.GirlController.*(..))")
    public void doAfter(){
        logger.info("我是一个切面，在方法执行之后我执行了一下");
    }*/
    // 3. 创建一个切点信息，切前和切后引用配置，避免重复
    @Pointcut("execution(public * com.imooc.controller.GirlController.*(..))")
    public void pointCutLog(){
    }
    // 4. 打印请求信息
    @Before("pointCutLog()")
    public void doPointCutBefore(JoinPoint joinPoint){
        //url
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url={}",request.getRequestURL());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //类方法
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //参数
        logger.info("args={}", joinPoint.getArgs());
    }
    @After("pointCutLog()")
    public void doPointCutAfter(){
        logger.info("切后");
    }

    // 5.打印reponse返回信息
    @AfterReturning(returning = "object", pointcut = "pointCutLog()")
    public void doAfterReturning(Object object){
        logger.info("response={}",object);
    }
}
