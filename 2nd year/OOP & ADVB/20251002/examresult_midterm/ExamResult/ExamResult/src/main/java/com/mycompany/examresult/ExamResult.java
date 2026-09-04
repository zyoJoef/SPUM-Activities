package com.mycompany.examresult;

import java.sql.Timestamp;

public class ExamResult {
    private int id;  
    private String studentName;
    private String subject;
    private String score;
    private Timestamp dateTaken;

    public ExamResult(int id, String studentName, String subject, String score, Timestamp dateTaken) {
        this.id = id;
        this.studentName = studentName;
        this.subject = subject;
        this.score = score;
        this.dateTaken = dateTaken;
    }

    public ExamResult(String studentName, String subject, String score, Timestamp dateTaken) {
        this.studentName = studentName;
        this.subject = subject;
        this.score = score;
        this.dateTaken = dateTaken;
    }

    public int getId() { return id; }
    public String getStudentName() { return studentName; }
    public String getSubject() { return subject; }
    public String getScore() { return score; }
    public Timestamp getDateTaken() { return dateTaken; }

    public void setId(int id) { this.id = id; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setScore(String score) { this.score = score; }
    public void setDateTaken(Timestamp dateTaken) { this.dateTaken = dateTaken; }
}
