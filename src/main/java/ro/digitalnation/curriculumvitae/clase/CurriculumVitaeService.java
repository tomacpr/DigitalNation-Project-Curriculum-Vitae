package ro.digitalnation.curriculumvitae.clase;

import org.springframework.stereotype.Service;

@Service
public class CurriculumVitaeService {
	
	public CurriculumVitae getProfile() {
		return new CurriculumVitae ("Junior", null, null, null, 0747453510, null, null, null, null, null, null);
	}

	
}
