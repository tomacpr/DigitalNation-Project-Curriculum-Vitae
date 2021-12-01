package ro.digitalnation.curriculumvitae.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ro.digitalnation.curriculumvitae.clase.Certification;
import ro.digitalnation.curriculumvitae.clase.Education;
import ro.digitalnation.curriculumvitae.clase.Experience;
import ro.digitalnation.curriculumvitae.clase.Greeting;
import ro.digitalnation.curriculumvitae.clase.Hobbies;
import ro.digitalnation.curriculumvitae.clase.PersonalInfo;
import ro.digitalnation.curriculumvitae.clase.Skills;
import ro.digitalnation.curriculumvitae.clase.Summary;

@RestController
public class CurriculumVitaeController {

	Date dNow = new Date();

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
	public Experience experience() {
		return new Experience("Continuous Improvement Engineer", "Schaeffler Romania", dNow, dNow,
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
	}
}
