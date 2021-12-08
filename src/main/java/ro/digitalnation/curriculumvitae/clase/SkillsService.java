package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {
	
	private final SkillsInterface skillsInterface;
	
	@Autowired
	public SkillsService(SkillsInterface skillsInterface) {
		this.skillsInterface = skillsInterface;
	}

	public int addSkills(Skills skills) {
		return skillsInterface.insertSkills(skills);
	}
	
	public Optional<Skills> getSkillsById(UUID id){
		return skillsInterface.selectSkillsById(id);
		}

	public List<Skills> getSkills() {
		return skillsInterface.selectAllSkills();
	}
	
}
