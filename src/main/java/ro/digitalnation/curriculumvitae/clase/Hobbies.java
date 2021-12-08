package ro.digitalnation.curriculumvitae.clase;

import java.util.UUID;

public class Hobbies {

	private final UUID id;
	private final String hobby;

	public Hobbies(UUID id, String hobby) {
		this.id = id;
		this.hobby = hobby;
	}

	public UUID getId() {
		return id;
	}

	public String getHobby() {
		return hobby;
	}

}
