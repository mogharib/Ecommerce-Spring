package com.training.Ecommerce.repository;

import com.training.Ecommerce.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {
    public User findByEmail(String email);
}
