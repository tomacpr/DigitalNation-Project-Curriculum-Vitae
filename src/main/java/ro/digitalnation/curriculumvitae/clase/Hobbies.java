package ro.digitalnation.curriculumvitae.clase;

public class Hobbies {
	public String hobby;
	public double rating;

	public Hobbies(String hobby, double rating) {
		super();
		this.hobby = hobby;
		this.rating = rating;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hobbies [hobby=" + hobby + ", rating=" + rating + "]";
	}

}
