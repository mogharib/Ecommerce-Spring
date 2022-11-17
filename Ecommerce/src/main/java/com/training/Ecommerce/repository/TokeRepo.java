package com.training.Ecommerce.repository;

import com.training.Ecommerce.model.AuthenticationToken;
import com.training.Ecommerce.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokeRepo extends MongoRepository<AuthenticationToken, String> {
    AuthenticationToken findByUser(User user);
}
