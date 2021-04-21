package ru.itis.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.itis.demo.dto.ProductDto;
import ru.itis.demo.models.Product;
import ru.itis.demo.services.ProductsService;
import ru.itis.demo.services.TagsService;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @Autowired
    private TagsService tagsService;

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        model.addAttribute("tag_list", tagsService.getAllTags());
        model.addAttribute("product_list", productsService.getAllProducts());
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(ProductDto product) {
        productsService.addProduct(product);
        return "redirect:/products";
    }
}
