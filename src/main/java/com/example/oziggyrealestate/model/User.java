package com.example.oziggyrealestate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;

    private String firstname;

    private String lastname;

    private String phoneNumber;

    private String password;

    private String emailAddress;

    private  String description;

    private Enum<AppRole>appRoleEnum;



}
