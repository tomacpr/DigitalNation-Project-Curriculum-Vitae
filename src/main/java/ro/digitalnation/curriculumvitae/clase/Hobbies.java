package ro.digitalnation.curriculumvitae.clase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "Hobbies")
@Table
public class Hobbies {

	@Id
	@SequenceGenerator(name = "hobbie_sequence", sequenceName = "hobbie_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hobbie_sequence")
	@Column(name = "Identification", updatable = false)
	private Long id;

	@Column(name = "Hobby", updatable = false)
	private String hobby;

	public Hobbies() {
	}

	public Hobbies(String hobby) {
		this.hobby = hobby;
	}

	public Long getId() {
		return id;
	}

	public String getHobby() {
		return hobby;
	}

	@Override
	public String toString() {
		return "Hobbies [id=" + id + ", hobby=" + hobby + "]";
	}

}
