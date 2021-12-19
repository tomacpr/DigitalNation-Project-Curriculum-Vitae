package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Education")
public class Education {

	@Id
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Year", updatable = false)
	public LocalDate dateFrom;

	@Column(name = "SchoolName", nullable = false, columnDefinition = "TEXT")
	public String schoolName;

	@Column(name = "Profile", nullable = false, columnDefinition = "TEXT")
	public String description;

	public Education() {
	}

	public Education(LocalDate dateFrom, String schoolName, String description) {
		this.schoolName = schoolName;
		this.dateFrom = dateFrom;
		this.description = description;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Education [schoolName=" + schoolName + ", dateFrom=" + dateFrom + ", description=" + description + "]";
	}

}
