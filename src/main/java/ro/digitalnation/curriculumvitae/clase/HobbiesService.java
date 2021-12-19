package ro.digitalnation.curriculumvitae.clase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbiesService implements HobbiesServ {

	private final HobbiesRepository hobbiesRepository;

	@Autowired
	public HobbiesService(HobbiesRepository hobbiesRepository) {
		super();
		this.hobbiesRepository = hobbiesRepository;
	}

	public List<Hobbies> getHobbies() {
		return hobbiesRepository.findAll();
	}

	public void addNewHobbies(Hobbies addHobbies) {
		System.out.println("Added new hobbie " + addHobbies + " !");
		Optional<Hobbies> hobbiesOptional = hobbiesRepository.findHobbiesByHobby(addHobbies.getHobby());
		if (hobbiesOptional.isPresent()) {
			throw new IllegalStateException("Hobby already exist !");
		}
		hobbiesRepository.save(addHobbies);
	}

	public void deleteHobbies(Long hobbyId) {
		System.out.println("Deleted hobby with id number " + hobbyId + " !");
		boolean exists = hobbiesRepository.existsById(hobbyId);
		if (!exists) {
			throw new IllegalStateException("Hobbie with id " + hobbyId + " does not exists !");
		}
		hobbiesRepository.deleteById(hobbyId);
	}

	public Optional<Hobbies> getHobbiesById(Long id) {
		boolean exists = hobbiesRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Hobby with id " + id + " does not exists !");
		}
		return hobbiesRepository.findById(id);
	}

	@Override
	public Hobbies getHobbiesById(long id) {
		Optional<Hobbies> optional = hobbiesRepository.findById(id);
		Hobbies hobby = null;
		if (optional.isPresent()) {
			hobby = optional.get();
		} else {
			throw new RuntimeException("Hobby not found for id : " + id + ".");
		}
		return hobby;
	}

}
