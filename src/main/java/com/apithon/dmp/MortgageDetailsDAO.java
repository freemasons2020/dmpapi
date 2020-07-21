package com.apithon.dmp;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MortgageDetailsDAO {
	
	@Autowired
	JdbcTemplate objJdbcTemplate;
	MortgageDetailsRowMapper objMortgageDetailsRowMapper = new MortgageDetailsRowMapper();
	MortgageRequestRowMapper objMortgageRequestRowMapper = new MortgageRequestRowMapper();
	
	public List<MortgageDetails> getMortgageDetails(String sortcode, String mortgageno) {
		List<MortgageDetails> lstMortgageDetails;
		StringBuffer sqlQry = new StringBuffer("select accountno, sortcode, cust1name, cust1dob, cust2name, cust2dob, custaddress, startdate, term, openbalance, currbalance, interest, default12mnths, propaddress, propvalue from source_mortgages where accountno=");
		sqlQry.append(mortgageno);
		sqlQry.append(" and sortcode=");
		sqlQry.append(sortcode);
		lstMortgageDetails = objJdbcTemplate.query(sqlQry.toString(), objMortgageDetailsRowMapper);
		return lstMortgageDetails;	
	}
	
	public List<MortgageRequest> createRequest(String requestid, String accountno, String sortcode, String cust1name, String cust1dob,
			String cust2name, String cust2dob, String custaddress, String startdate,String term,String openbalance,
			String currbalance, String interest, String default12mnths, String propaddress, String propvalue,
			String email, String phone) {
		int numRows = 0;
		String sqlQuery = "insert into target_mortgages (requestid, accountno, sortcode, cust1name, cust1dob, cust2name, cust2dob, custaddress, startdate, term, openbalance, currbalance, interest, default12mnths, propaddress, propvalue,email,phone) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		numRows = objJdbcTemplate.update(sqlQuery, new Object[] {requestid, accountno, sortcode, cust1name, cust1dob, cust2name, cust2dob,custaddress, startdate, term, openbalance, currbalance, interest, default12mnths, propaddress, propvalue,email,phone }, new int[] {Types.VARCHAR, Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR});

		List<MortgageRequest> lstMortgageRequest;
		StringBuffer sqlQry = new StringBuffer("select requestid, accountno, sortcode, cust1name, cust1dob, cust2name, cust2dob, custaddress, startdate, term, openbalance, currbalance, interest, default12mnths, propaddress, propvalue,email,phone from target_mortgages where accountno=");
		sqlQry.append(accountno);
		sqlQry.append(" and sortcode=");
		sqlQry.append(sortcode);
		lstMortgageRequest = objJdbcTemplate.query(sqlQry.toString(), objMortgageRequestRowMapper);
		return lstMortgageRequest;	
	}
	
}
