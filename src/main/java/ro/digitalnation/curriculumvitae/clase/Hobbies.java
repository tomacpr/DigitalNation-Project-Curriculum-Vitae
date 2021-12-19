package ro.digitalnation.curriculumvitae.clase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Hobbies")
public class Hobbies {
	
	@Id
	@SequenceGenerator(name = "hobbies_sequence", sequenceName = "hobbies_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hobbies_sequence")
	@Column(name = "Identification", updatable = false)
	public long id;

	@Column(name = "Hobby", nullable = false, columnDefinition = "TEXT")
	public String hobby;

	public Hobbies() {
		super();
	}

	public Hobbies(String hobby) {
		super();
		this.hobby = hobby;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "[hobby=" + hobby + "]";
	}

	
}
