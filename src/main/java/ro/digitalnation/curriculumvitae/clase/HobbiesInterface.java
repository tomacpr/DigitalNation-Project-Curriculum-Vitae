package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HobbiesInterface {

	int insertHobbies(UUID id, Hobbies hobbies);

	default int insertHobbies(Hobbies hobbies) {
		UUID id = UUID.randomUUID();
		return insertHobbies(id, hobbies);
	}

	List<Hobbies> selectAllHobbies();
	
	Optional<Hobbies> selectHobbiesById(UUID id);

}
