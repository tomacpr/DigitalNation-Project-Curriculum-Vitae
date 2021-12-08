package ro.digitalnation.curriculumvitae.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public class SkillsAccesDataService implements SkillsInterface {
	
	private final List<Skills> DB = new ArrayList<>();

	@Override
	public int insertSkills(UUID id, Skills skills) {
		DB.add(new Skills(id, skills.getSkill()));
		return 0;
	}

	@Override
	public List<Skills> selectAllSkills() {
		return DB;
	}

	@Override
	public Optional<Skills> selectSkillsById(UUID id) {
		return DB.stream().filter(skills -> skills.getId().equals(id)).findFirst();
	}
	
	

}
