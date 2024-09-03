package com.example.oziggyrealestate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String password;
    private String emailAddress;

}
