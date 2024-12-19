package com.example.ecsite.service;

import com.example.ecsite.model.CartItem;
import com.example.ecsite.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    private final List<CartItem> cartItems = new ArrayList<>();

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void addToCart(Product product) {
        cartItems.add(new CartItem(product, 1));
    }

    public void removeFromCart(Product product) {
        cartItems.removeIf(item -> item.getProduct().getId().equals(product.getId()));
    }
}
