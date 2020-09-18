package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * PublisherRepository
 *
 * @author Denis_Kholmogorov
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
