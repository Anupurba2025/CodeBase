CREATE DATABASE college;
CREATE DATABASE IF NOT EXISTS college;

DROP DATABASE IF EXISTS student;

USE college;

CREATE TABLE student(
		id INT PRIMARY KEY,
        name VARCHAR(30),
        age INT NOT NULL
	);
    
INSERT INTO student VALUES(1, "Anupurba", 21);
INSERT INTO student VALUES(2, "Ranu", 20);

INSERT INTO student(id, name, age)
	VALUES
    (3, "Aditi",24),
	(4, "Manu",25),
	(5, "Abhyam",23);
SELECT * FROM Student;

SHOW DATABASES;
SHOW tables;

CREATE DATABASE XYZ;
USE XYZ;
CREATE TABLE EMPLOYEE_INFO(
	EMP_ID INT PRIMARY KEY,
    NAME VARCHAR(40),
    SALARY DOUBLE NOT NULL
);


INSERT INTO EMPLOYEE_INFO
(EMP_ID,NAME,SALARY)
VALUES
	(1,"RAM",200000.00),
    (2, "SHYAM", 23000.00),
    (3, "KAJAL", 267889.00);

SELECT * FROM EMPLOYEE_INFO;

CREATE TABLE STAFF(
ID INT PRIMARY KEY,
SALARY DOUBLE DEFAULT 25000
);

INSERT INTO STAFF(ID) VALUES
	(101),
    (102),
    (103);
SELECT * FROM STAFF;

USE college;
CREATE TABLE PROFESSOR (
	PROF_ID INT PRIMARY KEY,
    NAME VARCHAR(40),
    AGE INT,
    CITY VARCHAR(25)
);

INSERT INTO PROFESSOR 
	(PROF_ID,NAME,AGE,CITY)
		VALUES
			(101,"RAM",30,"DELHI"),
            (102,"SHYAM",34,"KOLKATA"),
            (103,"RAMU",23,"KOLKATA"),
            (104,"ANU",21,"ASANSOL"),
            (105,"RANU",21,"DELHI");

SELECT PROF_ID,NAME FROM PROFESSOR;
SELECT DISTINCT CITY FROM PROFESSOR;
SELECT PROF_ID,NAME FROM PROFESSOR WHERE AGE<25 AND CITY="KOLKATA";
SELECT PROF_ID,NAME FROM PROFESSOR WHERE AGE<25 OR CITY="KOLKATA";

SELECT * FROM PROFESSOR WHERE AGE BETWEEN 22 AND 40;
SELECT PROF_ID,NAME FROM PROFESSOR WHERE CITY IN ("KOLKATA","ASANSOL");
SELECT PROF_ID,NAME FROM PROFESSOR WHERE CITY NOT IN ("KOLKATA","ASANSOL");
SELECT PROF_ID,NAME FROM PROFESSOR limit 3;
SELECT * FROM PROFESSOR ORDER BY CITY ASC;
SELECT COUNT(PROF_ID) FROM PROFESSOR;
SELECT MAX(AGE) FROM PROFESSOR;
SELECT MIN(AGE) FROM PROFESSOR;
SELECT SUM(AGE) FROM PROFESSOR;
SELECT AVG(AGE) FROM PROFESSOR;
SELECT CITY,COUNT(NAME)
	FROM PROFESSOR
		GROUP BY CITY;

 SELECT CITY, NAME, COUNT(NAME)
	FROM PROFESSOR
		GROUP BY CITY,NAME;      
        
SELECT CITY, AVG(AGE)
	FROM PROFESSOR
		GROUP BY CITY;

SELECT CITY, AVG(AGE)
	FROM PROFESSOR
		GROUP BY CITY
			ORDER BY AVG(AGE) DESC;

CREATE TABLE PAYMENT(
	ID INT PRIMARY KEY,
    CUSTOMER_NAME VARCHAR(40),
    MODE VARCHAR(30),
    CITY VARCHAR(20)
);

