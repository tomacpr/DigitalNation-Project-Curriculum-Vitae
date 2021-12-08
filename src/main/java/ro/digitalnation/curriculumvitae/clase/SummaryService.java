package ro.digitalnation.curriculumvitae.clase;

import org.springframework.stereotype.Service;

@Service
public class SummaryService {

	public Summary getSummary() {
		return new Summary(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
				+ "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		}
}
