package com.example.formate_cw_4.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.formate_cw_4.model.Book;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BookController {

    @RequestMapping("/book")
    public Book requestMethodName() {

        Date da = new Date();
        da.setDate(2);
        da.setMonth(2);
        da.setYear(4);
        return new Book("The Great Soldier", "G. Gyan", da);
    }

}
