package com.mjt.pojo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/23
 */

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue
    private long id;

    public int studentId;

    public String name;

    public int age;

    public String gender;

}
