package ro.digitalnation.curriculumvitae.clase;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
	
	//@Query("SELECT s FROM Experience s WHERE s.position = ?1")
	Optional<Experience> findExperienceByPosition(String position);

}
