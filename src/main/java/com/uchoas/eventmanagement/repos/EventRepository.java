package com.uchoas.eventmanagement.repos;

import com.uchoas.eventmanagement.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
