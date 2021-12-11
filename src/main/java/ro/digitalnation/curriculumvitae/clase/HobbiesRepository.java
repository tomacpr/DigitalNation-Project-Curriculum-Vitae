package ro.digitalnation.curriculumvitae.clase;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HobbiesRepository extends JpaRepository<Hobbies, Long> {

	@Query("SELECT s FROM Hobbies s WHERE s.hobby = ?1")
	Optional<Hobbies> findHobbiesByHobby(String hobby);
}
