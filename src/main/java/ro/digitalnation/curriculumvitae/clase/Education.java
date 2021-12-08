package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;

public class Education {
	
	public String schoolName;
	public LocalDate dateFrom, dateTo;
	public String description;

	public Education(String schoolName, LocalDate dateFrom, LocalDate dateTo, String description) {
		super();
		this.schoolName = schoolName;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
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

	public LocalDate getDateTo() {
		return dateTo;
	}

	public void setDateTo(LocalDate dateTo) {
		this.dateTo = dateTo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Education [schoolName=" + schoolName + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", description=" + description + "]";
	}

}
