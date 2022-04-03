package com.si181818.springbootmall.service;

import com.si181818.springbootmall.dto.ProductRequest;
import com.si181818.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
