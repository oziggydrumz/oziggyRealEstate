package com.example.oziggyrealestate.service;

import com.example.oziggyrealestate.dto.MessageRequest;
import com.example.oziggyrealestate.dto.PropertyListenRequest;
import com.example.oziggyrealestate.dto.RegisterRequest;
import com.example.oziggyrealestate.dto.response.AuthenticationResponse;
import com.example.oziggyrealestate.model.Message;
import com.example.oziggyrealestate.model.PropertyListen;
import org.springframework.http.ResponseEntity;

public interface UserService {
    AuthenticationResponse register(RegisterRequest request);

    PropertyListen uploadProperty(PropertyListenRequest listenRequest);

    ResponseEntity<Message>sendMessage(long sellerId, long buyerId, MessageRequest messageRequest);




}
