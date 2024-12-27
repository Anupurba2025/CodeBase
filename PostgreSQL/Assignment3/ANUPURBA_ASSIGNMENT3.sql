CREATE TABLE Departments
(
	DepartmentID INT PRIMARY KEY,
	DepartmentName VARCHAR(50)
);

CREATE TABLE Employees
(
	EmployeeID INT PRIMARY KEY,
	FirstName VARCHAR(50),
	LastName VARCHAR(50),
	DepartmentID INT,
	Salary INT,
	FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);

/*
Insering Values into the tables */
INSERT INTO DEPARTMENTS
(DepartmentID,DepartmentName)
VALUES
	(101,'IT'),
	(102,'MARKETING'),
	(103,'SALES'),
	(104,'HR');

INSERT INTO EMPLOYEES
(EmployeeID,FirstName,LastName,DepartmentID,Salary)
VALUES
	(1,'RAM','KUMAR',101,50000),
	(2,'SHYAM','ROY',102,60000),
	(3,'MAYA','KUMARI',101,24000),
	(4,'JOY','SINHA',103,30000),
	(5,'KOYEL','DAS',102,75000),
	(6,'RAMU','CHATTERJEE',104,45000),
	(7,'RINA','GORAI',103,35000),
	(8,'MINU','KUMARI',103,45000),
	(9,'JAYA','KUMARI',102,20000),
	(10,'MANAV','CHATTERJEE',101,35000),
	(11,'MONA','BANNERJEE',104,20000),
	(12,'KANHA','CHATTERJEE',104,45000),
	(13,'MALASHREE','REDDY',101,60000),
	(14,'RUMI','ROY',102,40000),
	(15,'RAJU','KUMAR',101,56000),
	(16,'RAMA','KUMAR',101,50000),
	(17,'SHYAMA','ROY',102,60000),
	(18,'MONALISHA','KUMARI',101,24000),
	(19,'JOYDEEP','SINHA',103,30000),
	(20,'KABI','DAS',102,75000),
	(21,'RAMULAL','CHATTERJEE',103,45000),
	(22,'RIMU','GORAI',103,35000),
	(23,'RAMU','CHATTERJEE',102,45000),
	(24,'RIYA','GORAI',102,35000),
	(25,'RIMA','GORAI',101,35000),
	(26,'RAMAN','JHA',101,90000),
	(27,'ROMI','SHUKLA',101,120000),
	(28,'MANU','SINHA',101,130000),
	(29,'RANU','KHAN',101,100000),
	(30,'RIMPA','GORAI',102,130000),
	(31,'RINA','S',102,90000),
	(32,'JHUMA','RAMAN',102,91000),
	(33,'JHINKU','S',102,95000),
	(34,'SWEATA','KUMARI',102,130000),
	(35,'RIVU','DASGUPTA',102,120000);

/*
FETCH THE DATA FROM THE EXISTING TABLES */
SELECT * FROM DEPARTMENTS;
SELECT * FROM EMPLOYEES;

/* ASSIGNMENT QUESTION */

/*
Aggregated Data with GROUP BY */
SELECT 
	E.DepartmentID,
	COUNT(E.EmployeeID) AS TotalEmployee,
	AVG(E.Salary) AS AvgSalary
FROM
	Employees E
	INNER JOIN
	Departments D
	ON
		E.DepartmentID = D.DepartmentID
GROUP BY
	E.DepartmentID
HAVING
	COUNT(E.EmployeeID) > 5
ORDER BY
	TotalEmployee DESC;

/*
Filtered Aggregation Using an Inner Query */


SELECT AVG(salary) FROM Employees; /* 62000.00000 */

SELECT 
 	E.DepartmentID,
	D.DepartmentName,
	Avg(E.Salary) as AvgSalary
FROM
	Employees E JOIN Departments D
	ON E.DepartmentID = D.DepartmentID
group by
	E.DepartmentID,D.DepartmentName
HAVING
	AVG(E.Salary)>
	(
		SELECT AVG(salary) FROM employees
	);

/*
CREATING A PROJECT TABLE */
CREATE TABLE Projects
(
	ProjectID INT PRIMARY KEY,
	ProjectName VARCHAR(60),
	DepartmentID INT,
	FOREIGN KEY(DEPARTMENTID) REFERENCES DEPARTMENTS(DEPARTMENTID)
);

INSERT INTO Projects
VALUES
	(1001,'ProjectAB',101),
	(1002,'ProjectAC',102),
	(1003,'ProjectAD',102),
	(1004,'ProjectAE',104),
	(1005,'ProjectAF',102),
	(1006,'ProjectAG',102),
	(1007,'ProjectAH',103),
	(1008,'ProjectAI',101),
	(1009,'ProjectAC',101),
	(1010,'ProjectAJ',102);

SELECT * FROM PROJECTS;

/*
  Nested Query with HAVING
  
  Question: Identify the projects that are being managed by departments with an 
  average salary greater than 75,000. Return the project name and the department name.
*/
SELECT 
	P.ProjectID,
	P.ProjectName,
	D.DepartmentName
FROM
	Projects P INNER JOIN Departments D
		ON P.DepartmentID=D.DepartmentID
WHERE D.DepartmentID IN(
	SELECT 
		DepartmentID
	FROM 
		Employees
	GROUP BY
		DepartmentID
	HAVING
		AVG(Salary)>75000
	);

/*
Advanced Grouping and Filtering  */
SELECT 
	D.DepartmentID,D.DepartmentName,
	COUNT(E.EMPLOYEEID) AS EmployeeEarnOver90k,
	AVG(E.Salary) AS AvgSalary
FROM
	Departments D
	JOIN Employees E
		ON D.DepartmentID = E.DepartmentID
WHERE
	E.SALARY > 90000
GROUP BY 
	D.DEPARTMENTID
HAVING COUNT(E.EmployeeID)>=2

/*
Combining HAVING with Multiple Conditions */
SELECT D.DEPARTMENTID
FROM
	Departments D 
	JOIN Employees E
		ON D.DepartmentID = E.DepartmentID
where D.DepartmentID IN
	(
		SELECT DepartmentID
		FROM
			Employees
		GROUP BY
			DEPARTMENTID
		HAVING
			COUNT(EmployeeID)>10
		
	);

SELECT 
	D.DepartmentID,
	SUM(E.Salary),
	D.DepartmentName
FROM 
	Employees E
	JOIN Departments D
		ON E.DepartmentID = D.DepartmentID
GROUP BY
	D.DepartmentID
HAVING 
	COUNT(EmployeeID)>10
		AND D.DepartmentName LIKE '%Tech%'
ORDER BY SUM(E.Salary)DESC
LIMIT 3;


INSERT INTO Departments
(DepartmentID,DepartmentName)
VALUES
	(105,'Technology');

INSERT INTO Employees
(EmployeeID,FirstName,LastName,DepartmentID,Salary)
VALUES
	(36, 'John','Doe', 105, 50000),
	(37, 'Jane',' Smith', 105, 52000),
	(38, 'Robert',' Brown', 105, 48000),
	(39, 'Emily ','Davis', 105, 55000),
	(40, 'Michael',' Johnson', 105, 60000),
	(41, 'Sarah',' Wilson', 105, 47000),
	(42, 'David',' Miller', 105, 58000),
	(43, 'Laura ','Martinez', 105, 49000),
	(44, 'James ','Anderson', 105, 53000),
	(45, 'Sophia',' Taylor', 105, 51000),
	(46, 'Daniel',' Thomas', 105, 56000);
