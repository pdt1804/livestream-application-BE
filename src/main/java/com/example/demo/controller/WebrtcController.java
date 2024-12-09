package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AnswerAndCandidate;
import com.example.demo.dto.Candidate;
import com.example.demo.dto.Offer;

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
    
    @MessageMapping("/sendAnswerAndCandidate")
    public void sendAnswerAndCandidate(@Payload AnswerAndCandidate answerAndCandidate) {
        simpMessagingTemplate.convertAndSend("/user/" + answerAndCandidate.getLivestreamUserName() + "/receiveAnswerAndCandidate", answerAndCandidate);
    }
    
    @MessageMapping("/requestForOffer")
    public void sendRequest(@Payload String viewer) {
        simpMessagingTemplate.convertAndSend("/user/livestream/sendOfferAndCandidate", viewer);
    }
}