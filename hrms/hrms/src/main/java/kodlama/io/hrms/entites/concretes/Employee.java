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
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "employees")
public class Employee extends User {

//	@Id
//	@GeneratedValue
//	@Column(name = "user_id")
//	private int userId;
	
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

   
}
