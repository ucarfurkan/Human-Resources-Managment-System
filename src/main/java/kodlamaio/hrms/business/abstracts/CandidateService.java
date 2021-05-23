package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.core.DataResult;
import kodlamaio.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
}
