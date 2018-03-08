package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.annotation.ExceptionProxy;

/**
 * Created by Jackie on 2018/3/8.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional // 添加对事务的支持
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("dddddddddddddddddddB");
        girlB.setAge(18);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if(age < 10 ){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age > 10 && age < 16 ){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }
}
