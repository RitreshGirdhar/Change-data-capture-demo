package learning.personal.cdc.demo.dao.repositories;

import learning.personal.cdc.demo.entity.InvoiceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends CrudRepository<InvoiceEntity,Long> {

}
