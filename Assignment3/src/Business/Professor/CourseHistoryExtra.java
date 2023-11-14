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
public class CourseHistoryExtra {
    
    
    private ArrayList<CourseExtra> historyex;
    
    
    
    
    public CourseHistoryExtra(){
        historyex = new ArrayList<>();
    }

    public ArrayList<CourseExtra> getHistoryex() {
        return historyex;
    }

    public void setHistoryex(ArrayList<CourseExtra> historyex) {
        this.historyex = historyex;
    }
    
    public CourseExtra addnewcourse(){
        CourseExtra cos = new CourseExtra();
        historyex.add(cos);
        return cos;
    }
    
    public void deleteCourse(CourseExtra course){
        historyex.remove(course);
    }
    
    
    public CourseExtra searchCourse(String course_ID){
        
        for (CourseExtra course : historyex){
            if(course.getCourse_id_ex().equals(course_ID)){
                return course;
            }
        }
        return null;
        
    }
    
}
