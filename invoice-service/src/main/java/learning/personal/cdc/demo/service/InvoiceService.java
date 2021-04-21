package learning.personal.cdc.demo.service;

import learning.personal.cdc.demo.dao.repositories.CustomerRepository;
import learning.personal.cdc.demo.dao.repositories.InvoiceRepository;
import learning.personal.cdc.demo.entity.CustomerEntity;
import learning.personal.cdc.demo.entity.InvoiceEntity;
import learning.personal.cdc.demo.model.InvoiceRequest;
import learning.personal.cdc.demo.model.InvoiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Autowired
	private CustomerRepository customerRepository;

	public InvoiceResponse get(Long invoiceId) {
		Optional<InvoiceEntity> invoiceEntityOptional = invoiceRepository.findById(invoiceId);
		if(!invoiceEntityOptional.isPresent()) {
			throw new RuntimeException("Invoice not found");
		}

		InvoiceEntity invoiceEntity = invoiceEntityOptional.get();
		return InvoiceResponse.builder()
				.invoiceId(invoiceEntity.getId())
				.amount(invoiceEntity.getAmount())
				.build();
	}

	public InvoiceResponse create(InvoiceRequest invoiceRequest) {

		Optional<CustomerEntity> customerEntity = customerRepository.findById(invoiceRequest.getCustomerId());

		if(!customerEntity.isPresent()){
			throw new RuntimeException("Customer not found");
		}

		InvoiceEntity invoiceEntity = invoiceRepository.save(InvoiceEntity.builder()
				.amount(invoiceRequest.getAmount())
				.billId(invoiceRequest.getBillId())
				.customerEntity(customerEntity.get())
				.paidBy(invoiceRequest.getPaidBy())
				.purchasedOn(LocalDateTime.now())
				.totalAmount(invoiceRequest.getTotalAmount())
				.build());

		return InvoiceResponse.builder().invoiceId(invoiceEntity.getId()).build();
	}
}
