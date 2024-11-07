package com.uchoas.eventmanagement.repos;

import com.uchoas.eventmanagement.entities.Participant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
    Page<Participant> findByEmail(@Param("email") String email, Pageable pageable);

    Participant findById(Long id);

    void save(Participant participant);
}
