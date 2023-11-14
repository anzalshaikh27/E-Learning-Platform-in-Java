/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import java.util.Date;

/**
 *
 * @author zakir
 */
public class Enrollment {
    
    private String course_ID;
    private String course;
    private String professor;
    private String description;
    private String term;
    private String withdraw = "Active";
    private String studentId;
    private String marks;
    private String gpa;
    private String announcement;
    private String grade;
    private Date timestamp;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }
    
    
    private studentLogin studlogin;

    public studentLogin getStudlogin() {
        return studlogin;
    }

    public void setStudlogin(studentLogin studlogin) {
        this.studlogin = studlogin;
    }

    
    public Enrollment (){
        this.studlogin = new studentLogin();
        this.timestamp = new Date(); // set the current time sanal edit
    }
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    
    public String getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(String course_ID) {
        this.course_ID = course_ID;
    }
    
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
     
    @Override
    public String toString(){
        return course_ID;
    }
}

