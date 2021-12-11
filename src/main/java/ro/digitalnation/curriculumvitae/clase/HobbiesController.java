package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hobbies")
public class HobbiesController {

	private final HobbiesService hobbiesService;

	@Autowired
	public HobbiesController(HobbiesService hobbiesService) {
		this.hobbiesService = hobbiesService;
	}

	@GetMapping
	public List<Hobbies> getHobbies() {
		return hobbiesService.getHobbies();
	}

	@GetMapping(path = "{id}")
	public Hobbies getHobbiesById(@PathVariable("id") Long id) {
		return hobbiesService.getHobbiesById(id).orElse(null);
	}

	@PostMapping
	public void registerNewHobbies(@RequestBody Hobbies hobbies) {
		hobbiesService.addNewHobbies(hobbies);
	}

	@DeleteMapping(path = "{hobbiesId}")
	public void deleteCertification(@PathVariable("hobbiesId") Long hobbiesId) {
		hobbiesService.deleteHobbies(hobbiesId);
	}

}
