package com.amcom.purchaseorder.domain;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class OrderItem {

    private String sku;
    private int quantity;
    private BigDecimal unitPrice;
}
