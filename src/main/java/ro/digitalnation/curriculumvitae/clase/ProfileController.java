package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {

	private final ProfileService profileService;

	@Autowired
	public ProfileController(ProfileService profileService) {
		super();
		this.profileService = profileService;
	}

	// TABLE
	@GetMapping("/profile")
	public String getProfile(Model model) {
		model.addAttribute("profile", profileService.getProfile());
		return "profile";
	}

	// UPDATE TEMPLATE
	@GetMapping("/profile/update/{id}")
	public String updateProfile(@PathVariable(value = "id") long id, Model model) {
		Profile showProfile = profileService.getProfileById(id);
		model.addAttribute("updateProfile", showProfile);
		return "updateProfile";
	}

	// UPDATE
	@PostMapping("/profile/upd")
	public String updProfile(@ModelAttribute("updProfile") Profile updProfile) {
		profileService.updProfile(updProfile);
		return "redirect:/profile";
	}

}
