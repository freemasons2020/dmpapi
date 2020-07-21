package com.apithon.dmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class DigiMortController {
	
	@Autowired
	private MortgageDetailsDAO objMortReqDAO;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/getMortgageDetails")
	public List<MortgageDetails> getMortgageDetails (@RequestParam(value="sortcode", defaultValue="no") String sortcode, @RequestParam(value="mortgageno", defaultValue="no") String mortgageno) {
		List<MortgageDetails> lstMortgageDetails;
		lstMortgageDetails = objMortReqDAO.getMortgageDetails(sortcode, mortgageno);
		return lstMortgageDetails;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/createRequest")
	public List<MortgageRequest> createMortgagePortRequest1 (
			@RequestParam(value="requestid", defaultValue="no") String requestid,
			@RequestParam(value="accountno", defaultValue="no") String accountno,
			@RequestParam(value="sortcode", defaultValue="no") String sortcode,
			@RequestParam(value="cust1name", defaultValue="no") String cust1name,
			@RequestParam(value="cust1dob", defaultValue="no") String cust1dob,
			@RequestParam(value="cust2name", defaultValue="no") String cust2name,
			@RequestParam(value="cust2dob", defaultValue="no") String cust2dob,
			@RequestParam(value="custaddress", defaultValue="no") String custaddress,
			@RequestParam(value="startdate", defaultValue="no") String startdate,		
			@RequestParam(value="term", defaultValue="no") String term,
			@RequestParam(value="openbalance", defaultValue="no") String openbalance,				
			@RequestParam(value="currbalance", defaultValue="no") String currbalance,
			@RequestParam(value="interest", defaultValue="no") String interest,	
			@RequestParam(value="default12mnths", defaultValue="no") String default12mnths,
			@RequestParam(value="propaddress", defaultValue="no") String propaddress,	
			@RequestParam(value="propvalue", defaultValue="no") String propvalue,			
			@RequestParam(value="email", defaultValue="no") String email,
			@RequestParam(value="phone", defaultValue="no") String phone) {
		
		List<MortgageRequest> lstMortgageRequest;
		lstMortgageRequest = objMortReqDAO.createRequest(requestid, accountno, sortcode, cust1name, cust1dob, cust2name, cust2dob, custaddress, startdate, term, openbalance, currbalance, interest, default12mnths, propaddress, propvalue, email, phone);
		return lstMortgageRequest;
	}	
}
