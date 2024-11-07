package com.uchoas.eventmanagement.entities.projections;

import com.uchoas.eventmanagement.entities.Venue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "virtual", types = { Venue.class })
public interface StreetAddressProjection {

    @Value("#{target.streetAddress} #{target.streetAddress2}")
    String getCompleteStreetAddress();
}