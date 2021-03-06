package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Experience")
public class Experience {

	@Id
	@SequenceGenerator(name = "experience_sequence", sequenceName = "experience_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "experience_sequence")
	@Column(name = "Identification", updatable = true)
	public Long id;

	@Column(name = "Position", nullable = false)
	public String position;

	@Column(name = "Company", nullable = false)
	public String company;

	@Column(name = "Job_Description", nullable = false)
	public String description;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Date_From", nullable = false)
	public LocalDate dateFrom;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Date_To", nullable = false)
	public LocalDate dateTo;

	@Transient
	public Integer time;

	public Experience() {
	}

	public Experience(String position, String company, LocalDate dateFrom, LocalDate dateTo, String description) {
		this.position = position;
		this.company = company;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String comapany) {
		this.company = comapany;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDate date) {
		this.dateFrom = date;
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

	public String getTime() {
		Period period = Period.between(this.dateFrom, this.dateTo);
		return period.getYears() + " years and " + period.getMonths() + " months";
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "[position=" + position + ", comapany=" + company + ", dateFrom=" + dateFrom
				+ ", dateTo=" + dateTo + ", description=" + description + "]";
	}

}
