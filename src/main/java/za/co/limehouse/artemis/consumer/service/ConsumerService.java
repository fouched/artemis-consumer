package za.co.limehouse.artemis.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    Logger log = LoggerFactory.getLogger(ConsumerService.class);

    @JmsListener(destination = "springqueue")
    public void receiveMessage(String msg) {
        log.info("Received message:" + msg);
    }
}
