package com.programmingtechie.productservice.respository;

import com.programmingtechie.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRespository extends MongoRepository<Product, String> {
}
