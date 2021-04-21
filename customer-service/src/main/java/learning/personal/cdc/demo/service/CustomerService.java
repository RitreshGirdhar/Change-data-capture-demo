package learning.personal.cdc.demo.service;

import learning.personal.cdc.demo.dao.repositories.CustomerRepository;
import learning.personal.cdc.demo.entity.CustomerEntity;
import learning.personal.cdc.demo.models.CustomerRequest;
import learning.personal.cdc.demo.models.CustomerResponse;
import learning.personal.cdc.demo.transformer.CustomerDaoTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service public class CustomerService {

	@Autowired private CustomerRepository customerRepository;

	@Autowired private CustomerDaoTransformer customerDaoTransformer;

	public CustomerResponse getCustomer(String customerId) throws RuntimeException {
		Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
		if (customerEntity.isPresent()) {
			return customerDaoTransformer.transform(customerEntity.get());
		}
		return CustomerResponse.builder().build();
	}

	public void saveCustomer(CustomerRequest customerRequest) {
		customerRepository
				.save(CustomerEntity.builder()
//						.id(Math.round(Math.random()))
						.firstName(customerRequest.getFirstName())
						.lastName(customerRequest.getLastName())
						.email(customerRequest.getEmail())
						.build());
	}
}
