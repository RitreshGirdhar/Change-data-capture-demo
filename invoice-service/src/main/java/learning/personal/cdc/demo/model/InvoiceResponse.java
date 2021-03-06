package learning.personal.cdc.demo.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceResponse {

	private Long invoiceId;
	private Double amount;
	private Double totalAmount;
	private Long billId;
	private LocalDateTime purchasedOn;
	private String paidBy;
	private Long customerId;

}
