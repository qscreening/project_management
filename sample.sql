CREATE DATABASE project_management_development;

USE project_management_development;

CREATE TABLE USERS(
	USER_ID INT (10) NOT NULL AUTO_INCREMENT,
	USER_NAME VARCHAR (50) NOT NULL,
	EMAIL_ID VARCHAR (50) NOT NULL,
	PASSWORD VARCHAR (50) NOT NULL,
	PRIMARY KEY ( USER_ID, EMAIL_ID )
);

CREATE TABLE USER_PROFILES(
	USER_ID INT (10) NOT NULL,
	EMAIL_ID VARCHAR (50) NOT NULL,
	PHONE_NUMBER BIGINT (15) NOT NULL,
	FOREIGN KEY ( USER_ID, EMAIL_ID  ) REFERENCES USERS( USER_ID, EMAIL_ID )
);

CREATE TABLE PROJECTS(
	PROJECT_ID INT (10) NOT NULL AUTO_INCREMENT,
	PROJECT_NAME VARCHAR (50) NOT NULL,
	OWNER INT (10) NOT NULL,
	PRIMARY KEY ( PROJECT_ID ),
	FOREIGN KEY ( OWNER ) REFERENCES USERS( USER_ID )
);

CREATE TABLE PROJECT_MEMBERS(
	ID INT (10) NOT NULL AUTO_INCREMENT,
	PROJECT_ID INT (50) NOT NULL,
	MEMBER_ID INT (10) NOT NULL,
	OWNER BOOLEAN NOT NULL,
	PRIMARY KEY ( ID ),
	FOREIGN KEY ( PROJECT_ID ) REFERENCES PROJECTS(PROJECT_ID),
	FOREIGN KEY ( MEMBER_ID ) REFERENCES USERS(USER_ID)
);

INSERT INTO USERS(USER_NAME, EMAIL_ID, PASSWORD) VALUES 
	('priyanka','priya.siddana@gmail.com','priyanka'),
	('chaitanya','chaitanya.eluru@gmail.com','chaitanya'),
	('kartheek','kartheek.chilvery@gmail.com','kartheek'),
	('surya','surya.prakash@gmail.com','surya'),
	('anjali','anjali@gmail.com','anjali'),
	('pradeep','pradeep@gmail.com','pradeep');

INSERT INTO USER_PROFILES(USER_ID, EMAIL_ID, PHONE_NUMBER) VALUES
	(1,'priya.siddana@gmail.com', 8500441223),
	(2,'chaitanya.eluru@gmail.com', 9985546305),
	(3,'kartheek.chilvery@gmail.com', 9985673245),
	(4,'surya.prakash@gmail.com', 9965268956),
	(5,'anjali@gmail.com', 8500646820),
	(6,'pradeep@gmail.com', 9542706087);
	
INSERT INTO PROJECTS(PROJECT_NAME, OWNER) VALUES
	('project_management','3'),
	('project_management','3'),
	('project_management','3'),
	('social_network','4'),
	('social_network','4'),
	('social_network','4');

INSERT INTO PROJECT_MEMBERS(PROJECT_ID, MEMBER_ID, OWNER) VALUES
	(1,1,0),
	(1,2,0),
	(1,3,1),
	(2,4,1),
	(2,5,0),
	(2,6,0);
