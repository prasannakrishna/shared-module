package com.bhagwat.scm.shared.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class PaymentProcessedEvent {
    private final Long customerId;
    private final Long sellerId;
    private final Double orderValue;
    private final Long orderId;
}
