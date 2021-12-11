package ro.digitalnation.curriculumvitae.clase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Skills {

	@Id
	@SequenceGenerator(name = "skills_sequence", sequenceName = "skills_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skills_sequence")
	@Column(name = "Identification", updatable = false)
	private Long id;

	@Column(name = "Skills", nullable = false, columnDefinition = "TEXT")
	private String skill;

	public Skills() {
	}

	public Skills(String skill) {
		this.skill = skill;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", skill=" + skill + "]";
	}

}
