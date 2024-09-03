package com.example.oziggyrealestate.service;

import com.example.oziggyrealestate.dto.MessageRequest;
import com.example.oziggyrealestate.dto.PropertyListenRequest;
import com.example.oziggyrealestate.dto.RegisterRequest;
import com.example.oziggyrealestate.dto.response.AuthenticationResponse;
import com.example.oziggyrealestate.model.Message;
import com.example.oziggyrealestate.model.PropertyListen;
import org.springframework.http.ResponseEntity;

public class UserServiceImp implements UserService {

    @Override
    public AuthenticationResponse register(RegisterRequest request) {
        return null;
    }

    @Override
    public PropertyListen uploadProperty(PropertyListenRequest listenRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Message> sendMessage(long sellerId, long buyerId, MessageRequest messageRequest) {
        return null;
    }
}
