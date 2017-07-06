package com.resume.wk6;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long exId;
	private String title;
	private String company;
	private Date startdate;
	private Date enddate;
	private String duties;
	
	public long getExId() {
		return exId;
	}

	public void setExId(long exId) {
		this.exId = exId;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Date getStartdate() {
		return startdate;
	}
	
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	
	public Date getEnddate() {
		return enddate;
	}
	
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	public String getDuties() {
		return duties;
	}
	
	public void setDuties(String duties) {
		this.duties = duties;
	}
	
	

}
