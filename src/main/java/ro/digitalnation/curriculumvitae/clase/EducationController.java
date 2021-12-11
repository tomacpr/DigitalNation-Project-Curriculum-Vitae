package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/education")
public class EducationController {

	private final EducationService educationService;

	@Autowired
	public EducationController(EducationService educationService) {
		this.educationService = educationService;
	}

	@GetMapping
	public List<Education> getEducation() {
		return educationService.getEducation();
	}

}
