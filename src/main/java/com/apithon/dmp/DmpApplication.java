package com.apithon.dmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DmpApplication {
	
	@Autowired
	public DigiMortController objDigiMortController;
	public MortgageDetailsDAO objMortgageDetailsDAO;
	public MortgageDetails objMortgageDetails;

	public static void main(String[] args) {
		SpringApplication.run(DmpApplication.class, args);
	}

}
