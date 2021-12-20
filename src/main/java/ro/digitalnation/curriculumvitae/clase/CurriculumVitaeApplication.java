package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurriculumVitaeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CurriculumVitaeApplication.class, args);
	}

	@Autowired
	private SkillsRepository skillsRepository;

	@Autowired
	private ProfileRepository profileRepository;

	@Autowired
	private HobbiesRepository hobbiesRepository;

	@Autowired
	private ExperienceRepository experienceRepository;

	@Override
	public void run(String... args) throws Exception {

		Profile profile = new Profile("Junior Java Developer with main goal being to improve my programming skills and develop as many apps as possible.");
		profileRepository.save(profile);

		Skills skill1 = new Skills("JAVA", "java is...");
		skillsRepository.save(skill1);

		Skills skill2 = new Skills("Git and GitHub", "Git is ...");
		skillsRepository.save(skill2);

		Skills skill3 = new Skills("HTML", "HTML is ....");
		skillsRepository.save(skill3);

		Skills skill4 = new Skills("Cascade Style Sheet", "CSS is...");
		skillsRepository.save(skill4);

		Skills skill5 = new Skills("Spring Boot", "SpringBoot is...");
		skillsRepository.save(skill5);

		Skills skill6 = new Skills("H2 Database", "H2DB is...");
		skillsRepository.save(skill6);

		Hobbies hobby1 = new Hobbies("MTB Trails");
		hobbiesRepository.save(hobby1);

		Hobbies hobby2 = new Hobbies("Swimming");
		hobbiesRepository.save(hobby2);

		Hobbies hobby3 = new Hobbies("Playing squash");
		hobbiesRepository.save(hobby3);

		Hobbies hobby4 = new Hobbies("Playing badminton");
		hobbiesRepository.save(hobby4);

		Hobbies hobby5 = new Hobbies("NEW: learn anything about JAVA :)");
		hobbiesRepository.save(hobby5);

		Hobbies hobby6 = new Hobbies("Hiking");
		hobbiesRepository.save(hobby6);

		Experience exp1 = new Experience("Internship program", "Schaeffler Romania", LocalDate.of(2015, 8, 01),
				LocalDate.of(2015, 10, 01),
				"Completing all tasks set by the Supervisor and assisting wherever possible. Observing existing strategies and techniques and offering suggestions for improvement. Conducting research and collating data");
		experienceRepository.save(exp1);

		Experience exp2 = new Experience("Continuous Improvement Engineer", "Schaeffler Romania",
				LocalDate.of(2015, 10, 01), LocalDate.of(2018, 8, 01),
				"Tasked with investigating, sourcing, and developing solutins to issues throughout the factory. Leading site operations that contribute towards improving manufacturing efficiencies by utilizing lean manufacturing and continuous improvement techniques.");
		experienceRepository.save(exp2);

		Experience exp3 = new Experience("Trainer LEAN Academy", "Schaeffler Romania", LocalDate.of(2018, 8, 01),
				LocalDate.of(2019, 5, 01),
				"Trained other people on the plant to understand lean principles and to apply them in production.");
		experienceRepository.save(exp3);

		Experience exp4 = new Experience("LEAN Specialist", "Schaeffler Romania", LocalDate.of(2019, 5, 01),
				LocalDate.now(),
				"I ensure the understanding and acceptance of the LEAN culture and the implementation methods among the staff within the company. promote a performance mindset at all site levels through Lean events, standardization and simplification initiative.");
		experienceRepository.save(exp4);

		Experience exp5 = new Experience("Programming course - Java Development", "Link Academy Romania",
				LocalDate.of(2019, 12, 01), LocalDate.of(2021, 01, 21),
				"The course had 10 modules. I started by learning the first two modules Core & Advanced Java Programming, participating in online courses, doing exercices given by the teacher. Also, I have learned programming HTML with JS and CSS3 & MySQL Management");
		experienceRepository.save(exp5);

		Experience exp6 = new Experience("Generatia Tech Explorer - Java Track", "Digital Nation",
				LocalDate.of(2021, 9, 01), LocalDate.now(), "The course ...");
		experienceRepository.save(exp6);

	}

}
