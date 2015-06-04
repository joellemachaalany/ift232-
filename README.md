# ift232-

CREATE TABLE course ( 
crs_ID int(11) NOT NULL AUTO_INCREMENT, 
crs_Code varchar(6) NOT NULL, 
crs_Name varchar(30) NOT NULL, 
crs_Description varchar(250) DEFAULT NULL, 
crs_Type varchar(8) NOT NULL, 
crs_Number_of_credits int(11) NOT NULL, 
crs_Lab varchar(3) NOT NULL, 
PRIMARY KEY (crs_ID) ) 
ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
