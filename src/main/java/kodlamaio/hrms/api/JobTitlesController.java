package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobTitlesService;
import kodlamaio.hrms.core.utilities.core.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {

    private JobTitlesService jobTitlesService;

    @Autowired
    public JobTitlesController(JobTitlesService jobTitlesService) {
        this.jobTitlesService = jobTitlesService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobTitles>> getAll(){
        return this.jobTitlesService.getAll();
    }
}
