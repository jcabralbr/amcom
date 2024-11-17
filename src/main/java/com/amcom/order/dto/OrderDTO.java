package com.amcom.order.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@JsonSerialize
public record OrderDTO(String orderId, List<OrderItemDTO> items) {
}
