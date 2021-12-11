package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {

	private final EducationRepository educationRepository;

	@Autowired
	public EducationService(EducationRepository educationRepository) {
		this.educationRepository = educationRepository;
	}

	public List<Education> getEducation() {
		Education utb = new Education(LocalDate.of(2012, Month.OCTOBER, 01), "Transilvania University",
				"Design de produs si mediu");

		Education highS = new Education(LocalDate.of(2007, Month.SEPTEMBER, 01), "Brancoveanu High School",
				"Matematica-Informatica");

		Education middleS = new Education(LocalDate.of(2003, Month.SEPTEMBER, 15), "Nr. 13 School Brasov", "V - VIII");

		Education lowS = new Education(LocalDate.of(1999, Month.SEPTEMBER, 15), "Nr. 13 School Brasov", "I - IV");

		return educationRepository.saveAll(List.of(utb, highS, middleS, lowS));
	}

}
