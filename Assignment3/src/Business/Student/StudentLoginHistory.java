package Business.Student;

import java.util.ArrayList;

public class StudentLoginHistory {
    
    private ArrayList<studentLogin> history;
    private static StudentLoginHistory instance;
    
    public static StudentLoginHistory getInstance() {
        if (instance == null) {
            instance = new StudentLoginHistory();
        }
        return instance;
    }

    // Constructor initializes the history ArrayList
    public StudentLoginHistory() {
            history = new ArrayList<>();
    }

    public ArrayList<studentLogin> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<studentLogin> history) {
        this.history = history;
    }
    
     public void deleteStudent(studentLogin student) {
        history.remove(student);
    }
    
    public studentLogin addnewstudents(){
        studentLogin newStudents = new studentLogin();
        history.add(newStudents);
        return newStudents;
    }
    
    public void refreshHistory() {
        history.clear(); 
    }
    
    
    public studentLogin getStudentByFirstname(String Fname) {
        for (studentLogin stud : history) {
            if (stud.getFirstName().equals(Fname)) {
                return stud;
            }
        }
        return null; // Return null if the student with the specified username is not found
    }
    
    public studentLogin getStudentByNEU(long NEU) {
        for (studentLogin stud : history) {
            if (stud.getNeuId() == NEU) {
                return stud;
            }
        }
        return null; // Return null if the student with the specified username is not found
    }
    
}
