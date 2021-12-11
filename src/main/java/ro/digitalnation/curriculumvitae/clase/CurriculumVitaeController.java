package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurriculumVitaeController {

	
	@GetMapping("/index")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
                        @RequestParam(value = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return String.format("Hello %s! %s", name, date);
    }

}
