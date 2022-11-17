package com.educative.ecommerce.repository;

import com.educative.ecommerce.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends MongoRepository<Category, Integer> {
    public Category findById(Category categoryId);

}
