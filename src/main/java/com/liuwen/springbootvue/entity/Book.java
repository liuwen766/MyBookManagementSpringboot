package com.liuwen.springbootvue.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author: Liu Wen
 * @create: 2020-02-22 11:32
 * @description: Good good study,day day up!
 **/
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //自增
    private Integer id;
    private String name;
    private String author;
}
