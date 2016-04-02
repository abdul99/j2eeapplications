package com.dicv.server.authentication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "DICVPERMISSIONS")
@NamedQueries({
 
	  @NamedQuery(name="Permissions.findAllPermByRoleId",
	              query="SELECT p FROM DicvPermissions p WHERE p.roleId = :roleId")
	})

public class DicvPermissions {
	
	@Id
	private String permId;
	
	private String permName;
	
	private int roleId;

	public String getPermId() {
		return permId;
	}

	public void setPermId(String permId) {
		this.permId = permId;
	}

	public String getPermName() {
		return permName;
	}

	public void setPermName(String permName) {
		this.permName = permName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	

}
