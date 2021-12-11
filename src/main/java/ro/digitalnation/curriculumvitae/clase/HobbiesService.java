package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbiesService {

	private final HobbiesRepository hobbiesRepository;

	@Autowired
	public HobbiesService(HobbiesRepository hobbiesRepository) {
		this.hobbiesRepository = hobbiesRepository;
	}

	public List<Hobbies> getHobbies() {
		return hobbiesRepository.findAll();
	}

	public Optional<Hobbies> getHobbiesById(Long id) {
		boolean exists = hobbiesRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("hobby with id " + id + " does not exists");
		}
		return hobbiesRepository.findById(id);
	}

	public void addNewHobbies(Hobbies hobbies) {
		System.out.println(hobbies);
		Optional<Hobbies> hobbiesOptional = hobbiesRepository.findHobbiesByHobby(hobbies.getHobby());
		if (hobbiesOptional.isPresent()) {
			throw new IllegalStateException("hobby already exist");
		}
		hobbiesRepository.save(hobbies);
	}

	public void deleteHobbies(Long hobbiesId) {
		boolean exists = hobbiesRepository.existsById(hobbiesId);
		if (!exists) {
			throw new IllegalStateException("hobby with id " + hobbiesId + " does not exists");
		}
		hobbiesRepository.deleteById(hobbiesId);
	}

}
