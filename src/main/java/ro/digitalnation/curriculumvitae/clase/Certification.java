package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.*;

@Entity(name = "Certification")
@Table
public class Certification {

	@Id
	@SequenceGenerator(name = "certification_sequence", sequenceName = "certification_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "certification_sequence")
	@Column(name = "Identification", updatable = false)
	public Long id;

	@Column(name = "Competence", nullable = false, columnDefinition = "TEXT")
	public String competence;

	@Column(name = "Organization", nullable = false, columnDefinition = "TEXT")
	public String organization;

	@Column(name = "Attained", nullable = false, columnDefinition = "DATE")
	public LocalDate attainedDate;

	@Transient
	public Integer time;

	public Certification() {

	}

	public Certification(String competence, String organization, LocalDate attainedDate) {
		this.competence = competence;
		this.organization = organization;
		this.attainedDate = attainedDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompetence() {
		return competence;
	}

	public void setCompetence(String competence) {
		this.competence = competence;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public LocalDate getAttainedDate() {
		return attainedDate;
	}

	public void setAttainedDate(LocalDate attainedDate) {
		this.attainedDate = attainedDate;
	}

	public Integer getTime() {
		return Period.between(this.attainedDate, LocalDate.now()).getYears();
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Certification [id=" + id + ", competence=" + competence + ", organization=" + organization
				+ ", attainedDate=" + attainedDate + "]";
	}

}
