package learning.personal.cdc.demo.controller;

import learning.personal.cdc.demo.model.InvoiceRequest;
import learning.personal.cdc.demo.model.InvoiceResponse;
import learning.personal.cdc.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InvoiceRestController {

	@Autowired
	private InvoiceService invoiceService;

	@GetMapping(value = "/invoice/{invoiceId}")
	public InvoiceResponse getInvoice(@PathVariable(value = "invoiceId") Long invoiceId) {
		return invoiceService.get(invoiceId);
	}

	@PostMapping(value = "/invoice")
	public InvoiceResponse getInvoice(@RequestBody InvoiceRequest invoiceRequest) {
		return invoiceService.create(invoiceRequest);
	}
}
