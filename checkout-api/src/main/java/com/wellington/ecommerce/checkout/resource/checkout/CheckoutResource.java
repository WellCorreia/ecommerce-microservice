package com.wellington.ecommerce.checkout.resource.checkout;

import com.wellington.ecommerce.checkout.repository.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutRepository checkoutRepository;

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {
        return ResponseEntity.ok().build();
    }
}
