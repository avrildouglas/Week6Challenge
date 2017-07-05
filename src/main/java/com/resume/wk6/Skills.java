package com.resume.wk6;

import javax.persistence.Entity;

@Entity
public class Skills {
	
	private long skId;
	private String skills;
	private String sklevel;

	
	public long getSkId() {
		return skId;
	}
	
	public void setSkId(long skId) {
		this.skId = skId;
	}
	
	public String getSkills() {
		return skills;
	}
	
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	public String getSklevel() {
		return sklevel;
	}
	
	public void setSklevel(String sklevel) {
		this.sklevel = sklevel;
	}
	
}
