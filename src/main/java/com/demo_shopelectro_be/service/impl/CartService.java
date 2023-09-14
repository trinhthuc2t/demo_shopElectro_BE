package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.order.Cart;
import com.demo_shopelectro_be.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void addToCart(Product product, int quantity) {
        cart.getProducts().merge(product, quantity, Integer::sum);
    }

    public void removeFromCart(Product product, int quantity) {
        cart.getProducts().computeIfPresent(product, (key, value) -> value - quantity);
        cart.getProducts().entrySet().removeIf(entry -> entry.getValue() <= 0);
    }

    public float checkout() {
        return cart.countTotalPayment();
    }
}