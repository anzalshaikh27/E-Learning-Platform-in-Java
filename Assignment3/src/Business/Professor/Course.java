/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author anzal
 */
public class Course {
    
    String course_id;
    String course_name;
    String course_description;
    String term;
    private Date courseCreationTimestamp; // Timestamp for course creation sanal edit

    
    private ProfessorLogin professor;

    public ProfessorLogin getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorLogin professor) {
        this.professor = professor;
    }
    

    public Course() {
        this.professor = new ProfessorLogin(); // Initialize professor object in the constructor
       // this.courseCreationTimestamp = new Date(); //sanal edit
    }
    
    // Getter for courseCreationTimestamp sanal edit
    public String getCourseCreationTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(courseCreationTimestamp);
    }

    public String getTerm() {
        return term;
    }

    
    
    
    public void setTerm(String term) {
        this.term = term;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }
    
    public String toString(){
        return course_id;
    }
    
}
