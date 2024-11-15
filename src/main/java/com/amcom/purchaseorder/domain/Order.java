package com.amcom.purchaseorder.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@JsonSerialize
public class Order {
    private Long id;

    private List<OrderItem> items;

}
