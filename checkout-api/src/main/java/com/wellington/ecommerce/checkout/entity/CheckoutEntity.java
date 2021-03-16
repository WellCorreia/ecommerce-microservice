package com.wellington.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
public class CheckoutEntity {

    @Id
    private Long id;

    @Column
    private String code;
}
