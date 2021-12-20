package ro.digitalnation.curriculumvitae.clase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Profile")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Identification", updatable = true)
	private long id;
	
	@Column(name = "Profile", nullable = false, columnDefinition = "TEXT")
	public String profile;

	public Profile() {
		super();
	}

	public Profile(String profile) {
		super();
		this.profile = profile;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", profile=" + profile + "]";
	}

}
