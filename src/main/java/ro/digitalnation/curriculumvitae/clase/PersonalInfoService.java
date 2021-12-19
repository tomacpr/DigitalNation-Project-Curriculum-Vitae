package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalInfoService {
	
	private final PersonalInfoRepository personalInfoRepository;
	
	@Autowired
	public PersonalInfoService(PersonalInfoRepository personalInfoRepository) {
		super();
		this.personalInfoRepository = personalInfoRepository;
	}

	public List<PersonalInfo> getPersonalInfo() {
		PersonalInfo pInfo = new PersonalInfo("Toma", "Ciprian", "Inginer", "str Lebedei, Brasov", 0747453555,
				"ciprian.toma@digitalexplorer.ro", LocalDate.of(1992, Month.OCTOBER, 10), "tomacpr");
		return personalInfoRepository.saveAll(List.of(pInfo));
	}
}
