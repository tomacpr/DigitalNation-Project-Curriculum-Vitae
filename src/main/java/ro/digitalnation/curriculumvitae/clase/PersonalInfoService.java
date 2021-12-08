package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonalInfoService {

	public List<PersonalInfo> getPersonalInfo() {
		return List.of(new PersonalInfo("Toma", "Ciprian", "Inginer", "str Lebedei, Brasov", 0747453555,
				"ciprian.toma@digitalexplorer.ro", LocalDate.of(1992, Month.OCTOBER, 10), "tomacpr"));
	}
}
