package com.si181818.springbootmall.dao;

import com.si181818.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
