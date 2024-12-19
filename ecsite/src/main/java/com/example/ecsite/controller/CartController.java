package com.example.ecsite.controller;

import com.example.ecsite.model.Product;
import com.example.ecsite.repository.ProductRepository;
import com.example.ecsite.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("cartItems", cartService.getCartItems());
        return "cart";
    }

    @PostMapping("/cart/add")
    public String addToCart(@RequestParam Long productId) {
        Product product = productRepository.findById(productId).orElseThrow();
        cartService.addToCart(product);
        return "redirect:/cart";
    }

    @PostMapping("/cart/remove")
    public String removeFromCart(@RequestParam Long productId) {
        Product product = productRepository.findById(productId).orElseThrow();
        cartService.removeFromCart(product);
        return "redirect:/cart";
    }
}
