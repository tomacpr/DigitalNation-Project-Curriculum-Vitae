package ro.digitalnation.curriculumvitae.clase;

public class Skills {

	public String skill;
	public double rating;

	public Skills(String skill, double rating) {
		super();
		this.skill = skill;
		this.rating = rating;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Skills [skill=" + skill + ", rating=" + rating + "]";
	}

}
