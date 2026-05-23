package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.CarClass;
import com.technokratos.agona.enums.TransferDirection;
import com.technokratos.agona.enums.TransferStatus;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
public class TransferResponse {
    private UUID id;
    private UUID bookingId;
    private TransferDirection direction;
    private CarClass carClass;
    private String address;
    private String city;
    private String airportCode;
    private OffsetDateTime scheduledAt;
    private BigDecimal price;
    private TransferStatus status;
    private String cabbieFirstName;
    private String cabbieLastName;
    private String cabbiePhone;
    private String carModel;
    private String plateNumber;

}
