package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;

public class PersonalInfo {

	public String firstName;
	public String lastName;
	public String profession;
	public String address;
	public int phone;
	public String mail;
	public LocalDate dateOfBirth;
	public String linkedIn;

	public PersonalInfo() {

	}

	public PersonalInfo(String firstName, String lastName, String profession, String address, int phone, String mail,
			LocalDate dateOfBirth, String linkedIn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
		this.address = address;
		this.phone = phone;
		this.mail = mail;
		this.dateOfBirth = dateOfBirth;
		this.linkedIn = linkedIn;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	@Override
	public String toString() {
		return "PersonalInfo [firstName=" + firstName + ", lastName=" + lastName + ", profession=" + profession
				+ ", address=" + address + ", phone=" + phone + ", mail=" + mail + ", dateOfBirth=" + dateOfBirth
				+ ", linkedIn=" + linkedIn + "]";
	}

}
