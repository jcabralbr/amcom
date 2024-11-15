package com.amcom.purchaseorder.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@JsonSerialize
public class OrderItem {

    private String sku;

    private int quantity;

    private BigDecimal unitPrice;
}
