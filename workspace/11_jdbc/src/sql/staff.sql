--테이블삭제
DROP TABLE staff;

--테이블추가
CREATE TABLE staff
(
	no NUMBER,
	name VARCHAR2(100),
	department VARCHAR2(100),
	hireDate DATE,
	PRIMARY KEY(no)



);

SELECT no,name,department,hireDate FROM staff;
SELECT MAX(no) FROM staff;