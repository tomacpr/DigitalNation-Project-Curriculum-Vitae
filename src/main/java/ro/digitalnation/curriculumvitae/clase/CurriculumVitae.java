package ro.digitalnation.curriculumvitae.clase;

import java.util.Date;

public class CurriculumVitae {

	public String firstName, lastName, profession, address;
	public int phone;
	public Date dateOfBirth;
	public String summary, experience, education, skills, hobbies;

	public CurriculumVitae(String firstName, String lastName, String profession, String address, int phone,
			Date dateOfBirth, String summary, String experience, String education, String skills, String hobbies) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
		this.address = address;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
		this.summary = summary;
		this.experience = experience;
		this.education = education;
		this.skills = skills;
		this.hobbies = hobbies;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "CurriculumVitae [firstName=" + firstName + ", lastName=" + lastName + ", profession=" + profession
				+ ", address=" + address + ", phone=" + phone + ", dateOfBirth=" + dateOfBirth + ", summary=" + summary
				+ ", experience=" + experience + ", education=" + education + ", skills=" + skills + ", hobbies="
				+ hobbies + "]";
	}

}