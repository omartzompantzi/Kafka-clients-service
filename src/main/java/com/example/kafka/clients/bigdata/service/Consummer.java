package com.example.kafka.clients.bigdata.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consummer {

    @KafkaListener(id = "clientsbigdata", topics = { "test" })
    public void consume(String message , Acknowledgment ack){
        log.info("message");
        log.info(message);
        if (message.contains("Benito")){
            ack.acknowledge();
            log.info("Confirmado");
        }else{
            log.info("No confirmado");
        }
    }


}
