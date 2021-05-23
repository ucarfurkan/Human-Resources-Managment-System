package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.core.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitles;

import java.util.List;

public interface JobTitlesService {
    DataResult<List<JobTitles>> getAll();
}
