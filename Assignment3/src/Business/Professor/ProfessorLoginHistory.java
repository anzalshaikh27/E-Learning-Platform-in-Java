/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor;

import java.util.ArrayList;

/**
 *
 * @author zakir
 */
public class ProfessorLoginHistory {
    
    private ArrayList<ProfessorLogin> history;
    
    public ProfessorLoginHistory() {
        history = new ArrayList<>();
    }

    public ArrayList<ProfessorLogin> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ProfessorLogin> history) {
        this.history = history;
    }
    
    public ProfessorLogin addnewprofessors(){
        ProfessorLogin newProfessors = new ProfessorLogin();
        history.add(newProfessors);
        return newProfessors;
    }  
    
    public void refreshHistory() {
        history.clear(); 
    }
    
    public void deleteStudent(ProfessorLogin professor) {
        history.remove(professor);
    }
    
    public ProfessorLogin getProfessorByFirstname(String Fname) {
        for (ProfessorLogin professor : history) {
            if (professor.getFirstName().equals(Fname)) {
                return professor;
            }
        }
        return null; // Return null if the professor with the specified username is not found
    }
    
}
