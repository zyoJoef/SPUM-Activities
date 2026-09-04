# Midterm Project
(OOP2 - Spring Boot) – Group Work (same groupings last semester in OOP1)

<h2><strong>Computer Lab Management System – Admin User Management Module</strong></h2>



<h2>1. Project Overview</h2>
You are required to develop a Spring Boot CRUD Web Application that implements the User Management module of the Computer Lab Management System you have started in OOP1.
The system must allow an Administrator (Lab Staff role) to manage all users who will later interact with the system.
There will be no authentication requirement for the admin and any other users (since we have not yet covered Spring security).
Kindly use the existing database you have submitted last semester in OOP1.



<h2>2. Scope of the Midterm Project</h2>
You will develop a Spring Boot application that includes:
· Database integration
· CRUD operations
· Role management
· Validation and constraints enforcement

The module must be connected to a relational database (MySQL).

<h2>3. Functional Requirements</h2>
3.1 User Roles
The system must support the following roles:
· Student
· Teacher
· Lab Staff (Administrator)
Only Lab Staff (Admin role) can perform full CRUD operations.

3.2 User Management (CRUD)
The Admin must be able to:
1. Create new users
2. View list of users
3. View individual user details
4. Update user information
5. Delete users

3.3 Required User Information
Your system must support attributes necessary to identify:
· Unique user identifier
· Full name
· Role
· Email / Username
· Status (Active / Inactive)
You must determine additional necessary attributes through your own analysis.

3.4 Business Rules to Enforce
Your system must implement the following validations:
· A user must have only one role.
· Email/Username must be unique.
· Role must be restricted to predefined values.
· Admin users cannot be deleted if they are the only active admin.
· Soft delete is recommended (mark inactive instead of permanent delete).

<h2>4. Technical Requirements</h2>
You must use:
· Spring Boot
· Spring Data JPA
· MySQL
· REST Controller or Thymeleaf (choose one)
· Proper layered architecture:
o Controller
o Service
o Repository
o Entity



<h2>5. Database Requirements</h2>
You must:
1. Create the database schema based on your ERD.
2. Apply proper primary key and constraints.
3. Implement:
o Role validation
o Unique constraints
4. Insert at least:
o 5 Students
o 2 Teachers
o 2 Lab Staff (Admins)



<h2>6. Optional Bonus (Not Required but +5 points)</h2>
· Implement pagination
· Implement search by role
