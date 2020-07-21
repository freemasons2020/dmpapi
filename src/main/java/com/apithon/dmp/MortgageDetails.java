package com.apithon.dmp;

import org.springframework.stereotype.Component;

@Component
public class MortgageDetails {
	
	private String AccountNo;
	private String SortCode;
	private String StartDate;
	private String Term;
	private String OpenBalance;
	private String CurrentBalance;
	private String Interest;
	private String Default12months;
	private String Cust1Name;
	private String Cust1DOB;
	private String Cust2Name;
	private String Cust2DOB;
	private String CustAddress;
	private String PropAddress;
	private String PropValue;
	
	
	public MortgageDetails(String accountNo, String sortCode, String startDate, String term, String openBalance, String currentBalance, String interest,
			String default12months, String cust1Name, String cust1dob, String cust2Name, String cust2dob,
			String custAddress, String propAddress, String propValue) {
		super();
		AccountNo = accountNo;
		SortCode = sortCode;
		StartDate = startDate;
		Term = term;
		OpenBalance = openBalance;
		CurrentBalance = currentBalance;
		Interest = interest;
		Default12months = default12months;
		Cust1Name = cust1Name;
		Cust1DOB = cust1dob;
		Cust2Name = cust2Name;
		Cust2DOB = cust2dob;
		CustAddress = custAddress;
		PropAddress = propAddress;
		PropValue = propValue;
	}
	
	public MortgageDetails() {
		
	}
	
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getTerm() {
		return Term;
	}
	public void setTerm(String term) {
		Term = term;
	}
	public String getOpenBalance() {
		return OpenBalance;
	}
	public void setOpenBalance(String openBalance) {
		OpenBalance = openBalance;
	}
	public String getCurrentBalance() {
		return CurrentBalance;
	}
	public void setCurrentBalance(String currentBalance) {
		CurrentBalance = currentBalance;
	}
	public String getInterest() {
		return Interest;
	}
	public void setInterest(String interest) {
		Interest = interest;
	}
	public String getDefault12months() {
		return Default12months;
	}
	public void setDefault12months(String default12months) {
		Default12months = default12months;
	}
	public String getCust1Name() {
		return Cust1Name;
	}
	public void setCust1Name(String cust1Name) {
		Cust1Name = cust1Name;
	}
	public String getCust1DOB() {
		return Cust1DOB;
	}
	public void setCust1DOB(String cust1dob) {
		Cust1DOB = cust1dob;
	}
	public String getCust2Name() {
		return Cust2Name;
	}
	public void setCust2Name(String cust2Name) {
		Cust2Name = cust2Name;
	}
	public String getCust2DOB() {
		return Cust2DOB;
	}
	public void setCust2DOB(String cust2dob) {
		Cust2DOB = cust2dob;
	}
	public String getCustAddress() {
		return CustAddress;
	}
	public void setCustAddress(String custAddress) {
		CustAddress = custAddress;
	}
	public String getPropAddress() {
		return PropAddress;
	}
	public void setPropAddress(String propAddress) {
		PropAddress = propAddress;
	}
	public String getPropValue() {
		return PropValue;
	}
	public void setPropValue(String propValue) {
		PropValue = propValue;
	}

	public String getSortCode() {
		return SortCode;
	}

	public void setSortCode(String sortCode) {
		SortCode = sortCode;
	}

	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	
	

}
