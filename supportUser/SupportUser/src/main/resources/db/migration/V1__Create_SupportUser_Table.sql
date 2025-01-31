CREATE TABLE SupportUser(
	id BIGSERIAL PRIMARY KEY,
	Code VARCHAR(50) UNIQUE NOT NULL,
	name VARCHAR(50) NOT NULL,
	Email VARCHAR(100) UNIQUE NOT NULL,
	Phone VARCHAR(10) UNIQUE NOT NULL,
	DOB DATE NOT NULL,
	DOJ DATE NOT NULL
);