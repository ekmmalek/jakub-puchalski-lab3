package com.example.filecollector.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

//    @Size(min = 3, message = "Field 'firstName' -> should min length 3")
    private String firstName;

//    @NotBlank(message = "Field 'lastname' -> cannot be blank")
    private String lastname;

    private String username;

    private String password;

//    @Email(message = "Field 'email' -> wrong format email")
    private String email;

}
