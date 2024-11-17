package com.amcom.order.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@JsonSerialize
public record OrderItemDTO(String sku, int quantity, BigDecimal unitPrice) {
}
