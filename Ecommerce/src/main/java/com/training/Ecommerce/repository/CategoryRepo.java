package com.training.Ecommerce.repository;


import com.training.Ecommerce.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends MongoRepository<Category, Integer> {
    public Category findById(Category categoryId);

}
