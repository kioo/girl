package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
