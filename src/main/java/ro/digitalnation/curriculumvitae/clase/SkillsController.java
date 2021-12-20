package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SkillsController {

	private final SkillsService skillsService;

	@Autowired
	public SkillsController(SkillsService skillsService) {
		super();
		this.skillsService = skillsService;
	}

	// TABLE
	@GetMapping("/skills")
	public String listSkills(Model model) {
		model.addAttribute("listSkills", skillsService.getSkills());
		return "skills";
	}

	//RESTController
	/*
	 * @GetMapping(path = "/skills/{id}") public Skills
	 * getSkillsById(@PathVariable("id") Long id) { return
	 * skillsService.getSkillsById(id).orElse(null); }
	 */

	// ADD TEMPLATE
	@GetMapping("/skills/new")
	public String createSKillsForm(Model model) {
		Skills newSkill = new Skills();
		model.addAttribute("newSkill", newSkill);
		return "addSkill";
	}

	// ADD
	@PostMapping("/skills/add")
	public String registerNewSkills(@ModelAttribute("addSkill") Skills addSkill) {
		skillsService.addNewSkills(addSkill);
		return "redirect:/skills";
	}
	
	// UPDATE TEMPLATE
	@GetMapping("/skills/update/{id}")
	public String updateSkill(@PathVariable(value = "id") long id, Model model) {
		Skills showSkill = skillsService.getSkillById(id);
		model.addAttribute("updateSkill", showSkill);
		return "updateSkill";
	}
	
	// UPDATE
		@PostMapping("/skills/upd")
		public String updSkills(@ModelAttribute("updSkill") Skills updSkill) {
			skillsService.updSkills(updSkill);
			return "redirect:/skills";
		}

	// DELETE
	@GetMapping("/skills/delete/{id}")
	public String deleteSkillFromTable(@PathVariable("id") Long skillsId) {
		skillsService.deleteSkills(skillsId);
		return "redirect:/skills";
	}

	//RESTController
	/*
	 * @DeleteMapping("/skills/{skillId}") public void
	 * deleteSkillById(@PathVariable("skillId") Long skillId) {
	 * skillsService.deleteSkills(skillId); }
	 */

}
