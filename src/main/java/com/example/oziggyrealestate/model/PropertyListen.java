package com.example.oziggyrealestate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table



public class PropertyListen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String description;
    private String image;
    private String video;
    private String specifications;
    private String pricing;
    private String availability;
    private  String contactInfo;
    private boolean isVerify;

    @ManyToOne
    private  PropertyType propertyType;

}
