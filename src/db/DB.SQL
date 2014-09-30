ALTER TABLE Profile_Diagnosis DROP CONSTRAINT FK_diagnosis_id
;
ALTER TABLE Profile_Diagnosis DROP CONSTRAINT FK_profile_id
;
ALTER TABLE Profile_Operation DROP CONSTRAINT FK_profile_id
;
ALTER TABLE Profile_Operation DROP CONSTRAINT FK_operation_id
;

DROP TABLE Diagnosis
;
DROP TABLE Operation
;
DROP TABLE Profile
;
DROP TABLE Profile_Diagnosis
;
DROP TABLE Profile_Operation
;

CREATE TABLE Diagnosis ( 
	diagnosis_id bigint NOT NULL,
	code bigint,
	name varchar(50) NOT NULL,
	used boolean DEFAULT false NOT NULL
)
;

CREATE TABLE Operation ( 
	operation_id bigint NOT NULL,
	code bigint,
	name varchar(50) NOT NULL,
	used boolean DEFAULT false NOT NULL
)
;

CREATE TABLE Profile ( 
	profile_id bigint NOT NULL,
	name varchar(50) NOT NULL
)
;

CREATE TABLE Profile_Diagnosis ( 
	profile_id bigint NOT NULL,
	diagnosis_id bigint NOT NULL
)
;

CREATE TABLE Profile_Operation ( 
	profile_id bigint NOT NULL,
	operation_id bigint NOT NULL
)
;


ALTER TABLE Diagnosis ADD CONSTRAINT PK_Diagnosis 
	PRIMARY KEY (diagnosis_id)
;


ALTER TABLE Operation ADD CONSTRAINT PK_Operation 
	PRIMARY KEY (operation_id)
;


ALTER TABLE Profile ADD CONSTRAINT PK_Profiles 
	PRIMARY KEY (profile_id)
;


ALTER TABLE Profile_Diagnosis ADD CONSTRAINT PK_Diagnosis_Profile 
	PRIMARY KEY (profile_id, diagnosis_id)
;


ALTER TABLE Profile_Operation ADD CONSTRAINT PK_Operation_Profile 
	PRIMARY KEY (profile_id, operation_id)
;



ALTER TABLE Diagnosis
	ADD CONSTRAINT UQ_Diagnosis_code UNIQUE (code)
;
ALTER TABLE Diagnosis
	ADD CONSTRAINT UQ_Diagnosis_name UNIQUE (name)
;
ALTER TABLE Operation
	ADD CONSTRAINT UQ_Operation_code UNIQUE (code)
;
ALTER TABLE Operation
	ADD CONSTRAINT UQ_Operation_name UNIQUE (name)
;
ALTER TABLE Profile
	ADD CONSTRAINT UQ_Profiles_name UNIQUE (name)
;

ALTER TABLE Profile_Diagnosis ADD CONSTRAINT FK_diagnosis_id 
	FOREIGN KEY (diagnosis_id) REFERENCES Diagnosis (diagnosis_id)
;

ALTER TABLE Profile_Diagnosis ADD CONSTRAINT FK_profile_id 
	FOREIGN KEY (profile_id) REFERENCES Profile (profile_id)
;

ALTER TABLE Profile_Operation ADD CONSTRAINT FK_operation_id 
	FOREIGN KEY (operation_id) REFERENCES Operation (operation_id)
;
