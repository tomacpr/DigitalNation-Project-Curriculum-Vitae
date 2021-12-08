package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EducationService {

	public List<Education> getEducation() {
		return List.of(new Education("Scoala generala nr 13", LocalDate.of(1999, Month.SEPTEMBER, 15), LocalDate.of(2003, Month.JUNE, 15), "scoala primara"));

	}
}
