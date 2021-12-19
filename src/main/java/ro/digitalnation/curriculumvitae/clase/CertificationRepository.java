package ro.digitalnation.curriculumvitae.clase;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {

	@Query("SELECT s FROM Certification s WHERE s.organization = ?1")
	Optional<Certification> findCertificationByCompetence(String competence);

}
