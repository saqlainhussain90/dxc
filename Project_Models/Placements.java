package com.univ.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Placements {
	@Id
	private int company_id;
	private String company_name;
	private String compensation;
	private boolean eligibility;
	
	public Placements() {
		super();
	}

	public Placements(int company_id, String company_name, String compensation, boolean eligibility) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.compensation = compensation;
		this.eligibility = eligibility;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompensation() {
		return compensation;
	}

	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	public boolean isEligibility() {
		return eligibility;
	}

	public void setEligibility(boolean eligibility) {
		this.eligibility = eligibility;
	}

	@Override
	public String toString() {
		return "Placements [company_id=" + company_id + ", company_name=" + company_name + ", compensation="
				+ compensation + ", eligibility=" + eligibility + "]";
	}
	
	
	

}
