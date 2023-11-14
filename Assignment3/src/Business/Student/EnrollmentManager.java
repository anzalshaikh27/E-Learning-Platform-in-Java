/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

/**
 *
 * @author zakir
 */
public class EnrollmentManager {
    
     private int totalEnrolledCredits = 0;
    private static EnrollmentManager instance;

    private EnrollmentManager() {}

    public static EnrollmentManager getInstance() {
        if (instance == null) {
            instance = new EnrollmentManager();
        }
        return instance;
    }

    public int getTotalEnrolledCredits() {
        return totalEnrolledCredits;
    }

    public void addCredits(int credits) {
        totalEnrolledCredits += credits;
    }
    
}
