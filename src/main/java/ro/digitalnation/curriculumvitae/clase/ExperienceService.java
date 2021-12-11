package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

	private final ExperienceRepository experienceRepository;

	@Autowired
	public ExperienceService(ExperienceRepository experienceRepository) {
		this.experienceRepository = experienceRepository;
	}

	public List<Experience> getExperience() {
		return experienceRepository.findAll();
	}

	public Optional<Experience> getExperienceById(Long id) {
		boolean exists = experienceRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Experience with id " + id + " does not exists");
		}
		return experienceRepository.findById(id);
	}

	public void addNewExperience(Experience experience) {
		System.out.println(experience);
		experienceRepository.save(experience);
	}

	public void deleteExperience(Long experienceId) {
		boolean exists = experienceRepository.existsById(experienceId);
		if (!exists) {
			throw new IllegalStateException("Experince with id " + experienceId + " does not exists");
		}
		experienceRepository.deleteById(experienceId);
	}

	@Transactional
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

	}

}
