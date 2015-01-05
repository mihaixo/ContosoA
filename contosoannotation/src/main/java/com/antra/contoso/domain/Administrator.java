package com.antra.contoso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ADMINISTRATOR")
public class Administrator 
{
	@Id
	@Column(name="ADMINISTRATOR_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int administratorID;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;

	public int getAdministratorID() {
		return administratorID;
	}

	public void setAdministratorID(int administratorID) {
		this.administratorID = administratorID;
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
	
	

}
