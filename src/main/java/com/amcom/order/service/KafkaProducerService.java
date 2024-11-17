package com.amcom.order.service;

import com.amcom.order.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducerService {

    @Value(value = "${spring.kafka.topic:purchase_order}")
    private String topic;

    private final KafkaTemplate<String, OrderDTO> kafkaTemplate;

    public void sendOrder(OrderDTO orderDTO) {
        try {
            kafkaTemplate.send(topic, orderDTO.orderId(), orderDTO);
            log.info("Order {} enviado para o topico {} do kafka com sucesso", orderDTO.orderId(), topic);
        } catch (RuntimeException e){
            log.error("Ocorreu um erro ao enviar Order {} para o topico {} do kafka: {}",
                    orderDTO.orderId(), topic, e.getMessage());
        }
    }
}