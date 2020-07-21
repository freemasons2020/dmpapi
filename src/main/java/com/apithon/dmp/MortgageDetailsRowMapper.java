package com.apithon.dmp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class MortgageDetailsRowMapper implements RowMapper<MortgageDetails> {
	
	@Override
	public MortgageDetails mapRow(ResultSet rs, int rownum) throws SQLException {
		
		MortgageDetails objMortgageDetails = new MortgageDetails();
		objMortgageDetails.setAccountNo(rs.getString("accountno"));
		objMortgageDetails.setSortCode(rs.getString("sortcode"));
		objMortgageDetails.setStartDate(rs.getString("startdate"));
		objMortgageDetails.setTerm(rs.getString("term"));
		objMortgageDetails.setOpenBalance(rs.getString("openbalance"));
		objMortgageDetails.setCurrentBalance(rs.getString("currbalance"));
		objMortgageDetails.setInterest(rs.getString("interest"));
		objMortgageDetails.setDefault12months(rs.getString("default12mnths"));
		objMortgageDetails.setCust1Name(rs.getString("cust1name"));
		objMortgageDetails.setCust1DOB(rs.getString("cust1dob"));
		objMortgageDetails.setCust2Name(rs.getString("cust2name"));
		objMortgageDetails.setCust2DOB(rs.getString("cust2dob"));
		objMortgageDetails.setCustAddress(rs.getString("custaddress"));
		objMortgageDetails.setPropAddress(rs.getString("propaddress"));
		objMortgageDetails.setPropValue(rs.getString("propvalue"));
		
		return objMortgageDetails;
	}
	

}
