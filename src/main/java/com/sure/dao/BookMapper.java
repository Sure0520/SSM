package com.sure.dao;

import com.sure.pojo.Books;

import java.util.List;

/**
 * @author sure
 * @create 2020-11-10 17:04
 */
public interface BookMapper {
    //增加一个Book
    int addBook(Books books);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}
