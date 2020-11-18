package com.sure.controller;

import com.sure.pojo.Books;
import com.sure.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author sure
 * @create 2020-11-10 20:27
 */
@Controller
@RequestMapping("/book")
public class BookController {
//    controller调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        System.out.println("-------------页面跳转");
        model.addAttribute("list",books);
        return "allBook";
    }

}
