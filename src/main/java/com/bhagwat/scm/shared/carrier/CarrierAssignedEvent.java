package com.bhagwat.scm.shared.carrier;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarrierAssignedEvent {
    private String shipmentId;
    private String carrierId;
    private String vehicleId;
    private LocalDateTime assignmentTime;
}
