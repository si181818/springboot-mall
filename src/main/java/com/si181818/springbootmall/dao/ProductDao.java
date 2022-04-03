package com.si181818.springbootmall.dao;

import com.si181818.springbootmall.dto.ProductRequest;
import com.si181818.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
