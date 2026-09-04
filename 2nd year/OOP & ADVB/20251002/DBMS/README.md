# Midterm Project (DBMS)

<br> 

<h2>1. Project Overview</h2>
<p>
The Computer Lab Management System will manage the usage of computer workstations by students and teachers in a school environment. 
The system must track logins/logouts, monitor application usage, and provide a mechanism for special access requests outside of scheduled class hours.
The primary output for this project will be an Entity-Relationship Diagram (ERD) that accurately models the data requirements and relationships of the system.
</p>



<h2>2. System Description</h2>
Users:
<ul>
  <li>Students and Teachers use lab workstations</li>
  <li>Lab Staff manages special access requests and system monitoring</li>
</ul>

Workstation Access:
<ul>
  <li>Users log in to workstations based on their class schedules</li>
  <li>Login access is active only during scheduled class hours</li>
  <li>Outside class hours, users may request special access activation from lab staff</li>
</ul>

Activity Tracking: Each session must log
<ul>
  <li>Login time and Logout time</li>
  <li>Workstation used</li>
  <li>Applications accessed during the session</li>
</ul>

Administrative Functions:
<ul>
  <li>Lab staff can approve or deny special access requests</li>
  <li>System should store all requests and their approval status</li>
</ul>



<h2>3. Functional Requirements (for ERD design)</h2>
The ERD must support the following entities and relationships:

<ul>
  <li><strong>Users Attributes</strong></li>
  <ul>
    <li>UserID</li>
    <li>Name</li>
    <li>Role (Student/Teacher/Staff), etc.</li>
  </ul>
</ul>

<ul>
  <li><strong>Classes/Class Schedules Attributes</strong></li>
  <ul>
    <li>ClassID</li>
    <li>Subject</li>
    <li>Day/Time</li>
    <li>Assigned Teacher</li>
    <li>List of Students</li>
  </ul>
</ul>
Relationship: Users (Students/Teachers) → Classes.

<ul>
  <li><strong>Workstations Attributes</strong></li>
  <ul>
    <li>WorkstationID</li>
    <li>Location</li>
    <li>Status (Available/In Use)</li>
    <li>Assigned Teacher</li>
    <li>List of Students</li>
  </ul>
</ul>

<ul>
  <li><strong>Sessions (Login/Logout) Attributes</strong></li>
  <ul>
    <li>SessionID</li>
    <li>LoginTime</li>
    <li>LogoutTime</li>
  </ul>
</ul>
Relationships: User → Workstation → Session.

<ul>
  <li><strong>Application Logs Attributes</strong></li>
  <ul>
    <li>AppLogID</li>
    <li>ApplicationName</li>
    <li>TimeAccessed</li>
  </ul>
</ul>
Relationship: Session → Application Log.

<ul>
  <li><strong>Special Access Requests Attributes</strong></li>
  <ul>
    <li>RequestID</li>
    <li>RequestTime</li>
    <li>Purpose</li>
    <li>ApprovalStatus</li>
    <li>ApprovedBy</li>
  </ul>
</ul>
Relationships: User → Special Access Request → Lab Staff.



<h2>4. Deliverables</h2>
Entity-Relationship Diagram (ERD) that includes:
<ul>
  <li>Entities, attributes, and primary keys.</li>
  <li>Correct relationships with cardinalities (1:1, 1:M, M:N)</li>
  <li>Associative entities where necessary (e.g., Students in Classes, Applications in Sessions)</li>
</ul>



<h2>5. Constraints</h2>
<ul>
  <li>Each workstation can only be used by one user per session</li>
  <li>A user can have multiple sessions but only one active session at a time</li>
  <li>Applications accessed must always be linked to a session</li>
  <li>Special access requests must have a status (Pending, Approved, Denied)</li>
</ul>

<br>

Note: Please use Crows foot notation
