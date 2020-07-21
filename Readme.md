Digital Mortgage Porter API
---------------------------

This API retreives the mortgages account information for and exising mortgage using the Mortgage Account Number and the Sort Code. THis information passed on the target Bank where the customer wants to the port the mortgage to. The API saves the retrieved mortgage information and generates a request id, which can be used for tracking the status of the mortgage applicaion.

Source Code:
------------
- SpringBoot & Java
- H2 Database

Pre-requisities:
----------------
1. Java
2. Maven

Steps to install:
-----------------
1. Extract the files from the repository https://github.com/freemasons2020/dmpapi
2. Build files (using build tool like Maven) to get a jar file
3. The jar file can be deployed into app server or executed using the "java -jar jarfile" in the local machine

API Endpoints:
--------------
To retrieve existing mortgage data:
<uri>/getMortgageDetails?sortcode=*******&mortgageno=*********

To create a mortgage porting request:
<uri>/createRequest?***params***

