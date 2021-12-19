package ro.digitalnation.curriculumvitae.clase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Skills")
public class Skills {

	@Id
	@SequenceGenerator(name = "skills_sequence", sequenceName = "skills_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skills_sequence")
	@Column(name = "Identification", updatable = false)
	private long id;

	@Column(name = "Skills", nullable = false, columnDefinition = "TEXT")
	private String skill;
	
	@Column(name = "Description", nullable = false, columnDefinition = "TEXT")
	private String description;

	public Skills() {
		super();
	}

	public Skills(String skill, String description) {
		super();
		this.skill = skill;
		this.description = description;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "[skill=" + skill + ", description=" + description + "]";
	}

}
