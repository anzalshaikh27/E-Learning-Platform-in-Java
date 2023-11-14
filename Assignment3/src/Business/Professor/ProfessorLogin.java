/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author zakir
 */
public class ProfessorLogin {
    
    public String firstName;
    public String lastName;
    public String email;
    public String username;
    public String password;
    public String temp;
    public String announcement;
    private Date timestamp;//sanal edit
    private int numberOfCoursesCreated; // sanal edit
    private String image;
    
    public int getNumberOfCoursesCreated() {
        return numberOfCoursesCreated;
    }

    public void incrementNumberOfCoursesCreated() {
        this.numberOfCoursesCreated++;
    }

    /*public ProfessorLogin() { //sanal edit
        // existing code
        this.timestamp = new Date(); // set the current time
    }*/

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
    public String getTimestamp() { //sanal edit
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(timestamp);
    }
    
    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return firstName;
    }
    
}
