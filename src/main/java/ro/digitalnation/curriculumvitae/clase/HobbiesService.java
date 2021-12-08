package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbiesService {

	private final HobbiesInterface hobbiesInterface;
	
	@Autowired
	public HobbiesService(HobbiesInterface hobbiesInterface) {
		this.hobbiesInterface = hobbiesInterface;
	}

	public int addHobbies(Hobbies hobbies) {
		return hobbiesInterface.insertHobbies(hobbies);
	}
	
	public List<Hobbies> getHobbies() {
		return hobbiesInterface.selectAllHobbies();
	}
	
	public Optional<Hobbies> getHobbiesById(UUID id){
		return hobbiesInterface.selectHobbiesById(id);
		}	
}
