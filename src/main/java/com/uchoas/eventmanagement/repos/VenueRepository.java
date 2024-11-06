package com.uchoas.eventmanagement.repos;

import com.uchoas.eventmanagement.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Long> {
}
