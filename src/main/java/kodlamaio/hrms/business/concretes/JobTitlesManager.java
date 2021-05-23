package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobTitlesService;
import kodlamaio.hrms.core.utilities.core.DataResult;
import kodlamaio.hrms.core.utilities.core.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitlesDao;
import kodlamaio.hrms.entities.concretes.JobTitles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitlesManager implements JobTitlesService {

    private JobTitlesDao jobTitlesDao;

    @Autowired
    public JobTitlesManager(JobTitlesDao jobTitlesDao) {
        this.jobTitlesDao = jobTitlesDao;
    }

    @Override
    public DataResult<List<JobTitles>> getAll() {

        return
                new SuccessDataResult<List<JobTitles>>(this.jobTitlesDao.findAll(),"İş pozisyonları listelendi.");
    }

}
