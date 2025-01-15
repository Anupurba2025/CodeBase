/*
CREATING TABLES..*/

CREATE TABLE Authors(
	AuthorID INT PRIMARY KEY,
	Name VARCHAR(35) NOT NULL,
	Country VARCHAR(50),
	DateOfBirth DATE
);

CREATE TABLE Books(
	BookID INT PRIMARY KEY,
	Title VARCHAR(30) NOT NULL,
	AuthorID INT,
	Genre VARCHAR(25),
	PublishedYear INTEGER CHECK (PublishedYear >= 1000 AND PublishedYear <= EXTRACT(YEAR FROM CURRENT_DATE)),
	CopiesAvailable INTEGER CHECK(CopiesAvailable>0),
	FOREIGN KEY(AuthorID) REFERENCES Authors(AuthorID)
);

CREATE TABLE MEMBERS(
	MemberID INT PRIMARY KEY,
	Name VARCHAR(35) NOT NULL,
	MembershipDate DATE DEFAULT CURRENT_DATE,
	Email VARCHAR(50) UNIQUE CHECK (Email ~* '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$')
);

CREATE TABLE BorrowingRecords(
	RecordID SERIAL PRIMARY KEY,
	MemberID INT,
	BookID INT,
	BorrowDate DATE ,
	ReturnDate DATE,
	FOREIGN KEY(MemberID) REFERENCES Members(MemberID) ON DELETE CASCADE,
	FOREIGN KEY(BookID) REFERENCES Books(BookID) ON DELETE CASCADE
);


/* 
INSERTING THE VALUES TO EACH TABLE */

INSERT INTO Authors
(AuthorID,Name,Country,DateOfBirth)
VALUES
	(101, 'J.K. Rowling', 'United Kingdom', '1965-07-31'),
	(102, 'George Orwell', 'United Kingdom', '1903-06-25'),
	(103, 'Jane Austen', 'United Kingdom', '1775-12-16'),
	(104, 'Stephen King', 'United States', '1947-09-21'),
	(105, 'Haruki Murakami', 'Japan', '1949-01-12'),
	(106, 'Mark Twain', 'United States', '1835-11-30'),
	(107, 'Agatha Christie', 'United Kingdom', '1890-09-15');

/*
ALTER TABLE BOOKS TO CHANGE THE SIZE OF TITLE */
ALTER TABLE Books
ALTER COLUMN Title TYPE VARCHAR(256);

INSERT INTO Books 
(BookID, Title, AuthorID, Genre, PublishedYear, CopiesAvailable) 
VALUES
	(1, 'Harry Potter and the Philosopher''s Stone', 101, 'Fantasy', 1997, 100),
	(2, '1984', 102, 'Dystopian', 1949, 50),
	(3, 'Pride and Prejudice', 103, 'Romance', 1813, 30),
	(4, 'The Shining', 104, 'Horror', 1977, 70),
	(5, 'Norwegian Wood', 105, 'Fiction', 1987, 40),
	(6, 'Adventures of Huckleberry Finn', 106, 'Adventure', 1884, 60),
	(7, 'Murder on the Orient Express', 107, 'Mystery', 1934, 80),
	(8, 'Fantastic Beasts and Where to Find Them', 101, 'Fantasy', 2001, 90),
	(9, 'Animal Farm', 102, 'Political Satire', 1945, 60),
	(10, 'Sense and Sensibility', 103, 'Romance', 1811, 50),
	(11, 'Carrie', 104, 'Horror', 1974, 65),
	(12, 'Kafka on the Shore', 105, 'Fiction', 2002, 45),
	(13, 'The Prince and the Pauper', 106, 'Historical Fiction', 1881, 55),
	(14, 'And Then There Were None', 107, 'Mystery', 1939, 75),
	(15, 'The Casual Vacancy', 101, 'Contemporary Fiction', 2012, 80);


INSERT INTO MEMBERS
(MemberID,Name,Email)
VALUES
	(1001, 'Anupurba Kha', 'anupurba.kha@example.com'),
	(1002, 'John Doe', 'johndoe@example.com'),
	(1003, 'Jane Smith', 'janesmith@example.com'),
	(1004, 'Mark Johnson', 'markjohnson@example.com'),
	(1005, 'Emily Davis', 'emilydavis@example.com'),
	(1006, 'Michael Brown', 'michaelbrown@example.com'),
	(1007, 'Sarah Wilson', 'sarahwilson@example.com'),
	(1008, 'David Lee', 'davidlee@example.com'),
	(1009, 'Laura White', 'laurawhite@example.com'),
	(1010, 'Daniel Harris', 'danielharris@example.com');

INSERT INTO BorrowingRecords
(RecordID,MemberID,BookID,BorrowDate,ReturnDate)
VALUES
	(10001, 1008, 1, '2023-12-11', '2024-01-02'),
	(10002, 1002, 5, '2024-01-15', '2024-02-15'),
	(10003, 1003, 2, '2024-01-01', '2024-01-20'),
	(10004, 1004, 3, '2023-11-25', '2023-12-05'),
	(10005, 1005, 4, '2023-12-10', '2024-01-10'),
	(10006, 1006, 1, '2023-12-01', '2023-12-25'),
	(10007, 1007, 7, '2024-02-05', '2024-02-20'),
	(10008, 1009, 6, '2024-01-25', '2024-02-10'),
	(10009, 1002, 8, '2024-03-01', '2024-03-15'),
	(10010, 1003, 9, '2024-02-20', '2024-03-05'),
	(10011, 1004, 10, '2024-01-15', '2024-02-01'),
	(10012, 1005, 2, '2024-01-10', '2024-02-05'),
	(10013, 1006, 3, '2023-11-30', '2023-12-15'),
	(10014, 1007, 4, '2024-01-22', '2024-02-01'),
	(10015, 1008, 5, '2024-01-05', '2024-01-25');

