package ro.digitalnation.curriculumvitae.clase;

import java.util.Date;

public class Experience {

	public String position, comapany;
	public Date dateFrom, dateTo;
	public String description;

	public Experience(String position, String comapany, Date dateFrom, Date dateTo, String description) {
		super();
		this.position = position;
		this.comapany = comapany;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.description = description;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getComapany() {
		return comapany;
	}

	public void setComapany(String comapany) {
		this.comapany = comapany;
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
		return "Experience [position=" + position + ", comapany=" + comapany + ", dateFrom=" + dateFrom + ", dateTo="
				+ dateTo + ", description=" + description + "]";
	}

}
