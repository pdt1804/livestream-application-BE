package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.LivestreamSession;
import com.example.demo.entities.User;
import com.example.demo.enums.LivestreamStatus;
import com.example.demo.repositories.LivestreamSessionRepository;
import com.example.demo.repositories.UserRepository;

@Service
public class LivestreamSessionService {

	@Autowired
	private LivestreamSessionRepository livestreamSessionRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<LivestreamSession> getAllLivestreamSession() {
		List<LivestreamSession> sessions = livestreamSessionRepository
				.findAll().stream()
				.filter((session) -> session.getStatus().equals(LivestreamStatus.STREAMING))
				.collect(Collectors.toList());
		
		return sessions;
	}
	
	public String createLivestreamSession(LivestreamSession session, String userName) {
		Optional<User> user = userRepository.findById(userName);
		if (user.isPresent()) {
			session.setStartTime(new Date());
			session.setUser(user.get());
			session.setStatus(LivestreamStatus.STREAMING);
			
			livestreamSessionRepository.save(session);
			return session.getId();
		} else {
			return "004 - Couldn't find user by username !";
		}
	}
	
	public String endingLivestreamSession(String id) {
		Optional<LivestreamSession> session = livestreamSessionRepository.findById(id);
		if (session.isPresent()) {
			session.get().setEndTime(new Date());
			session.get().setStatus(LivestreamStatus.ENDED);
			
			livestreamSessionRepository.save(session.get());
			return "Success";
		} else {
			return "006 - Couldn't find livestream session by Id !";
		}
	}
}
