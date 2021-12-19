package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CertificationConfig {

	@Bean
	CommandLineRunner commandLineRunner(CertificationRepository repository) {
		return args -> {
			Certification tTt = new Certification("Train The Trainer", "Dale Carnagie",
					LocalDate.of(2016, Month.NOVEMBER, 12));
			
			Certification lSi = new Certification("Individual Situational Leadership", "Blanchard International",
					LocalDate.of(2018, Month.MAY, 14));
			
			Certification pl = new Certification("Personal Leadership", "Dale Carnagie",
					LocalDate.of(2018, Month.SEPTEMBER, 22));

			Certification linkA = new Certification("Java Development", "LinkAcademy",
					LocalDate.of(2021, Month.JANUARY, 21));

			repository.saveAll(List.of(tTt, lSi, pl, linkA));
		};
	}
}
