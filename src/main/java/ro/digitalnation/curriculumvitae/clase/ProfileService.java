package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements ProfileServ {
	
	private final ProfileRepository profileRepository;
	
	@Autowired
	public ProfileService(ProfileRepository profileRepository) {
		super();
		this.profileRepository = profileRepository;
	}
	
	public List<Profile> getProfile() {
		return profileRepository.findAll();
	}
	
	public void updProfile(Profile updateProfile) {
		System.out.println("Profile updated !");
		profileRepository.save(updateProfile);
	}

	@Override
	public Profile getProfileById(long id) {
		Optional<Profile> optional = profileRepository.findById(id);
		Profile skill = null;
		if (optional.isPresent()) {
			skill = optional.get();
		} else {
			throw new RuntimeException(" Profile not found !");
		}
		return skill;
	}

}
