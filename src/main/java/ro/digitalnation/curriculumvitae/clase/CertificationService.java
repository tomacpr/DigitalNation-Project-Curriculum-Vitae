package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificationService {

	private final CertificationRepository certificationRepository;

	@Autowired
	public CertificationService(CertificationRepository certificationRepository) {
		this.certificationRepository = certificationRepository;
	}

	public List<Certification> getCertification() {
		return certificationRepository.findAll();
	}

	/*
	 * public void addNewCertification(Certification certification) {
	 * System.out.println(certification); }
	 */

	public void addNewCertification(Certification certification) {
		Optional<Certification> certificationOptional = certificationRepository
				.findCertificationByOrganization(certification.getOrganization());
		if (certificationOptional.isPresent()) {
			throw new IllegalStateException("organization exist");
		}
		certificationRepository.save(certification);
	}

	public void deleteCertification(Long certificationId) {
		boolean exists = certificationRepository.existsById(certificationId);
		if (!exists) {
			throw new IllegalStateException("certification with id " + certificationId + " does not exists");
		}
		certificationRepository.deleteById(certificationId);
	}

	@Transactional
	public void updateCertification(Long certificationId, String competence, String organization,
			LocalDate attainedDate) {
		Certification certification = certificationRepository.findById(certificationId).orElseThrow(
				() -> new IllegalStateException("Certification with id " + certificationId + " does not exist"));
		if (competence != null && competence.length() > 0
				&& !Objects.equals(certification.getCompetence(), competence)) {
			certification.setCompetence(competence);
		}
		if (organization != null && organization.length() > 0
				&& !Objects.equals(certification.getOrganization(), organization)) {
			Optional<Certification> certificationOptional = certificationRepository
					.findCertificationByOrganization(organization);
			if (certificationOptional.isPresent()) {
				throw new IllegalStateException("organization exist");
			}
			certification.setOrganization(organization);
		}
		if (attainedDate != null && attainedDate.lengthOfYear() > 0
				&& !Objects.equals(certification.getAttainedDate(), attainedDate)) {
			certification.setAttainedDate(null);
		}
	}
}
