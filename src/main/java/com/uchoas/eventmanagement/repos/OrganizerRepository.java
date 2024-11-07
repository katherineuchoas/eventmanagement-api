package com.uchoas.eventmanagement.repos;

import com.uchoas.eventmanagement.entities.Organizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
