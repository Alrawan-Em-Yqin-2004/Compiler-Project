package com.example.shop.controller;

import com.example.shop.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1, "Laptop", 1200.0, "Lightweight laptop with 16GB RAM", "laptop.jpg"));
        products.add(new Product(2, "Headphones", 150.5, "Wireless noise cancelling headphones", "headphones.jpg"));
    }

    // Test 1: show all products
    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", products);
        model.addAttribute("title", "All Products");
        return "products";
    }

    // Test 2a: show the add-product form
    @GetMapping("/products/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    // Test 2b: receive the form and save
    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute Product product) {
        products.add(product);
        return "redirect:/products";
    }

    // Test 3: show one product
    @GetMapping("/products/{id}")
    public String productDetails(@PathVariable int id, Model model) {
        Product product = findById(id);
        model.addAttribute("product", product);
        return "product-details";
    }

    private Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
