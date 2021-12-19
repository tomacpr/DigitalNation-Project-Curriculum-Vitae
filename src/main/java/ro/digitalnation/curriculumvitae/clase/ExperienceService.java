package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements ExperienceServ {

	private final ExperienceRepository experienceRepository;

	@Autowired
	public ExperienceService(ExperienceRepository experienceRepository) {
		super();
		this.experienceRepository = experienceRepository;
	}

	public List<Experience> getExperience() {
		return experienceRepository.findAll();
	}
	
	public void addNewExperience(Experience addExperience) {
		System.out.println("Added new experince " + addExperience + " !");
		Optional<Experience> experinceOptional = experienceRepository.findExperienceByPosition(addExperience.getPosition());
		if (experinceOptional.isPresent()) {
			throw new IllegalStateException("Experience already exist !");
		}
		experienceRepository.save(addExperience);
	}
	
	public void deleteExperience(Long experienceId) {
		System.out.println("Deleted experince with id number " + experienceId + " !");
		boolean exists = experienceRepository.existsById(experienceId);
		if (!exists) {
			throw new IllegalStateException("Experince with id " + experienceId + " does not exists");
		}
		experienceRepository.deleteById(experienceId);
	}
	
	public Optional<Experience> getExperiencesById(Long id) {
		boolean exists = experienceRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Experience with id " + id + " does not exists");
		}
		return experienceRepository.findById(id);
	}

	@Override
	public Experience getExperienceById(long id) {
		Optional<Experience> optional = experienceRepository.findById(id);
		Experience experience = null;
		if (optional.isPresent()) {
			experience = optional.get();
		} else {
			throw new RuntimeException("Experience not found for id : " + id);
		}
		return experience;
	}
	

	/*@Transactional
	public void updateExperience(Long experienceId, String position, String company, String description,
			LocalDate dateFrom, LocalDate dateTo) {
		Experience experience = experienceRepository.findById(experienceId)
				.orElseThrow(() -> new IllegalStateException("Experience with id " + experienceId + " does not exist"));
		if (position != null && position.length() > 0 && !Objects.equals(experience.getPosition(), position)) {
			experience.setPosition(position);
		}
		if (company != null && company.length() > 0 && !Objects.equals(experience.getCompany(), company)) {
			experience.setCompany(company);
		}
		if (description != null && description.length() > 0
				&& !Objects.equals(experience.getDescription(), description)) {
			experience.setDescription(description);
		}
		if (dateFrom != null && dateFrom.lengthOfYear() > 0 && !Objects.equals(experience.getDateFrom(), dateFrom)) {
			experience.setDateFrom(null);
		}
		if (dateTo != null && dateTo.lengthOfYear() > 0 && !Objects.equals(experience.getDateFrom(), dateTo)) {
			experience.setDateFrom(null);
		}
	}*/

}
