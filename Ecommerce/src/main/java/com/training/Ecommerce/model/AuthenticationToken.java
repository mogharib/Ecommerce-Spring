package com.training.Ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("tokens")
public class AuthenticationToken {
    private String id;
    private String token;
    private Date createdAt;
    private User user;

    public AuthenticationToken(User user) {
    }
}
