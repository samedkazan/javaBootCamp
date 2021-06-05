package kodlamaio.HrmsDemo.business.abstacts;

import java.util.List;

import kodlamaio.HrmsDemo.core.utilities.results.DataResult;
import kodlamaio.HrmsDemo.core.utilities.results.Result;
import kodlamaio.HrmsDemo.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();

	Result add(JobAdvertisement jobAdvertisement);

	DataResult<List<JobAdvertisement>> findAllByIsActive();

	DataResult<List<JobAdvertisement>> findAllByIsActiveSorted();

	DataResult<List<JobAdvertisement>> findAllByIsActiveAndCompanyName(int id);

	DataResult<JobAdvertisement> setJobAdvertisementDisabled(int id);
}
