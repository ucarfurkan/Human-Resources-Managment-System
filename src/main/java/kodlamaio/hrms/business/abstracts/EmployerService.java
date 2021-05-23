package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.core.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();

}
