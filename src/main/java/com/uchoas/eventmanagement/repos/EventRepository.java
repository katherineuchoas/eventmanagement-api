package com.uchoas.eventmanagement.repos;

import com.uchoas.eventmanagement.entities.Event;
import com.uchoas.eventmanagement.entities.projections.PartialEventProjection;
import java.time.ZoneId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource(excerptProjection=PartialEventProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

    Page<Event> findByName(@Param("name") String name, Pageable pageable);

    Page<Event> findByNameAndZoneId(@Param("name") String name, @Param("zoneId") ZoneId zoneId, Pageable pageable);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void delete(Long id);

    Event findById(Long id);

    void save(Event event);
}