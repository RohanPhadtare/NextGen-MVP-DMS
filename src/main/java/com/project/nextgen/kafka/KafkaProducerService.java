package com.project.nextgen.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private KafkaTemplate<String,Object> kafkaTemplate;

    public void publishDocumentEvent(Object event){

        kafkaTemplate.send("document-events", event);
    }
}
