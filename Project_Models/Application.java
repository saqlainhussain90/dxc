package com.univ.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Application {
	@Id
	private int application_No;
	private String applicant_Name;
	private String gender;
	private int ageOfApplicant;
	private float percentageIn12th;
	
	public Application() {
		super();
	}
	
	public Application(int application_No, String applicant_Name, String gender, int ageOfApplicant,
			float percentageIn12th) {
		super();
		this.application_No = application_No;
		this.applicant_Name = applicant_Name;
		this.gender = gender;
		this.ageOfApplicant = ageOfApplicant;
		this.percentageIn12th = percentageIn12th;
	}

	public int getApplication_No() {
		return application_No;
	}

	public void setApplication_No(int application_No) {
		this.application_No = application_No;
	}

	public String getApplicant_Name() {
		return applicant_Name;
	}

	public void setApplicant_Name(String applicant_Name) {
		this.applicant_Name = applicant_Name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAgeOfApplicant() {
		return ageOfApplicant;
	}

	public void setAgeOfApplicant(int ageOfApplicant) {
		this.ageOfApplicant = ageOfApplicant;
	}

	public float getPercentageIn12th() {
		return percentageIn12th;
	}

	public void setPercentageIn12th(float percentageIn12th) {
		this.percentageIn12th = percentageIn12th;
	}

	@Override
	public String toString() {
		return "Application [application_No=" + application_No + ", applicant_Name=" + applicant_Name + ", gender="
				+ gender + ", ageOfApplicant=" + ageOfApplicant + ", percentageIn12th=" + percentageIn12th + "]";
	}
	

}
