package com.example.ecsite.controller;

import com.example.ecsite.model.Product;
import com.example.ecsite.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EcsiteController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "home";
    }

    @GetMapping("/product")
    public String product( Model model) {
        return "product";
    }
    
    @GetMapping("/explanation")
    public String explanation( Model model) {
        return "explanation";
    }
}
