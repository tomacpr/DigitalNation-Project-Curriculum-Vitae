package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurriculumVitaeController {

	
	
	
	/*Date dNow = new Date();
	LocalDate dateFrom = LocalDate.parse("2018-05-20");
	LocalDate dateTo = LocalDate.now();

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
                        @RequestParam(value = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return String.format("Hello %s! %s", name, date);
    }
	
	@GetMapping("/personalInfo")
	public PersonalInfo pInfo(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new PersonalInfo(name, "Ciprian", "Jr. Java Developer", "Lebedei nr 15, Brasov", 0747453555,
				"tomacpr@gmail.com", dNow, "Toma_Ciprian");
	}

	@GetMapping("/summary")
	public Summary summary() {
		return new Summary(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
	}

	@GetMapping("/experience")
	public Experience experience(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Experience("Continuous Improvement Engineer", "Schaeffler Romania", dateFrom, dateTo,
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
	}

	@GetMapping("/education")
	public Education education() {
		return new Education("Bachelor's Degree, Industrial Design - Transilvania University", dNow, dNow,
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
	}

	@GetMapping("/skills")
	public Skills skills() {
		return new Skills("Java", 2.5);
	}

	@GetMapping("/hobbies")
	public Hobbies hobbies() {
		return new Hobbies("MTB Trails", 7.5);
	}

	@GetMapping("/certification")
	public Certification certification() {
		return new Certification("Train the Trainers", "Dale Carnegie", dNow);
	}*/
}
