package learning.personal.cdc.demo.service;

import learning.personal.cdc.demo.model.InvoiceResponse;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {



	public InvoiceResponse getInvoice(String invoiceId) {


		return InvoiceResponse.builder().build();
	}
}
