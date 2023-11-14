/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zakir
 */
public class EnrollmentHistory {
    
    private ArrayList<Enrollment> enrollmentList;
    
    // Constructor initializes the enrollmentList ArrayList
    public EnrollmentHistory() {
        enrollmentList = new ArrayList<>();
    }


    public ArrayList<Enrollment> getEnrollmentList() {
        return enrollmentList;
    }

    public void setEnrollmentList(ArrayList<Enrollment> enrollmentList) {
        this.enrollmentList = enrollmentList;
    }
    
    public Enrollment addNewCourse(){
        Enrollment newcourses = new Enrollment();
        enrollmentList.add(newcourses);
        return newcourses;
        
    } 
}
