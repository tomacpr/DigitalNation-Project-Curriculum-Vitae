package ro.digitalnation.curriculumvitae.clase;

public class Summary {

	public String summary;

	public Summary(String summary) {
		super();
		this.summary = summary;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Summary [summary=" + summary + "]";
	}

}
