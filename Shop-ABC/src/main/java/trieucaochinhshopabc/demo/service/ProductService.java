package trieucaochinhshopabc.demo.service;

import trieucaochinhshopabc.demo.entity.ProductEntity;

import java.util.List;

public interface ProductService {
        List<ProductEntity> getAll();
        ProductEntity addProduct(ProductEntity p);
}
