package com.amcom.order.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
@JsonSerialize
public record OrderItemDTO(String sku, int quantity, BigDecimal unitPrice) {
}
