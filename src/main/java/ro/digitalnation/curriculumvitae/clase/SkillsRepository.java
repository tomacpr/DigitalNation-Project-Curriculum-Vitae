package ro.digitalnation.curriculumvitae.clase;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {

	@Query("SELECT s FROM Skills s WHERE s.skill = ?1")
	Optional<Skills> findSkillsBySkill(String skill);

}
