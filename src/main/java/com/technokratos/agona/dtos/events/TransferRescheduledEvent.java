package com.technokratos.agona.dtos.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TransferRescheduledEvent extends EmailEvent {
    private UUID transferId;
    private UUID bookingId;
    private OffsetDateTime oldScheduledAt;
    private OffsetDateTime newScheduledAt;
    private String city;
    private String airportCode;
    private String cabbieFirstName;
    private String cabbieLastName;
    private String cabbiePhone;
}
