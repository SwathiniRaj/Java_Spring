package com.sf.collections;

import java.util.Date;

public class PolicyInfo {

	public PolicyInfo() {
		// TODO Auto-generated constructor stub
	}
	
	private int policynumber;
	private String policyHolderName;
	private Date issueDate;
	private Date expireDate;
	private double premium;
	
		
	public PolicyInfo(int policynumber, String policyHolderName, Date issueDate, Date expireDate, double premium) {
		super();
		this.policynumber = policynumber;
		this.policyHolderName = policyHolderName;
		this.issueDate = issueDate;
		this.expireDate = expireDate;
		this.premium = premium;
	}
	
	@Override
	public String toString() {
		return "PolicyInfo [policynumber=" + policynumber + ", policyHolderName=" + policyHolderName + ", issueDate="
				+ issueDate + ", expireDate=" + expireDate + ", premium=" + premium + "]";
	}
	public int getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	

}
