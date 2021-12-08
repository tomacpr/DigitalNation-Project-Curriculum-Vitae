package ro.digitalnation.curriculumvitae.clase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/personalInfo")
public class PersonalInfoController {

	private final PersonalInfoService personalInfoService;

	@Autowired
	public PersonalInfoController(PersonalInfoService personalInfoService) {
		this.personalInfoService = personalInfoService;
	}

	@GetMapping
	public List<PersonalInfo> getPersonalInfo() {
		return personalInfoService.getPersonalInfo();
	}

}
