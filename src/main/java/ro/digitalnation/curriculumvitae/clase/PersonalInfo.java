package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PersonalInfo")
public class PersonalInfo {

	@Id
	@Column(name = "firstName", updatable = false)
	public String firstName;
	
	@Column(name = "lastName", nullable = false)
	public String lastName;
	
	@Column(name = "profession", nullable = false)
	public String profession;
	
	@Column(name = "address", nullable = false)
	public String address;
	
	@Column(name = "phone", nullable = false)
	public int phone;
	
	@Column(name = "mail", nullable = false)
	public String mail;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dateOfBirth", nullable = false)
	public LocalDate dateOfBirth;
	
	@Column(name = "linkedIn", nullable = false)
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
