package learning.personal.cdc.demo.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class InvoiceRequest {

	private Double amount;
	private Double totalAmount;
	private Long billId;
	private LocalDateTime purchasedOn;
	private String paidBy;
	private Long customerId;

}
