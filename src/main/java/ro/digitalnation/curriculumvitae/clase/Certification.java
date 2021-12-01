package ro.digitalnation.curriculumvitae.clase;

import java.util.Date;

public class Certification {

	public String organization;
	public String competence;
	public Date dateOfAward;

	public Certification(String competence, String organization, Date dateOfAward) {
		super();
		this.organization = organization;
		this.competence = competence;
		this.dateOfAward = dateOfAward;
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

	public Date getDateOfAward() {
		return dateOfAward;
	}

	public void setDateOfAward(Date dateOfAward) {
		this.dateOfAward = dateOfAward;
	}

	@Override
	public String toString() {
		return "Certification [organization=" + organization + ", competence=" + competence + ", dateOfAward="
				+ dateOfAward + "]";
	}

}
