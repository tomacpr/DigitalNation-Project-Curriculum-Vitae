package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurriculumVitaeController {

	private final ExperienceService experienceService;
	private final EducationService educationService;
	private final SkillsService skillsService;
	private final CertificationService certificationService;
	private final HobbiesService hobbiesService;
	private final PersonalInfoService personalInfoService;

	@Autowired
	public CurriculumVitaeController(ExperienceService experienceService, EducationService educationService,
			SkillsService skillsService, CertificationService certificationService, HobbiesService hobbiesService,
			PersonalInfoService personalInfoService) {
		super();
		this.experienceService = experienceService;
		this.educationService = educationService;
		this.skillsService = skillsService;
		this.certificationService = certificationService;
		this.hobbiesService = hobbiesService;
		this.personalInfoService = personalInfoService;
	}

	// TABLE
	@GetMapping("/cv")
	public String listExperience(Model model) {
		model.addAttribute("listExperience", experienceService.getExperience());
		model.addAttribute("listEducation", educationService.getEducation());
		model.addAttribute("listSkills", skillsService.getSkills());
		model.addAttribute("listCertifications", certificationService.getCertification());
		model.addAttribute("listHobbies", hobbiesService.getHobbies());
		model.addAttribute("listPinfo", personalInfoService.getPersonalInfo());
		return "cv";
	}

}
