package ru.itis.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductDto {
    private String name;
    private String description;
    private Integer price;
    private List<String> tags;
}
