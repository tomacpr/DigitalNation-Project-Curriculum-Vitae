package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;

public class Experience {

	public int id;
	public String position, comapany;
	public LocalDate dateFrom, dateTo;
	public String description;

	public Experience(int id, String position, String comapany, LocalDate dateFrom, LocalDate dateTo, String description) {
		super();
		this.id = id;
		this.position = position;
		this.comapany = comapany;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Experience [id=" + id + ", position=" + position + ", comapany=" + comapany + ", dateFrom=" + dateFrom
				+ ", dateTo=" + dateTo + ", description=" + description + "]";
	}

	

}
