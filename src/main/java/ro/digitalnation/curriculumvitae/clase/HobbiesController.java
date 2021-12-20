package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HobbiesController {

	private final HobbiesService hobbiesService;

	@Autowired
	public HobbiesController(HobbiesService hobbiesService) {
		super();
		this.hobbiesService = hobbiesService;
	}

	// TABLE
	@GetMapping("/hobbies")
	public String getHobbies(Model model) {
		model.addAttribute("listHobbies", hobbiesService.getHobbies());
		return "hobbies";
	}

	// ADD TEMPLATE
	@GetMapping("/hobbies/new")
	public String createHobbyForm(Model model) {
		Hobbies newHobby = new Hobbies();
		model.addAttribute("newHobby", newHobby);
		return "addHobby";
	}

	// ADD
	@PostMapping("/hobbies/add")
	public String registerNewHobbies(@ModelAttribute("addHobby") Hobbies addHobby) {
		hobbiesService.addNewHobbies(addHobby);
		return "redirect:/hobbies";
	}

	// UPDATE
	/*@GetMapping("/hobbies/update/{id}")
	public String updateHobbies(@PathVariable(value = "id") long id, Model model) {
		Hobbies showHobby = hobbiesService.getHobbiesById(id);
		model.addAttribute("updateHobby", showHobby);
		return "updateHobby";
	}*/

	// DELETE
	@GetMapping("/hobbies/delete/{id}")
	public String deleteHobbyFromTable(@PathVariable("id") Long hobbyId) {
		hobbiesService.deleteHobbies(hobbyId);
		return "redirect:/hobbies";
	}

}
