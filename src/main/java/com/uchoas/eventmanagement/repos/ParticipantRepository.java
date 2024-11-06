package com.uchoas.eventmanagement.repos;

import com.uchoas.eventmanagement.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
