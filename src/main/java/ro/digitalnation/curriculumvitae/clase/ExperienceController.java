package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExperienceController {

	private final ExperienceService experienceService;

	@Autowired
	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}

	// TABLE
	@GetMapping("/experience")
	public String listExperience(Model model) {
		model.addAttribute("listExperience", experienceService.getExperience());
		return "experience";
	}

	// ADD TEMPLATE
	@GetMapping("/experience/new")
	public String createExperienceForm(Model model) {
		Experience newExperience = new Experience();
		model.addAttribute("newExperience", newExperience);
		return "addExperience";
	}

	// ADD
	@PostMapping("/experience/add")
	public String registerNewExperience(@ModelAttribute("addExperience") Experience addExperience) {
		experienceService.addNewExperience(addExperience);
		return "redirect:/experience";
	}

	// UPDATE TEMPLATE
	@GetMapping("/experience/update/{id}")
	public String updateExperience(@PathVariable(value = "id") long id, Model model) {
		Experience showExperience = experienceService.getExperienceById(id);
		model.addAttribute("updateExperience", showExperience);
		return "updateExperience";
	}

	// UPDATE
	@PostMapping("/experience/upd")
	public String updExperience(@ModelAttribute("updExperience") Experience updExperience) {
		experienceService.updExperience(updExperience);
		return "redirect:/experience";
	}

	// DELETE
	@GetMapping("/experience/delete/{id}")
	public String deleteExperienceFromTable(@PathVariable("id") Long experienceId) {
		experienceService.deleteExperience(experienceId);
		return "redirect:/experience";
	}

	// RestController
	/*
	 * @GetMapping public List<Experience> getExperience() { return
	 * experienceService.getExperience(); }
	 * 
	 * @GetMapping(path = "{id}") public Experience
	 * getExpeienceById(@PathVariable("id") Long id) { return
	 * experienceService.getExperienceById(id).orElse(null); }
	 * 
	 * @PostMapping public void registerNewExperience(@RequestBody Experience
	 * experience) { experienceService.addNewExperience(experience); }
	 * 
	 * @DeleteMapping(path = "{experienceId}") public void
	 * deleteExperience(@PathVariable("experienceId") Long experienceId) {
	 * experienceService.deleteExperience(experienceId); }
	 * 
	 * @PutMapping(path = "{experienceId}") public void
	 * updateExperience(@PathVariable("experienceId") Long experienceId,
	 * 
	 * @RequestParam(required = false) String position, @RequestParam(required =
	 * false) String company,
	 * 
	 * @RequestParam(required = false) String description, @RequestParam(required =
	 * false) LocalDate dateFrom,
	 * 
	 * @RequestParam(required = false) LocalDate dateTo) {
	 * experienceService.updateExperience(experienceId, position, company,
	 * description, dateFrom, dateTo); }
	 */
}
