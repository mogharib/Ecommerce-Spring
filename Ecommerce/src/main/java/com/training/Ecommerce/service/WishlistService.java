package com.training.Ecommerce.service;

import com.training.Ecommerce.repository.WishlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {
    @Autowired
    WishlistRepo wishlistRepo ;
}
