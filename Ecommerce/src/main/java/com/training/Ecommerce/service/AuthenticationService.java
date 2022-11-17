package com.training.Ecommerce.service;

import com.training.Ecommerce.model.AuthenticationToken;
import com.training.Ecommerce.model.User;
import com.training.Ecommerce.repository.TokeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    TokeRepo tokeRepo;

    public void saveConfirmationToken(AuthenticationToken authenticationToken) {
        tokeRepo.save(authenticationToken);
    }

    public AuthenticationToken getToken(User user) {
        return tokeRepo.findByUser(user);
    }
}
