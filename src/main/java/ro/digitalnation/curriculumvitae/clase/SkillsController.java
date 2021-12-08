package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/skills")
public class SkillsController {

	private final SkillsService skillsService;

	@Autowired
	public SkillsController(SkillsService skillsService) {
		this.skillsService = skillsService;
	}

	@PostMapping
	public void addSkills(@RequestBody Skills skills) {
		skillsService.addSkills(skills);
	}
	
	@GetMapping
	public List<Skills> getSkills() {
		return skillsService.getSkills();
	}
	
	@GetMapping(path = "{id}")
	public Skills getSkillsById(@PathVariable("id") UUID id) {
		return skillsService.getSkillsById(id)
				.orElse(null);
	}
}
