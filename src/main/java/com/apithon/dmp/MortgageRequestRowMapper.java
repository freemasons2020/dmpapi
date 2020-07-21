package com.apithon.dmp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class MortgageRequestRowMapper implements RowMapper<MortgageRequest> {
	
	@Override
	public MortgageRequest mapRow(ResultSet rs, int rownum) throws SQLException {
		
		MortgageRequest objMortgageRequest = new MortgageRequest();
		objMortgageRequest.setRequestId(rs.getString("requestid"));
		objMortgageRequest.setAccountNo(rs.getString("accountno"));
		objMortgageRequest.setSortCode(rs.getString("sortcode"));
		objMortgageRequest.setStartDate(rs.getString("startdate"));
		objMortgageRequest.setTerm(rs.getString("term"));
		objMortgageRequest.setOpenBalance(rs.getString("openbalance"));
		objMortgageRequest.setCurrentBalance(rs.getString("currbalance"));
		objMortgageRequest.setInterest(rs.getString("interest"));
		objMortgageRequest.setDefault12months(rs.getString("default12mnths"));
		objMortgageRequest.setCust1Name(rs.getString("cust1name"));
		objMortgageRequest.setCust1DOB(rs.getString("cust1dob"));
		objMortgageRequest.setCust2Name(rs.getString("cust2name"));
		objMortgageRequest.setCust2DOB(rs.getString("cust2dob"));
		objMortgageRequest.setCustAddress(rs.getString("custaddress"));
		objMortgageRequest.setPropAddress(rs.getString("propaddress"));
		objMortgageRequest.setPropValue(rs.getString("propvalue"));
		objMortgageRequest.setEmail(rs.getString("email"));
		objMortgageRequest.setPhone(rs.getString("phone"));
		
		return objMortgageRequest;
	}
	

}