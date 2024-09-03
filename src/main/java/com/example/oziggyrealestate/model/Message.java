package com.example.oziggyrealestate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.loadtime.Agent;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Message {
    private long id;
    private String body;
    private String content;
    private LocalDateTime timeSent;
    private User user;


}
