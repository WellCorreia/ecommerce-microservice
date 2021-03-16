package com.wellington.ecommerce.payment.listener;

import com.wellington.ecommerce.payment.streaming.CheckoutProcessor;
import com.wellington.ecommerce.payment.event.PaymentCreatedEvent;
import com.wellington.ecommerce.checkout.event.CheckoutCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CheckoutCreatedListener {

    private final CheckoutProcessor checkoutProcessor;

    @StreamListener(CheckoutProcessor.INPUT)
    public void handler(CheckoutCreatedEvent event) {
        //Processa pagamento gateway
        // Salvar os dados de pagamento
        // Enviar o evento do pagamento processado
        final PaymentCreatedEvent paymentCreatedEvent = PaymentCreatedEvent.newBuilder()
                .setCheckoutCod(event.getCheckoutCode())
                .setStatus(event.getStatus())
                .setPaymentCode(UUID.randomUUID().toString())
                .build();
        checkoutProcessor.output().send(MessageBuilder.withPayload(paymentCreatedEvent).build());
    }
}
