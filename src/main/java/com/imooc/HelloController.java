package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jackie on 2018/3/7.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize; // 获取配置文件的数据（resources/application.yml）
//    @Value("${age}")
//    private Integer age;
//    @Value("${content}")
//    private String content; // 在配置文件中配置数据
    @Autowired
    private GirlProperties girlProperties;


   /* @RequestMapping(value="/say",method = RequestMethod.POST)
    public String say(){
        //return content;
        return girlProperties.toString();
    }*/
   /* // 获取url里的数据
    @RequestMapping(value="/say/{id}",method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        //return content;
        return "id: "+id;
    }*/
    //获取传统get方法的传值方式
    //@RequestMapping(value="/say",method = RequestMethod.GET)
    @GetMapping(value="/say") // 简写GET方法
    public String say(@RequestParam("id") Integer myid){
        //return content;
        return "id: "+myid;
    }
}
