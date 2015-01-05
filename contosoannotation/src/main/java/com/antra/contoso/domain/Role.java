package com.antra.contoso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public class Role {
	@Id
	@Column(name="ROLE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleId;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="DESCRIPTION")
	private String description;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
