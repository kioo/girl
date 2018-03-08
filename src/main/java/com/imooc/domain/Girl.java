package com.imooc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Jackie on 2018/3/7.
 */
@Entity
public class Girl {
    public Girl() {
    }

    @Id
    @GeneratedValue // 自增序列
    private Integer id;
    private String cupSize;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
