CREATE TABLE `source_mortgages` (
  `accountno` varchar(45) NOT NULL,
  `sortcode` varchar(45) NOT NULL,
  `startdate` varchar(45) NOT NULL,
  `term` varchar(45) NOT NULL,
  `openbalance` varchar(45) NOT NULL,
  `currbalance` varchar(45) NOT NULL,
  `interest` varchar(45) NOT NULL,
  `default12mnths` varchar(10) NOT NULL,
  `cust1name` varchar(100) NOT NULL,
  `cust1dob` varchar(45) NOT NULL,
  `cust2name` varchar(100) NOT NULL,
  `cust2dob` varchar(45) NOT NULL,
  `custaddress` varchar(200) NOT NULL,
  `propaddress` varchar(200) NOT NULL,
  `propvalue` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`accountno`),
  UNIQUE KEY `accountno_UNIQUE` (`accountno`)
);

INSERT INTO SOURCE_MORTGAGES (accountno,sortcode,startdate,term,openbalance,currbalance,interest,default12mnths,cust1name,cust1dob,cust2name,cust2dob,custaddress,propaddress,propvalue) VALUES ('985432301','166651','2018-01-09','180','2500000','2125000','4.5','N','John Doe','1975-10-17','Mary Doe','1976-11-25','145, Owasso Street, Shoreview, FY65BG','12, Cassels Avenue, Shoreview, FY67TR','3000000');
INSERT INTO SOURCE_MORTGAGES (accountno,sortcode,startdate,term,openbalance,currbalance,interest,default12mnths,cust1name,cust1dob,cust2name,cust2dob,custaddress,propaddress,propvalue) VALUES ('985432123','166652','2015-08-10','240','2350000','1997500','4','N','Fred Bloggs','1980-01-15','Debbie Bloggs','1980-02-15','7, Cecil Street, Lytham, LY67UY ','96, Young Street, St Annes, LY50TR','2820000');
INSERT INTO SOURCE_MORTGAGES (accountno,sortcode,startdate,term,openbalance,currbalance,interest,default12mnths,cust1name,cust1dob,cust2name,cust2dob,custaddress,propaddress,propvalue) VALUES ('985432456','166653','2016-10-09','180','1570000','1000500','4','Y','Mike Young','1983-11-15','Claire Young','1985-12-15','71, Kings Street, Preston, PY87XY ','89, Regent Street, Blackpool, BL95IY','1750000');

CREATE TABLE `target_mortgages` (
  `requestid` varchar(45) NOT NULL,
  `accountno` varchar(45),
  `sortcode` varchar(45),
  `startdate` varchar(45),
  `term` varchar(45),
  `openbalance` varchar(45),
  `currbalance` varchar(45),
  `interest` varchar(45),
  `default12mnths` varchar(10),
  `cust1name` varchar(100),
  `cust1dob` varchar(45),
  `cust2name` varchar(100),
  `cust2dob` varchar(45),
  `custaddress` varchar(200),
  `propaddress` varchar(200),
  `propvalue` varchar(45),
  `email` varchar(100),
  `phone` varchar(45),
   PRIMARY KEY (`requestid`),
   UNIQUE KEY `requestid_UNIQUE` (`requestid`)
);