INSERT INTO PAYMENT
	(ID, CUSTOMER_NAME, MODE,CITY) 
		VALUES
		(1,"RAM","NET_BANKING","ASANSOL"),
        (2,"ANUPURBA","GPAY","ASANSOL"),
        (3,"RANU","GPAY","DURGAPUR"),
        (4,"RUHI","NET_BANKING","BURDWAN"),
        (5,"ABHYAM","PHONE_PAY","PATNA"),
        (6,"DEEPU","AMAZON_PAY","PATNA"),
        (7,"DEEPA","GPAY","ASANSOL"),
        (8,"RAJA","PAYTM","DURGAPUR"),
        (9,"RAMU","GPAY","BURDWAN"),
        (10,"AKASH","NET_BANKING","ASANSOL");

SELECT MODE,COUNT(MODE)
 FROM PAYMENT
	GROUP BY MODE
		ORDER BY COUNT(MODE);


/*HAVING CLAUSE ARE USED TO APPLY ANY CONDITION ON A GROUP OF ELEMENT AND WHERE CLAUSE IS USED TO SET ANY CONDITION BASED ON SOME SPECIFIC ROWS...*/
SELECT CITY,COUNT(PROF_ID)
		FROM PROFESSOR
			GROUP BY CITY
				HAVING MAX(AGE) > 20;
                

/*IN SQL , BY DEFAULT SAFE MODE IS ON, BECAUSE BY MISTAKENLY WE DONT UPDATE ANY UNECCESSARY THINGS WHICH IS UNNECESSARY AND LEAD TO PROBLEMS IN DATABASES...*/
SET SQL_SAFE_UPDATES = 0;                
UPDATE PAYMENT
	SET MODE = "VIM_PAY"
		WHERE MODE ="PHONE_PAY" ;
SELECT * FROM PAYMENT;
        
UPDATE STUDENT
	SET AGE = AGE+1;

SET SQL_SAFE_UPDATES = 1;  /*SAFE MODE ON AGAIN*/

SELECT * FROM STUDENT;
DELETE FROM STUDENT
	WHERE AGE > 25;
    
DELETE FROM STUDENT;  /*FROM THIS STATEMENT ALL ROWS FROM THAT TABLE CAN BE DELETED...*/

/*FOREIGN KEY*/
/* PARENT TABLE */
CREATE TABLE DEPT(
	ID INT PRIMARY KEY,
    NAME VARCHAR(25)
    );  
    
