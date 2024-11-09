package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebrtcController {

	@SendTo("/topic/video-call-demo")
	@MessageMapping("/sendData")
	public void sendData(Object obj) {
		// do nothing
	}
}
