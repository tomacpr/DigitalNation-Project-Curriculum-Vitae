package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EducationController {

	private final EducationService educationService;

	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}

	// TABLE
	@GetMapping("/education")
	public String listSkills(Model model) {
		model.addAttribute("listEducation", educationService.getEducation());
		return "education";
	}

}
