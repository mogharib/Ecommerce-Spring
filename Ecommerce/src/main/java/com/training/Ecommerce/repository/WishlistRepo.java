package com.training.Ecommerce.repository;

import com.training.Ecommerce.model.Wishlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepo extends MongoRepository<Wishlist , String> {
}
