package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CertificationService {

	public List<Certification> getCertification() {
		return List.of(new Certification(1, "LinkAcademy", "Java Development", LocalDate.of(2021, 01, 21)));

	}
}
