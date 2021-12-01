package ro.digitalnation.curriculumvitae.clase;

import java.util.Date;

public class Education {

	public String schoolName;
	public Date dateFrom, dateTo;
	public String description;

	public Education(String schoolName, Date dateFrom, Date dateTo, String description) {
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

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
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
