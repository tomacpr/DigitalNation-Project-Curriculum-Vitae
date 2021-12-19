package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

	private final ProfileService profileService;

	@Autowired
	public ProfileController(ProfileService profileService) {
		super();
		this.profileService = profileService;
	}

	@GetMapping("/profile")
	public Profile getProfile() {
		return profileService.getProfile();
	}

}
