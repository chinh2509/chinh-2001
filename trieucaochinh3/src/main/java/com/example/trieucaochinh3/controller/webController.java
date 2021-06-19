package com.example.trieucaochinh3.controller;


import com.example.trieucaochinh3.entity.BookEntity;
import com.example.trieucaochinh3.sevice.BookSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class webController {

    @Autowired
    BookSevice bookSevice;

        @GetMapping({"/", "/index"})
        public String index(Model model){
        String msg ="Hello Spring Boot + Thymeleaf";
        model.addAttribute("msg", msg);
        return "index";
        }


        @GetMapping("/adduser")
        public String addUser(Model model) {
            BookEntity bookEntity = new BookEntity();
            model.addAttribute("books", bookEntity);
            return "adduser";
        }

        @GetMapping("/listuser")
        public String listUser(Model model) {
            List<BookEntity> users = bookSevice.getAll();
            model.addAttribute("users", users);
            return "listuser";
        }

        @PostMapping("/adduser")
        public String addUser(@ModelAttribute BookEntity bookEntity, Model model) {
            bookSevice.createUser(bookEntity);
            return "redirect:/listuser";
        }

}
