package com.wellington.ecommerce.checkout.resource.checkout;

import com.wellington.ecommerce.checkout.repository.CheckoutRepository;
import com.wellington.ecommerce.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<Void> create(@RequestBody CheckoutRequest checkoutRequest) {
        System.out.println(checkoutRequest);
        checkoutService.create(checkoutRequest);
        return ResponseEntity.ok().build();
    }
}
