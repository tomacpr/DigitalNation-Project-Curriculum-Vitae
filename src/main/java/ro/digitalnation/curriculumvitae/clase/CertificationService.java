package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificationService implements CertificationServ {

	private final CertificationRepository certificationRepository;

	@Autowired
	public CertificationService(CertificationRepository certificationRepository) {
		super();
		this.certificationRepository = certificationRepository;
	}

	public List<Certification> getCertification() {
		return certificationRepository.findAll();
	}
	
	public void addNewCertification(Certification addCertification) {
		System.out.println("Added new certification " + addCertification + " !");
		Optional<Certification> certificationOptional = certificationRepository.findCertificationByCompetence(addCertification.getCompetence());
		if (certificationOptional.isPresent()) {
			throw new IllegalStateException("Certification already exist !");
		}
		certificationRepository.save(addCertification);
	}
	
	public void deleteCertification(Long certificationId) {
		boolean exists = certificationRepository.existsById(certificationId);
		if (!exists) {
			throw new IllegalStateException("Certification with id " + certificationId + " does not exists !");
		}
		certificationRepository.deleteById(certificationId);
	}
	
	public Optional<Certification> getCertificationsById(Long id) {
		boolean exists = certificationRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Certification with id " + id + " does not exists !");
		}
		return certificationRepository.findById(id);
	}

	@Override
	public Certification getCertificationById(long id) {
		Optional<Certification> optional = certificationRepository.findById(id);
		Certification certification = null;
		if (optional.isPresent()) {
			certification = optional.get();
		} else {
			throw new RuntimeException("Certification not found for id : " + id);
		}
		return certification;
	}

	//RestController
	/*@Transactional
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
	}*/
}
