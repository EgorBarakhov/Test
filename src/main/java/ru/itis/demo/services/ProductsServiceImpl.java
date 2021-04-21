package ru.itis.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.demo.dto.ProductDto;
import ru.itis.demo.models.Product;
import ru.itis.demo.repositories.ProductsRepository;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Product> getAllProducts() { return productsRepository.findAll(); }

    @Override
    public Product addProduct(ProductDto product) {
        return productsRepository.save(Product.builder().
                name(product.getName()).
                description(product.getDescription()).
                price(product.getPrice()).
                build());
    }
}
