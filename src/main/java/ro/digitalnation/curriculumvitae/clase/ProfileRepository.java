package ro.digitalnation.curriculumvitae.clase;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>{

	Optional<Profile> findSkillsByProfile(String profile);
}
