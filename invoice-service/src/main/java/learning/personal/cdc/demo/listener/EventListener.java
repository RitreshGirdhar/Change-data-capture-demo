package learning.personal.cdc.demo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service public class EventListener {

	@KafkaListener(id = "myId", topics = "dbserver1.inventory.customers")
	public void listen(String in) {
		//TODO Convert json to object and update Mysql Database
		System.out.println(in);
	}

}
