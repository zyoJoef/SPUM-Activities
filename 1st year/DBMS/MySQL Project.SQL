-- create
CREATE TABLE STUDENT (
  studentId INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  age INTEGER NOT NULL,
  course TEXT NOT NULL,
  year INTEGER NOT NULL,
  department TEXT NOT NULL
);

-- insert example data
INSERT INTO STUDENT VALUES (1, 'Ryan Felipe', 20 ,'Computer Science', 2 ,'CBM');
INSERT INTO STUDENT VALUES (2, 'Julius Rodriguez', 21, 'Information Technology', 3 ,'CBM');
INSERT INTO STUDENT VALUES (3, 'Roberto Penano', 22, 'Entrepreneurship', 4 ,'CBM');
INSERT INTO STUDENT VALUES (4, 'Allysa Jane Cruz', 19, 'Computer Science', 1,'CBM');
INSERT INTO STUDENT VALUES (5, 'Zachary Flores', 19, 'Tourism Management', 1,'CBM');
INSERT INTO STUDENT VALUES (6, 'Ashley Gabriel Reyes', 20, 'Hospitality Management', 2 ,'CBM');
INSERT INTO STUDENT VALUES (7, 'Isabella Martinzel', 21, 'Nursing', 3 ,'CNAHS');
INSERT INTO STUDENT VALUES (8, 'Reynald Bautista', 19, 'Music Therapy', 1,'CMPA');
INSERT INTO STUDENT VALUES (9, 'Hanna Garcia', 20, 'Tourism Management', 4,'CBM');
INSERT INTO STUDENT VALUES (10, 'Claire Aquino', 19, 'Computer Science', 1,'CBM');

-- fetch all students
SELECT * FROM STUDENT;
