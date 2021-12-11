package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, LocalDate> {

}
