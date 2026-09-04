# Quiz 1

CREATE TABLE mte_scores (

    id INT AUTO_INCREMENT PRIMARY KEY,

    student_name VARCHAR(100) NOT NULL,

    registration_number VARCHAR(50) NOT NULL,

    subject_code VARCHAR(20) NOT NULL,

    subject_name VARCHAR(100) NOT NULL,

    score DECIMAL(5,2) NOT NULL CHECK (score >= 0 AND score <= 100),

    exam_date DATE NOT NULL

);

Create a Springboot application that can peform these function on the data above.
1. Show all data in an HTML data table
2. Add entries (thru an add button) 

There is no need for a login account to access the application

<hr>

Note: 
<p>demo-0.0.1-SNAPSHOT.jar was removed from this repository, since it is around
64MB and Github itself doesn't allow file size above 25MB</p>
