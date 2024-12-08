package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AnswerAndCandidate;
import com.example.demo.dto.OfferAndCandidate;
import com.example.demo.dto.RequestData;

@RestController
public class WebrtcController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate; 
    
    @MessageMapping("/sendOfferAndCandidate")
    public void sendOfferAndCandidate(@Payload OfferAndCandidate offerAndCandidateData) {
        simpMessagingTemplate.convertAndSend("/user/" + offerAndCandidateData.getViewerName(), offerAndCandidateData);
    }
    
    @MessageMapping("/sendAnswerAndCandidate")
    public void sendAnswerAndCandidate(@Payload AnswerAndCandidate answerAndCandidate) {
    	System.out.println("askjdhasjkdhsajkdhsakjdhajkh");
        simpMessagingTemplate.convertAndSend("/user/livestream/receiveAnswerAndCandidate", answerAndCandidate);
    }
    
    @MessageMapping("/requestForOffer")
    public void sendRequest(@Payload String viewer) {
        simpMessagingTemplate.convertAndSend("/user/livestream/sendOfferAndCandidate", viewer);
    }
}