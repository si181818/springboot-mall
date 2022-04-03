package com.si181818.springbootmall.service.impl;

import com.si181818.springbootmall.dao.ProductDao;
import com.si181818.springbootmall.dto.ProductQueryParams;
import com.si181818.springbootmall.dto.ProductRequest;
import com.si181818.springbootmall.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.si181818.springbootmall.service.ProductService;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }


    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
