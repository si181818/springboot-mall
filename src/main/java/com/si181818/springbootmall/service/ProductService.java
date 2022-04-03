package com.si181818.springbootmall.service;

import com.si181818.springbootmall.constant.ProductCategory;
import com.si181818.springbootmall.dto.ProductRequest;
import com.si181818.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String serach);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
