package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> getProducts() {
        return Arrays.asList("Laptop", "Mobile", "Headphones");
    }
}
