package learning.personal.cdc.demo.dao.repositories;

import learning.personal.cdc.demo.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity,String> {

	
}
