package ro.digitalnation.curriculumvitae.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public class HobbiesAccesDataService implements HobbiesInterface{

	private final List<Hobbies> DB = new ArrayList<>();
	
	@Override
	public int insertHobbies(UUID id, Hobbies hobbies) {
		DB.add(new Hobbies(id, hobbies.getHobby()));
		return 0;
	}

	@Override
	public List<Hobbies> selectAllHobbies() {
		return DB;
	}

	@Override
	public Optional<Hobbies> selectHobbiesById(UUID id) {
		return DB.stream().filter(hobbies -> hobbies.getId().equals(id)).findFirst();
	}

}
