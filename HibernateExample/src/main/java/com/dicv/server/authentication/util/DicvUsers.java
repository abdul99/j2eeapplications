package com.dicv.server.authentication.util;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@NamedQueries({
  @NamedQuery(name="Users.findAll",
              query="SELECT e FROM Users e"),
  @NamedQuery(name="Users.findByuserId",
              query="SELECT e FROM Users e WHERE e.userId = :userId"),
  @NamedQuery(name="Users.findByuserName",
              query="SELECT e FROM Users e WHERE e.userName = :userName")
})
public class DicvUsers {
    
	@Id
	private String userName;
	
	private String userId;
	
	private String roleId;
	
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
