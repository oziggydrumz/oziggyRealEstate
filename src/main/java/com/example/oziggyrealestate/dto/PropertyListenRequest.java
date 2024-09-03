package com.example.oziggyrealestate.dto;

import lombok.Data;

@Data

public class PropertyListenRequest {

    private String description;
    private String image;
    private String video;
    private String specifications;
    private String pricing;
    private String availability;
    private  String contactInfo;

}