/*
QUERY TO FETCH THE ALL DATAS INSERTED INTO THE TABLE */

SELECT * FROM AUTHORS;
SELECT * FROM BOOKS;
SELECT * FROM MEMBERS;
SELECT * FROM BORROWINGRECORDS;

/*
3.BASIC QUERIES */

/*List all books and their authors. */
SELECT 
	B.BOOKID, B.TITLE, 
	A.AUTHORID,A.NAME
FROM
	BOOKS B
JOIN
	AUTHORS A
ON
	B.AUTHORID = A.AUTHORID
ORDER BY B.BOOKID

/*
Show all members who joined in the last year. */
SELECT M.MEMBERID 
FROM
	MEMBERS M
WHERE
	EXTRACT(YEAR FROM M.MEMBERSHIPDATE) = EXTRACT(YEAR FROM CURRENT_DATE)-1 ;


/*
Display all books in the “Fiction” genre. */
SELECT 
	B.BOOKID as BOOK_ID_FOR_FICTION_GENRE,
	B.TITLE
FROM
	BOOKS B
WHERE
	B.GENRE = 'Fiction'

/*
JOIN */

/*
 Find the names of members and the titles of books they have borrowed. */
SELECT 
 	M.NAME,BB.TITLE
FROM
	MEMBERS M
	JOIN
		BORROWINGRECORDS B
		ON
		M.MEMBERID = B.MEMBERID
		JOIN
			BOOKS BB
			ON
			BB.BOOKID = B.BOOKID


/*
List books along with their authors’ names and countries. */

SELECT B.BOOKID,
	B.TITLE,
	A.NAME,
	A.COUNTRY
FROM
	BOOKS B
JOIN
	AUTHORS A
ON
	B.AUTHORID = A.AUTHORID;


/*
Aggregation Queries */
/*
Count how many books are available for each genre.*/
SELECT 
	GENRE,COUNT(BOOKID)
FROM
	BOOKS
GROUP BY
	GENRE
	
/*
Find the most borrowed book. */
SELECT 
    BOOKID,
    COUNT(MEMBERID) AS BorrowCount
FROM 
    BorrowingRecords
GROUP BY 
    BOOKID
ORDER BY 
    BorrowCount DESC
LIMIT 1;

/*
Subqueries */

/*
 List the books written by authors who were born before 1950.*/
 SELECT 
 	B.BOOKID,
	 B.TITLE,
	 A.NAME,A.DATEOFBIRTH
FROM
	BOOKS B
JOIN
	AUTHORS A
	ON
	B.AUTHORID = A.AUTHORID
WHERE
	A.AUTHORID IN
	(
		SELECT AUTHORID FROM AUTHORS
		WHERE EXTRACT(YEAR FROM A.DATEOFBIRTH) < 1950
	);
	
/*
Find members who borrowed books published after 2010. */
SELECT 
	M.MEMBERID,M.NAME,
	B.TITLE,B.PUBLISHEDYEAR
FROM
	MEMBERS M
	JOIN
	BORROWINGRECORDS BR
	ON
		M.MEMBERID=BR.MEMBERID
	JOIN
	BOOKS B
	ON
		B.BOOKID = BR.BOOKID
WHERE
	B.BOOKID IN
		(
			SELECT BOOKID FROM BOOKS
			WHERE PUBLISHEDYEAR>2010
		)
	
/*
Delete a member’s record after their membership expires. */
DELETE FROM Members
WHERE MembershipDate < CURRENT_DATE - INTERVAL '1 year';


/*
Complex Query */

/*
Find members who have borrowed more than 2 books in the last 6 months. 

ITS RETURN ONLY TABLE TABLE NAME WITH NO DATA BECAUSE EVERY MEMBER TOOK 2 BOOK MAX IN LAST 6 MONTHS.*/

SELECT 
	M.MEMBERID, M.NAME,
	COUNT(BR.BOOKID) AS BorrowedBooksCount
FROM
	MEMBERS M
JOIN
	BORROWINGRECORDS BR
	ON
		M.MEMBERID = BR.MEMBERID
WHERE 
    BR.BorrowDate >= CURRENT_DATE - INTERVAL '6 months'
GROUP BY
	M.MEMBERID
HAVING
	COUNT(BR.BOOKID)>2;
	

/*
COUNT OF NUMBER OF BOOKS BORROWED BY EACH MEMBER
*/
SELECT 
    M.MEMBERID, 
    M.NAME,
    COUNT(BR.BOOKID) AS BorrowedBooksCount
FROM 
    MEMBERS M
JOIN 
    BORROWINGRECORDS BR ON M.MEMBERID = BR.MEMBERID
GROUP BY 
    M.MEMBERID;


/*Update the CopiesAvailable when a book is borrowed or returned. */
BEGIN;

UPDATE BOOKS
SET COPIESAVAILABLE = COPIESAVAILABLE +
	CASE
		WHEN :TRANSACTION_TYPE='BORROW' THEN -1
		WHEN : TRANSACTION_TYPE='RETURN' THEN NULL
		ELSE 0
	END
WHERE BOOKID = :BOOKID;

IF :TRANSACTION_TYPE = 'BORROW' THEN
	INSERT INTO BORROWINGRECORDS(RECORDID,MEMBERID,BOOKID,BORROWDATE,RETURNDATE)
	VALUES
		(:RECORDID,:MEMBERID,:BOOKID,:BORROWDATE,:RETURNDATE);
ELSE IF :TRANSACTION_TYPE = 'RETURN' THEN
	DELETE FROM BORROWINGRECORDS WHERE RECORDID = :RECORDID;
END IF;

COMMIT;
