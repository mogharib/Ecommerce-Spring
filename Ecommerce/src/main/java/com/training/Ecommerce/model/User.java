package com.training.Ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("users")
public class User {
    @Id
    String id ;
    String firstName;
    String lastName;
    String password;
    String email ;

    public User(String firstName, String lastName, String email, String encryptedpassword) {
    }
}
