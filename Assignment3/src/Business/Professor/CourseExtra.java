/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor;

/**
 *
 * @author anzal
 */
public class CourseExtra {
    
    String course_id_ex;
    String course_name_ex;
    String course_description_ex;
    String term_ex;
    
    private ProfessorLogin professor;

    public ProfessorLogin getProfessor() {
        return professor;
    }
    
     public void setProfessor(ProfessorLogin professor) {
        this.professor = professor;
    }
    

    public CourseExtra() {
        this.professor = new ProfessorLogin(); // Initialize professor object in the constructor
    }

    public String getCourse_id_ex() {
        return course_id_ex;
    }

    public void setCourse_id_ex(String course_id_ex) {
        this.course_id_ex = course_id_ex;
    }

    public String getCourse_name_ex() {
        return course_name_ex;
    }

    public void setCourse_name_ex(String course_name_ex) {
        this.course_name_ex = course_name_ex;
    }

    public String getCourse_description_ex() {
        return course_description_ex;
    }

    public void setCourse_description_ex(String course_description_ex) {
        this.course_description_ex = course_description_ex;
    }

    public String getTerm_ex() {
        return term_ex;
    }

    public void setTerm_ex(String term_ex) {
        this.term_ex = term_ex;
    }
    
    
    public String toString(){
        return course_id_ex;
    }
    
}
