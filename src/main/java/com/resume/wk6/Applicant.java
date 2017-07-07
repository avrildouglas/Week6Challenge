package com.resume.wk6;
import javax.persistence.*;

//import org.hibernate.mapping.Collection;

//import com.resume.wk6.Education;

import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Applicant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long appId;
	private String fullName;
//	private String lName;
	private String eMail;
	/**use this*/
	//@ManyToOne(fetch = FetchType.EAGER)
	@ManyToMany(fetch = FetchType.EAGER)
	/**use this*/
  //  @JoinTable(name="education",
  //  	joinColumns = @JoinColumn(name = "education_id"),
  //  	inverseJoinColumns = @JoinColumn(name = "applicant_id"))
   //use this
//private Education education;
	/*added s to educations*/

    @JoinTable(joinColumns = @JoinColumn(name = "applicant_id"),inverseJoinColumns = @JoinColumn(name = "education_id"))

    private Collection<Education> educations;
	
	/**below is uses with no collection w/ (private Education education)
/**	public Education getEducation() {
		return educations;
	} 

	public void setEducation(Education education) {
		this.education = educations;
	}*/
	
	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	/**public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;*
	}*/
	
	public String geteMail() {
		return eMail;
	}
	
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Collection<Education> getEducations() {
		return educations;
	}

	public void setEducations(Collection<Education> educations) {
		this.educations = educations;
	}
	
}
