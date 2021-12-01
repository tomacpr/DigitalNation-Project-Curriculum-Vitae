package ro.digitalnation.curriculumvitae.clase;

public class Greeting {

	private final long personalIdentification;
	private final String content;

	public Greeting(long personalIdentification, String content) {
		this.personalIdentification = personalIdentification;
		this.content = content;
	}

	public long getPersonalIdentification() {
		return personalIdentification;
	}

	public String getContent() {
		return content;
	}
}