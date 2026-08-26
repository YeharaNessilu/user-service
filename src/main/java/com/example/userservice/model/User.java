package com.example.userservice.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class User {

    @Id
    private String id;

    @NotBlank(message = "Name eka empty wenna epa")
    private String name;

    @NotBlank(message = "Email eka empty wenna epa")
    @Email(message = "Email format eka wenas kra")
    private String email;
}
