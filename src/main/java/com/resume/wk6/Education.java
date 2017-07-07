package com.resume.wk6;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

//import com.resume.wk6.

import java.util.*;

@Entity
public class Education {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long edId;
	private String major;
	private String university;
	
	//@JsonFormat(pattern="mm/dd/yyyy")
	private String gradDate;

//	private Set<Applicant> applicants;
	

	/**use below*/
//	@ManyToMany(targetEntity=Applicant.class, mappedBy = "educations", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@OneToMany(targetEntity=Applicant.class, mappedBy = "education", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set <Applicant> applicants;
	
	public Set<Applicant> getApplicants() {
		return applicants;
	}

	public void setApplicants(Set<Applicant> applicants) {
		this.applicants = applicants;
	} 

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
	
	public String getGradDate() {
		return gradDate;
	}
	
	public void setGradDate(String gradDate) {
		this.gradDate = gradDate;
	}
}
	
