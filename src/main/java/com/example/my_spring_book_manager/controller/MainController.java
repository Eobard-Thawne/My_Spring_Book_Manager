package com.example.my_spring_book_manager.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @PreAuthorize("hasAnyRole('admin', 'user')")
    @RequestMapping("/index")
    public String index() {

        return "index";
    }

    @RequestMapping("/login")
    public String main() {
        return "login";
    }

    @PreAuthorize("hasRole('admin')")
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }
}
