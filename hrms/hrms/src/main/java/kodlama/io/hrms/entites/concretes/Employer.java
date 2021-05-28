package kodlama.io.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "employers")
public class Employer extends User {
//	@Id
//	@GeneratedValue
//	@Column(name= "user_id")
//	private int userId;
	@Column(name= "company_name")
	private String companyName;
	
	@Column(name= "website")
	private String website;
	
	@Column(name= "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;
}
