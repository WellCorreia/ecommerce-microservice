package com.wellington.ecommerce.checkout.streaming;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface PaymentPaidSink {
    String INPUT = "payment-paid-input";

    @Input(INPUT)
    MessageChannel input();
}
