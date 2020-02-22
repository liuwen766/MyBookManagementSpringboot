package com.liuwen.springbootvue.repository;

import com.liuwen.springbootvue.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author: Liu Wen
 * @create: 2020-02-22 11:31
 * @description: Good good study,day day up!
 **/
public interface BookRepository extends JpaRepository<Book,Integer> {
}
