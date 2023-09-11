package africa.rdi.interninformationsystemapi.data.repositories;

import africa.rdi.interninformationsystemapi.data.models.Intern;
import africa.rdi.interninformationsystemapi.dtos.requestdtos.InternRequestDto;
import org.springframework.data.repository.CrudRepository;

public interface InternRepository extends CrudRepository<Intern, String> {
}
