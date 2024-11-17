package com.amcom.order.service;

import com.amcom.order.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    @Value(value = "${spring.kafka.topic:purchase_order}")
    private String topic;

    private final KafkaTemplate<String, OrderDTO> kafkaTemplate;

    public void sendOrder(OrderDTO orderDTO) {
        kafkaTemplate.send(topic, orderDTO.orderId(), orderDTO);
    }
}