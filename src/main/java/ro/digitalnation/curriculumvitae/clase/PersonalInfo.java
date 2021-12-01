package ro.digitalnation.curriculumvitae.clase;

import java.util.Date;

public class PersonalInfo {

	public String firstName, lastName, profession, address;
	public int phone;
	public String mail;
	public Date dateOfBirth;
	public String linkedIn;

	public PersonalInfo(String firstName, String lastName, String profession, String address, int phone, String mail,
			Date dateOfBirth, String linkedIn) {
		super();
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
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
