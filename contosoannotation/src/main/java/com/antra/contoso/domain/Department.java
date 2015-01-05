package com.antra.contoso.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Department {
	@Id
	@Column(name="DEPARTMENT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int departmentId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="BUDGET")
	private double budget;
	
	@Column(name="START_DATE")
	// hybernate type conversion
	private Date startDate;
	
	@OneToOne
	@JoinColumn(name="ADMINISTRATOR_ID")
	private Administrator administratorId;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Administrator getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(Administrator administratorId) {
		this.administratorId = administratorId;
	}
	
	

}
