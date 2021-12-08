package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

	public List<Experience> getExperience() {
		return List.of(new Experience(1, "Lean", "Schaeffler", LocalDate.of(2015, Month.SEPTEMBER, 1), LocalDate.now(),
				"Specialist imbunatatire continua"));
	}
	
	/*public void calculatePeriod(LocalDate dateFrom, LocalDate dateTo) {
		Period period = Period.between(dateFrom, dateTo);
		System.out.println(period.getYears() + " years and " + period.getMonths() + " months");
	}*/
}
