package com.amcom.order.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;

import java.util.List;

@Builder
@JsonSerialize
public record OrderDTO(String orderId, List<OrderItemDTO> items) {
}
