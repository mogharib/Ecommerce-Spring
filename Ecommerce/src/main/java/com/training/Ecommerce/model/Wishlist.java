package com.training.Ecommerce.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("wishlist")
public class Wishlist {
    @Id
    private String id;
    private  User user;
    private Date createdAt;
    private Product product ;
}
