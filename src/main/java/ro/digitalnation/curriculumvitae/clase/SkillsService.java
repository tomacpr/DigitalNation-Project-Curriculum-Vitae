package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {

	private final SkillsRepository skillsRepository;

	@Autowired
	public SkillsService(SkillsRepository skillsRepository) {
		this.skillsRepository = skillsRepository;
	}

	public List<Skills> getSkills() {
		return skillsRepository.findAll();
	}

	public Optional<Skills> getSkillsById(Long id) {
		boolean exists = skillsRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Skill with id " + id + " does not exists");
		}
		return skillsRepository.findById(id);
	}

	public void addNewSkills(Skills skills) {
		System.out.println(skills);
		Optional<Skills> skillsOptional = skillsRepository.findSkillsBySkill(skills.getSkill());
		if (skillsOptional.isPresent()) {
			throw new IllegalStateException("Skill already exist");
		}
		skillsRepository.save(skills);
	}

	public void deleteSkills(Long skillsId) {
		boolean exists = skillsRepository.existsById(skillsId);
		if (!exists) {
			throw new IllegalStateException("skill with id " + skillsId + " does not exists");
		}
		skillsRepository.deleteById(skillsId);
	}

}
