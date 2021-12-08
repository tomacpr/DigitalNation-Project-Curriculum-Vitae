package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;

public class Certification {

	public int id;
	public String organization;
	public String competence;
	public LocalDate dateOfAward;

	public Certification() {

	}

	public Certification(int id, String organization, String competence, LocalDate dateOfAward) {
		this.id = id;
		this.organization = organization;
		this.competence = competence;
		this.dateOfAward = dateOfAward;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getCompetence() {
		return competence;
	}

	public void setCompetence(String competence) {
		this.competence = competence;
	}

	public LocalDate getDateOfAward() {
		return dateOfAward;
	}

	public void setDateOfAward(LocalDate dateOfAward) {
		this.dateOfAward = dateOfAward;
	}

	@Override
	public String toString() {
		return "Certification [id=" + id + ", organization=" + organization + ", competence=" + competence
				+ ", dateOfAward=" + dateOfAward + "]";
	}

}
