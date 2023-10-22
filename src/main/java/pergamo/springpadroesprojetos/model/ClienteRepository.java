package pergamo.springpadroesprojetos.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
