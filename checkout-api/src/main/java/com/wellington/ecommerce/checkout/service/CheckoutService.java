package com.wellington.ecommerce.checkout.service;

import com.wellington.ecommerce.checkout.entity.CheckoutEntity;
import com.wellington.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
