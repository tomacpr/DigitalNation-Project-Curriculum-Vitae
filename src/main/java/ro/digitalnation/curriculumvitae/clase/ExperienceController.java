package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/experience")
public class ExperienceController {

	private final ExperienceService experienceService;

	@Autowired
	public ExperienceController(ExperienceService experienceService) {
		this.experienceService = experienceService;
	}

	@GetMapping
	public List<Experience> getExperience() {
		return experienceService.getExperience();
	}

	@GetMapping(path = "{id}")
	public Experience getExpeienceById(@PathVariable("id") Long id) {
		return experienceService.getExperienceById(id).orElse(null);
	}

	@PostMapping
	public void registerNewExperience(@RequestBody Experience experience) {
		experienceService.addNewExperience(experience);
	}

	@DeleteMapping(path = "{experienceId}")
	public void deleteExperience(@PathVariable("experienceId") Long experienceId) {
		experienceService.deleteExperience(experienceId);
	}

	@PutMapping(path = "{experienceId}")
	public void updateExperience(@PathVariable("experienceId") Long experienceId,
			@RequestParam(required = false) String position, @RequestParam(required = false) String company,
			@RequestParam(required = false) String description, @RequestParam(required = false) LocalDate dateFrom,
			@RequestParam(required = false) LocalDate dateTo) {
		experienceService.updateExperience(experienceId, position, company, description, dateFrom, dateTo);
	}
}
