package com.uchoas.eventmanagement.controllers;

import com.uchoas.eventmanagement.entities.Event;
import com.uchoas.eventmanagement.repos.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

    @Autowired
    private EventRepository eventRepository;

    @PostMapping("/start/{id}")
    public ResponseEntity start(@PathVariable Long id) {
        if (event == null) {
            throw new ResourceNotFoundException();
        }
        event.setStarted(true);
        eventRepository.save(event);

        return ResponseEntity.ok(event.getName() + " has started");
    }

}