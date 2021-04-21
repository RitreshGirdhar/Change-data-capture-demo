package learning.personal.cdc.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoice")
public class InvoiceEntity {

	Double amount;
	Double totalAmount;
	Long billId;
	LocalDateTime purchasedOn;
	String paidBy;

	@ManyToOne
	CustomerEntity email;

}
