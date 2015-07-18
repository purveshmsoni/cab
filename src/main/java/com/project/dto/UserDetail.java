package com.project.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDetail {
	@Id
	@GeneratedValue
	private int userid;
	private String username;
	private String cabinet;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCabinet() {
		return cabinet;
	}
	public void setCabinet(String cabinet) {
		this.cabinet = cabinet;
	}

}
