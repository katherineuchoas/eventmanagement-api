package com.uchoas.eventmanagement.entities.projections;

import com.uchoas.eventmanagement.entities.Event;
import java.time.Instant;
import java.time.ZonedDateTime;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "partial", types = { Event.class })
public interface PartialEventProjection {

    String getName();

    ZonedDateTime getStartTime();

    ZonedDateTime getEndTime();

    Instant getCreated();
}