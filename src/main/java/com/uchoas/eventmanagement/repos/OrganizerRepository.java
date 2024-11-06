package com.uchoas.eventmanagement.repos;

import com.uchoas.eventmanagement.entities.Organizer;
import org.springframework.data.repository.CrudRepository;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {
}
