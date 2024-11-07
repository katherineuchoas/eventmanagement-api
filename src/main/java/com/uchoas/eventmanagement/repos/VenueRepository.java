package com.uchoas.eventmanagement.repos;

import com.uchoas.eventmanagement.entities.Venue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

    Page<Venue> findByPostalCode(@Param("postalCode") String postalcode, Pageable pageable);

}

