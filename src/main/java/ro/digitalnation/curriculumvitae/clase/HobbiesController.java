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
@RequestMapping(path = "/hobbies")
public class HobbiesController {

	private final HobbiesService hobbiesService;

	@Autowired
	public HobbiesController(HobbiesService hobbiesService) {
		this.hobbiesService = hobbiesService;
	}
	
	@PostMapping
	public void addHobbies(@RequestBody Hobbies hobbies) {
		hobbiesService.addHobbies(hobbies);
	}

	@GetMapping
	public List<Hobbies> getAllHobbies() {
		return hobbiesService.getHobbies();
	}
	
	@GetMapping(path = "{id}")
	public Hobbies getHobbiesById(@PathVariable("id") UUID id) {
		return hobbiesService.getHobbiesById(id)
				.orElse(null);
	}
}
