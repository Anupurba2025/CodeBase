CREATE TABLE Departments(
	DepartmentID INT PRIMARY KEY,
	DepartmentName VARCHAR(30)
);

CREATE TABLE EmployeeDetails(
	EmployeeID INT PRIMARY KEY,
	EmployeeFirstName VARCHAR(50),
	EmployeeLastName VARCHAR(50),
	Salary INT,
	DepartmentID INT,
	FOREIGN KEY(DepartmentID) REFERENCES Departments(DepartmentID)
);


CREATE TABLE Projects(
	ProjectID INT PRIMARY KEY,
	ProjectName VARCHAR(60),
	DepartmentID INT,
	FOREIGN KEY(DepartmentID) REFERENCES Departments(DepartmentId)
);

INSERT INTO DEPARTMENTS
(DepartmentID,DepartmentName)
VALUES
	(101,'IT'),
	(102,'MARKETING'),
	(103,'SALES'),
	(104,'HR');

INSERT INTO EMPLOYEEDETAILS
(EmployeeID,EmployeeFirstName,EmployeeLastName,Salary,DepartmentID)
VALUES
	(1,'RAMU','SHANKAR',60000,101),
	(2,'SITA','KUMARI',89000,103),
	(3,'MAYA','ROY',20000,102),
	(4,'MOU','DAS',150000,101),
	(5,'PRIYA','ROY',30000,104),
	(6,'RAJU','SINHA',78000,103),
	(7,'MAYA','SHANKAR',75000,104),
	(8,'JOY','CHATTERJEE',45000,102),
	(9,'RAGHAB','KUMAR',9000,103),
	(10,'RAGHAVENDRA','YADAV',1500000,101);

INSERT INTO PROJECTS
(ProjectID,ProjectName,DepartmentID)
VALUES
	(1001,'PROJECT_ALPHA',101),
	(1002,'PROJECT_BETA',103),
	(1003,'PROJECT_GAMMA',101),
	(1004,'PROJECT_AB',102),
	(1005,'PROJECT_AC',104),
	(1006,'PROJECT_AD',NULL),
	(1007,'PROJECT_AE',NULL),
	(1008,'PROJECT_AF',102),
	(1009,'PROJECT_AG',NULL),
	(1010,'PROJECT_AH',104);

SELECT * FROM DEPARTMENTS;
SELECT * FROM EMPLOYEEDETAILS;
SELECT * FROM PROJECTS;

ALTER TABLE EmployeeDetails RENAME TO Employees;

/*
Create a view named EmployeeDetails that displays the following columns from the Employees table */
CREATE VIEW
	EmployeeDetails AS
SELECT
	EmployeeID,
	EmployeeFirstName,
	EmployeeLastName,
	Salary
FROM
	Employees;

/*
 Filtering Data in a View */
CREATE OR REPLACE VIEW 
 	EmployeeDetails AS
SELECT
	EmployeeID,
	EmployeeFirstName,
	EmployeeLastName,
	Salary
FROM
	Employees
WHERE
	Salary > 40000;

/*
Write a query to retrieve data from the updated view. */
SELECT * FROM EMPLOYEEDETAILS;

/*
Simple Materialized View Creation */
CREATE MATERIALIZED VIEW
ActiveProjects AS
SELECT
	ProjectID,
	ProjectName
FROM
	Projects
WHERE
	DepartmentID IS NOT NULL;

/*DROP MATERIALIZED VIEW IF EXISTS ActiveProjects; */

/*
Creating an Index */
CREATE INDEX idx_Department ON Employees (DepartmentID);

/*
Refreshing a Materialized View */
REFRESH MATERIALIZED VIEW ActiveProjects;

/*
Creating a View with Joins */
CREATE VIEW 
DepartmentEmployeeView AS
SELECT
	E.EmployeeID,
	CONCAT(E.EmployeeFirstName,' ',E.EmployeeLastName) AS FullName,
	D.DepartmentName,
	E.Salary
FROM
	EMPLOYEEs E
JOIN
	DEPARTMENTS D
	ON
	E.DepartmentID = D.DepartmentID;
		
/*
Write a query using this view to select all employees working in the "Sales" department. */
SELECT 
	EmployeeID,
	FullName,
	DepartmentName
FROM
	DepartmentEmployeeView
WHERE
	DepartmentName = 'SALES';
	
/*
Parameterized Queries Using a View */
SELECT * FROM
	DepartmentEmployeeView
WHERE
	SALARY > 60000;

/*
Materialized View with Aggregate Functions */
CREATE MATERIALIZED VIEW 
TopPaidEmployees AS
SELECT * FROM
	EMPLOYEES
WHERE
	SALARY >=
		(
			SELECT PERCENTILE_CONT(0.9) WITHIN GROUP (ORDER BY SALARY) FROM EMPLOYEES
		);

SELECT 
	DEPARTMENTID,
	MAX(SALARY)
FROM
TOPPAIDEMPLOYEES
GROUP BY
DEPARTMENTID


SELECT 
	DEPARTMENTID,
	MAX(SALARY)
FROM
EMPLOYEES
GROUP BY
DEPARTMENTID
ORDER BY DEPARTMENTID

/*
Creating a Composite Index */
CREATE INDEX idx_department_salary ON EMPLOYEES(DEPARTMENTID,SALARY);

/*
Performance Analysis with Indexes */
SELECT COUNT(EMPLOYEEID) 
FROM EMPLOYEES
WHERE SALARY>50000;