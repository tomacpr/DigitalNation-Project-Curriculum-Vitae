package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalInfoController {

	private final PersonalInfoService personalInfoService;

	@Autowired
	public PersonalInfoController(PersonalInfoService personalInfoService) {
		super();
		this.personalInfoService = personalInfoService;
	}

	// TABLE
	@GetMapping("/info")
	public String listPinfo(Model model) {
		model.addAttribute("listPinfo", personalInfoService.getPersonalInfo());
		return "info";
	}

}
