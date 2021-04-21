package learning.personal.cdc.demo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service public class EventListener {

	@KafkaListener(id = "myId", topics = "dbserver1.inventory.customers")
	public void listen(String in) {
		System.out.println(in);
	}

}
