package com.amcom.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderScheduler {

    private final OrderService orderService;

    @Scheduled(fixedRate = 10000) // Agendar a execução a cada 10 segundos
    public void generateAndSendOrder() {
        orderService.createAndSendOrder();
    }
}
