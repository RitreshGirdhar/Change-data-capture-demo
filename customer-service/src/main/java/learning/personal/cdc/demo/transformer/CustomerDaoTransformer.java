package learning.personal.cdc.demo.transformer;

import learning.personal.cdc.demo.entity.CustomerEntity;
import learning.personal.cdc.demo.models.CustomerResponse;
import org.springframework.stereotype.Service;

@Service
public class CustomerDaoTransformer extends Transformer<CustomerEntity, CustomerResponse>{

    @Override
    public CustomerResponse transform(CustomerEntity customerEntity) {
       return CustomerResponse.builder()
               .id(customerEntity.getId())
               .firstName(customerEntity.getFirstName())
               .build();
    }
}
