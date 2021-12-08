package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SkillsInterface {
	
	int insertSkills(UUID id, Skills skills);
	
	default int insertSkills(Skills skills) {
		UUID id = UUID.randomUUID();
		return insertSkills(id, skills);
	}
	
	List<Skills> selectAllSkills();
	
	Optional<Skills> selectSkillsById(UUID id);

}
