package ru.itis.demo.services;

import ru.itis.demo.dto.ProductDto;
import ru.itis.demo.models.Product;

import java.util.List;

public interface ProductsService {
    List<Product> getAllProducts();

    Product addProduct(ProductDto product);
}
