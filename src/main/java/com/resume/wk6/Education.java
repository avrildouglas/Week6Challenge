package com.resume.wk6;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Education {
	
	private long edId;
	private String major;
	private String university;
	private Date gradDate;
	
	
	public long getEdId() {
		return edId;
	}

	public void setEdId(long edId) {
		this.edId = edId;
	}

	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getUniversity() {
		return university;
	}
	
	public void setUniversity(String university) {
		this.university = university;
	}
	
	public Date getGradDate() {
		return gradDate;
	}
	
	public void setGradDate(Date gradDate) {
		this.gradDate = gradDate;
	}

}
