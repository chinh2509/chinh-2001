package com.example.trieucaochinh.controller;

import com.example.trieucaochinh.entity.StaffEntity;
import com.example.trieucaochinh.sevice.StaffSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class WebController {
    @Autowired
    StaffSevice staffSevice;


    @GetMapping({"/", "/index"})
    public String index(Model model) {
        String msg = "Hello Spring Boot + JSP";
        model.addAttribute("msg", msg);
        List<StaffEntity> products = staffSevice.getAll();
        model.addAttribute("products", products);
        return "index";
    }
}
