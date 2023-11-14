/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor;

import java.util.ArrayList;

/**
 *
 * @author anzal
 */
public class CourseHistory {
    
    private ArrayList<Course> history;
    
    
    public CourseHistory(){
        history = new ArrayList<>();
    }

    public ArrayList<Course> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Course> history) {
        this.history = history;
    }
    
    public Course addnewcourse(){
        Course cos = new Course();
        history.add(cos);
        return cos;
    }
    
    public void deleteCourse(Course course){
        history.remove(course);
    }
    
    
    public Course searchCourse(String course_ID){
        
        for (Course course : history){
            if(course.getCourse_id().equals(course_ID)){
                return course;
            }
        }
        return null;
        
    }
    
}
