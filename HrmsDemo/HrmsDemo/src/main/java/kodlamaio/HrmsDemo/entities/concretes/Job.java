package kodlamaio.HrmsDemo.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jobs")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class Job {
    @Id
    @GeneratedValue
    @Column(name="id")
	private int jobId;
	
    @Column(name="name")
	private String name;
    
    @OneToMany(mappedBy="jobs")
    private List<JobAdvertisement> jobAdvertisement;
	
	
	
	
}
