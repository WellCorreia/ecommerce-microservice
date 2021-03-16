package com.wellington.ecommerce.checkout.service;

import com.wellington.ecommerce.checkout.entity.CheckoutEntity;
import com.wellington.ecommerce.checkout.repository.CheckoutRepository;
import com.wellington.ecommerce.checkout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService{
    private final CheckoutRepository checkoutRepository;

//    public CheckoutServiceImpl(CheckoutRepository checkoutRepository) {
//        this.checkoutRepository = checkoutRepository;
//    }

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}
