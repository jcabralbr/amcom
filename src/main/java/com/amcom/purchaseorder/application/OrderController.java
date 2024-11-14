package com.amcom.purchaseorder.application;

import com.amcom.purchaseorder.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/orders", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public void createOrder() {
        orderService.createAndSendOrder();
    }
}

