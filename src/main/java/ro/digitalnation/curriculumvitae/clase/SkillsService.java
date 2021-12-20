package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements SkillsServ {

	private final SkillsRepository skillsRepository;

	@Autowired
	public SkillsService(SkillsRepository skillsRepository) {
		super();
		this.skillsRepository = skillsRepository;
	}

	public List<Skills> getSkills() {
		return skillsRepository.findAll();
	}

	public void addNewSkills(Skills addSkills) {
		System.out.println("Added new skill " + addSkills + " !");
		Optional<Skills> skillsOptional = skillsRepository.findSkillsBySkill(addSkills.getSkill());
		if (skillsOptional.isPresent()) {
			throw new IllegalStateException("Skill already exist !");
		}
		skillsRepository.save(addSkills);
	}
	
	public void updSkills(Skills updateSkills) {
		System.out.println("Updated skill " + updateSkills + " !");
		skillsRepository.save(updateSkills);
	}

	public void deleteSkills(Long skillsId) {
		System.out.println("Deleted skill with id number " + skillsId + " !");
		boolean exists = skillsRepository.existsById(skillsId);
		if (!exists) {
			throw new IllegalStateException("Skill with id " + skillsId + " does not exists !");
		}
		skillsRepository.deleteById(skillsId);
	}

	public Optional<Skills> getSkillsById(Long id) {
		boolean exists = skillsRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Skill with id " + id + " does not exists !");
		}
		return skillsRepository.findById(id);
	}

	@Override
	public Skills getSkillById(long id) {
		Optional<Skills> optional = skillsRepository.findById(id);
		Skills skill = null;
		if (optional.isPresent()) {
			skill = optional.get();
		} else {
			throw new RuntimeException(" Skill not found for id : " + id);
		}
		return skill;
	}

}
