package kodlama.io.hrms.business.abstarcts;

import java.util.List;

import kodlama.io.hrms.entites.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
