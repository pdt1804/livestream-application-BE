package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AnswerAndCandidate;
import com.example.demo.dto.Candidate;
import com.example.demo.dto.Message;
import com.example.demo.dto.Offer;
import com.example.demo.dto.UserConnection;

@RestController
public class WebrtcController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate; 
    
    @MessageMapping("/sendOffer")
    public void sendOfferAndCandidate(@Payload Offer offer) {
        simpMessagingTemplate.convertAndSend("/user/" + offer.getViewerName() + "/receiveOffer", offer);
    }
    
    @MessageMapping("/sendCandidate")
    public void sendOfferAndCandidate(@Payload Candidate candidate) {
        simpMessagingTemplate.convertAndSend("/user/" + candidate.getViewerName() + "/receiveIceCandidate", candidate);
    }
    
    @MessageMapping("/sendMessage")
    public void sendOfferAndCandidate(@Payload Message message) {
        simpMessagingTemplate.convertAndSend("/user/" + message.getLivestreamUserName() + "/receiveMessage", message);
    }
    
    @MessageMapping("/sendAnswerAndCandidate")
    public void sendAnswerAndCandidate(@Payload AnswerAndCandidate answerAndCandidate) {
        simpMessagingTemplate.convertAndSend("/user/" + answerAndCandidate.getLivestreamUserName() + "/receiveAnswerAndCandidate", answerAndCandidate);
    }
    
    @MessageMapping("/requestForOffer")
    public void sendRequest(@Payload UserConnection connection) {
        simpMessagingTemplate.convertAndSend("/user/" + connection.getLivestreamUserName() + "/sendOfferAndCandidate", connection);
    }
}