package ro.digitalnation.curriculumvitae.clase;

import java.util.UUID;

public class Skills {

	public UUID id;
	public String skill;

	
	public Skills(UUID id, String skill) {
		this.id = id;
		this.skill = skill;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
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