/* CHILD TABLE */
/* CASCADING IN FOREIGN KEYS */
CREATE TABLE TEACHER(
	ID INT PRIMARY KEY,
    NAME VARCHAR(25),
    DEPT_ID INT,
    FOREIGN KEY (DEPT_ID) REFERENCES DEPT(ID)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

INSERT INTO DEPT
(ID,NAME)
	VALUES
		(101,"BENGALI"),
        (102,"ENGLISH"),
        (103,"SANSKRIT");
INSERT INTO TEACHER(ID,NAME,DEPT_ID)
	VALUES
		(1001,"ADAM",101),
        (1002,"MANU",102),
        (1003,"RANU",102),
        (1004,"RAM",101),
        (1005,"RAMU",103),
        (1006,"AKASH",103),
        (1007,"RAMESH",102),
        (1008,"KANCHANA",101);
	
SELECT * FROM TEACHER;

SET SQL_SAFE_UPDATES = 0;
UPDATE DEPT 
	SET ID = 111
		WHERE ID = 101;
SET SQL_SAFE_UPDATES = 1;


/* ALTER COMMAND - TO CHANGE THE SCHEMA */
CREATE TABLE COLLEGE_STUDENT(
	UNIVERSITY_ROLL INT PRIMARY KEY,
    NAME VARCHAR(25) ,
    CITY VARCHAR(25),
    MARKS INT,
    GRADE CHAR
);
INSERT INTO COLLEGE_STUDENT
	(UNIVERSITY_ROLL, NAME, CITY, MARKS,GRADE)
		VALUES
			(1,"RAM","ASANSOL",90,"O"),
            (2,"RAMU","ASANSOL",95,"O"),
            (3,"RAJA","DURGAPUR",70,"B"),
			(4,"RAMARAJ","BURDWAN",60,"C"),
            (5,"ANNY","DURGAPUR",40,"F"),
            (6,"AKASH","DURGAPUR",90,"A"),
            (7,"VIVEK","BURNPUR",95,"O");

/*ADD COLUMN*/
ALTER TABLE COLLEGE_STUDENT
	ADD COLUMN AGE INT NOT NULL;
    
UPDATE COLLEGE_STUDENT
	SET AGE = CASE
		WHEN UNIVERSITY_ROLL = 1 THEN 25
        WHEN UNIVERSITY_ROLL = 2 THEN 20
        WHEN UNIVERSITY_ROLL = 3 THEN 20
        WHEN UNIVERSITY_ROLL = 4 THEN 22
        WHEN UNIVERSITY_ROLL = 5 THEN 23
        WHEN UNIVERSITY_ROLL = 6 THEN 20
        WHEN UNIVERSITY_ROLL = 7 THEN 28
	END
WHERE AGE IN (1,2,3,4,5,6,7);

ALTER TABLE COLLEGE_STUDENT
	CHANGE COLUMN AGE STUDENT_AGE INT NOT NULL;
        
ALTER TABLE COLLEGE_STUDENT 
	RENAME TO COLLEGESTU;
    
SELECT * FROM COLLEGESTU;

/*DROP HELPS TO DELETE THE TABLE AND TRUNCATE HELPS TO DELETE THE TABLE DATA*/
TRUNCATE TABLE COLLEGESTU;

ALTER TABLE COLLEGESTU
	RENAME TO COLLEGE_STUDENT;
    
SELECT * FROM COLLEGE_STUDENT;

INSERT INTO COLLEGE_STUDENT
	(UNIVERSITY_ROLL, NAME, CITY, MARKS,GRADE,STUDENT_AGE)
		VALUES
			(1,"RAM","ASANSOL",90,"O",12),
            (2,"RAMU","ASANSOL",95,"O",23),
            (3,"RAJA","DURGAPUR",70,"B",22),
			(4,"RAMARAJ","BURDWAN",60,"C",21),
            (5,"ANNY","DURGAPUR",40,"F",11),
            (6,"AKASH","DURGAPUR",90,"A",23),
            (7,"VIVEK","BURNPUR",95,"O",28);
            
ALTER TABLE COLLEGE_STUDENT 
	CHANGE  COLUMN NAME STUDENT_NAME VARCHAR(25);
    
DELETE FROM COLLEGE_STUDENT 
	WHERE MARKS < 80;
    
ALTER TABLE COLLEGE_STUDENT
	DROP COLUMN GRADE;


/* JOINS IN SQL */
CREATE TABLE STU(
	ID INT PRIMARY KEY,
	NAME VARCHAR(25)
);
CREATE TABLE COURSE(
	STUDENT_ID INT PRIMARY KEY,
    COURSE_NAME VARCHAR(25)
    );

INSERT INTO STU(ID,NAME)
	VALUES
		(101,'RAM'),
        (102,'RAMU'),
        (103,'RAJA'),
        (104,'RAKESH'),
        (105,'RAKESHRAM');

INSERT INTO COURSE(STUDENT_ID,COURSE_NAME)
	VALUES 
		(101,'BENGALI'),
        (103,'ENGLISH'),
        (105,'SANSKRIT'),
        (107,'HINDI');
        

SELECT * FROM STU;
SELECT * FROM COURSE;

/* INNER JOIN */
SELECT * FROM
	STU INNER JOIN COURSE
		WHERE STU.ID = COURSE.STUDENT_ID;
        
/* ALIAS -> ALTERNATIVE NAMES -> WE USED THIS TO AVOID LARGRER NAMES OF TABLES */
SELECT * FROM
	STU AS S 
		INNER JOIN 
			COURSE AS C
				WHERE S.ID = C.STUDENT_ID;
                
/* LEFT OUTER JOIN */
SELECT * FROM
	STU AS S 
		LEFT JOIN 
			COURSE AS C
				ON S.ID = C.STUDENT_ID;

/* RIGHT OUTER JOIN */
SELECT * FROM
	STU AS S 
		RIGHT JOIN 
			COURSE AS C
				ON S.ID = C.STUDENT_ID;
                

/* FULL JOIN / FULL OUTER JOIN */
SELECT * FROM 
	STU AS S
		LEFT JOIN
			COURSE AS C
				ON S.ID = C.STUDENT_ID
					UNION
				SELECT * FROM 
			STU AS S
		RIGHT JOIN
	COURSE AS C
ON S.ID = C.STUDENT_ID;     

/* LEFT EXCLUSIVE JOIN */
SELECT * FROM 
	STU AS S
		LEFT JOIN
			COURSE AS C
				ON S.ID = C.STUDENT_ID
					WHERE C.STUDENT_ID IS NULL;

/* RIGHT EXCLUSIVE JOIN */
SELECT * FROM 
	STU AS S
		RIGHT JOIN
			COURSE AS C
				ON S.ID = C.STUDENT_ID
					WHERE S.ID IS NULL;


SELECT * FROM 
	STU AS S
		LEFT JOIN
			COURSE AS C
				ON S.ID = C.STUDENT_ID
					WHERE C.STUDENT_ID IS NOT NULL
					UNION
				SELECT * FROM 
			STU AS S
		RIGHT JOIN
	COURSE AS C
ON S.ID = C.STUDENT_ID
WHERE S.ID IS NOT NULL;

/* SELF JOIN / REGULAR JOIN */
CREATE TABLE EMPLOYEE(
	ID INT PRIMARY KEY,
    NAME VARCHAR(20),
    MANAGER_ID INT
);
INSERT INTO EMPLOYEE(ID,NAME,MANAGER_ID)
	VALUES 
    (101,"ADAM",103),
    (102,'BOB',104),
    (103,'CASEY',NULL),
    (104,'DONALD',103);
    
/* SELF JOIN */
SELECT A.NAME AS MANEGER_NAME , B.NAME
	FROM
		EMPLOYEE AS A 
			JOIN
				EMPLOYEE AS B
					ON A.ID = B.MANAGER_ID;

/* UNION -> IT RETURNS ONLY THE UNIQUE VALUES */
SELECT NAME FROM EMPLOYEE
	UNION
		SELECT NAME FROM EMPLOYEE;

/* UNION ALL -> IT RETURNS ALL THE VALUES */
SELECT NAME FROM EMPLOYEE
	UNION ALL
		SELECT NAME FROM EMPLOYEE;

/* SUB QUERY / INNER QUERY / NESTED QUERY */
SELECT * FROM COLLEGE_STUDENT;

SELECT AVG(MARKS) FROM COLLEGE_STUDENT;

SELECT STUDENT_NAME,MARKS FROM COLLEGE_STUDENT
	WHERE MARKS > 92.5000;
    
SELECT STUDENT_NAME,MARKS FROM COLLEGE_STUDENT
	WHERE MARKS > (SELECT AVG(MARKS) FROM COLLEGE_STUDENT);

SELECT STUDENT_NAME, UNIVERSITY_ROLL FROM COLLEGE_STUDENT
	WHERE UNIVERSITY_ROLL % 2 = 0;
    
SELECT MAX(MARKS) FROM (
	SELECT STUDENT_NAME FROM COLLEGE_STUDENT
	WHERE CITY = "ASANSOL");



