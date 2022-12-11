package com.tungnt.chitchat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tungnt.chitchat.model.Message;

@Service
public interface MessageService {
	List<Message> findAll();
	Optional<Message> findLatestMessage(String username);
    void save(Message message);
    void remove(Message message);
    Optional<Message> findById(Long id);
    List<Message> findByUsername(String username);

}

