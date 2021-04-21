package learning.personal.cdc.demo.controller;

import learning.personal.cdc.demo.model.InvoiceResponse;
import learning.personal.cdc.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceRestController {

	@Autowired
	private InvoiceService invoiceService;

	@GetMapping(value = "/invoice/{invoiceId}")
	public InvoiceResponse getInvoice(@PathVariable(value = "invoiceId") String invoiceId) {
		return invoiceService.getInvoice(invoiceId);
	}
}
