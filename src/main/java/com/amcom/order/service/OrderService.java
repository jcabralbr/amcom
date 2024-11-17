package com.amcom.order.service;

import com.amcom.order.dto.OrderDTO;
import com.amcom.order.dto.OrderItemDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class OrderService {

    private final KafkaProducerService kafkaProducerService;
    private final Random random = new Random();

    public void createAndSendOrder() {
        OrderDTO orderDTO = generateOrder();
        kafkaProducerService.sendOrder(orderDTO);
    }

    private OrderDTO generateOrder() {
        long orderId = Math.abs(random.nextLong(10) + 1); // gera um numero aleatorio 1 e 10
        List<OrderItemDTO> items = new ArrayList<>();
        int numberOfItems = random.nextInt(5) + 1; // gera um numero aleatorio entre 1 e 5

        for (int i = 0; i < numberOfItems; i++) {
            String sku = "SKU-" + random.nextInt(1000);
            int quantity = random.nextInt(10) + 1;
            BigDecimal unitPrice = BigDecimal.valueOf(random.nextDouble() * 100).setScale(2, RoundingMode.HALF_UP);
            items.add(OrderItemDTO.builder()
                    .sku(sku)
                    .quantity(quantity)
                    .unitPrice(unitPrice)
                    .build());
        }

        return OrderDTO.builder()
                .orderId(Long.toString(orderId))
                .items(items)
                .build();

    }
}
