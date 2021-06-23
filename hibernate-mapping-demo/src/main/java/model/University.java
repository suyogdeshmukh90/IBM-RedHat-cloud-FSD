package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="university")
public class University {
	private static final String universityDetails = null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer university_id;
	@Column(name="univerisy_name")
	private String universityName;
	@Column(name="country")
	private String country;
	@OneToMany(mappedBy = "universityDetails", cascade = CascadeType.ALL)
	private List<Student> student;
	public void add(Student std)
	{
		if(student==null)
		{
			student=new ArrayList<Student>();
			
		}
		student.add(std);
		std.setUniversityDetails(this);
	}
}
