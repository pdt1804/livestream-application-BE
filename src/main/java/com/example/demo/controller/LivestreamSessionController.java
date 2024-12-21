package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.LivestreamSession;
import com.example.demo.service.LivestreamSessionService;

@RestController
@RequestMapping("/api/v1/livestream")
public class LivestreamSessionController {

	@Autowired
	private LivestreamSessionService livestreamSessionService;
	
	@GetMapping("/getAllSessions")
	public ResponseEntity<List<LivestreamSession>> getAllLivestreamSessions() {
		return ResponseEntity.ok(livestreamSessionService.getAllLivestreamSession());
	}
	
	@PostMapping("/createSession")
	public ResponseEntity<String> createSession(@RequestBody LivestreamSession session, @RequestParam("userName") String userName) {
		return ResponseEntity.ok(livestreamSessionService.createLivestreamSession(session, userName));
	}
	
	@PostMapping("/endSession")
	public ResponseEntity<String> endSession(@RequestParam("id") String sessionId) {
		return ResponseEntity.ok(livestreamSessionService.endingLivestreamSession(sessionId));
	}
}
