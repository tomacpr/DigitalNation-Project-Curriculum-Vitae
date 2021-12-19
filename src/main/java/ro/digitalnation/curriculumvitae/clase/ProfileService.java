package ro.digitalnation.curriculumvitae.clase;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
	
	public Profile getProfile() {
		return new Profile("Junior Java developer with main goal to improve my programming skills and develop as many applications as possible.");
	}

}
