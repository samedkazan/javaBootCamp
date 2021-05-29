package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAllSortedByActive();
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
	Result add(JobAdvertisement advertisement);
	Result update(JobAdvertisement advertisement);
}
