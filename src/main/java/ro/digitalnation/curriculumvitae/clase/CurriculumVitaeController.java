package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurriculumVitaeController {
	
	private final CurriculumVitaeService curriculumVitaeService;
	
	@Autowired
	public CurriculumVitaeController(CurriculumVitaeService curriculumVitaeService) {
		super();
		this.curriculumVitaeService = curriculumVitaeService;
	}
	
	//SHOW
	@GetMapping("/cv")
		public CurriculumVitae getCv() {
			return curriculumVitaeService.getProfile();
		}

}
