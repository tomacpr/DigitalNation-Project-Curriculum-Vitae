package ro.digitalnation.curriculumvitae.clase;

public class Profile {

	public String profile;

	public Profile() {
		super();
	}

	public Profile(String profile) {
		super();
		this.profile = profile;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return profile;
	}

}
