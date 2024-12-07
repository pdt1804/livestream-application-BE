package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PayloadData;
import com.example.demo.dto.RequestData;

@RestController
public class WebrtcController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate; 
    
    @MessageMapping("/sendCandidate")
    public void sendCandidate(@Payload PayloadData payloadData) {
        simpMessagingTemplate.convertAndSend("/user/viewer", payloadData);
    }
    
    @MessageMapping("/getLivestreamICECandidate")
    public void sendRequest(@Payload RequestData requestData) {
        simpMessagingTemplate.convertAndSend("/user/livestream", requestData);
    }
}