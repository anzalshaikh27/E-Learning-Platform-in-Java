/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.Student;

import Business.Admin.TicketManager;
import Business.Professor.CourseHistory;
import Business.Professor.ProfessorLogin;
import Business.Professor.ProfessorLoginHistory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author zakir
 */
public class StudentCourseWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseWorkJPanel
     */
    javax.swing.JPanel workArea;
    StudentLoginHistory history;
    private studentLogin loggedInUser;
    EnrollmentHistory enrollmentList;
    CourseHistory c_history;
    private ProfessorLogin profLogin;
    ProfessorLoginHistory history1;
    private Enrollment enroll;
    private boolean ignoreComboEvents = false;
    TicketManager ticketManager;
    
    public StudentCourseWorkJPanel(JPanel workArea,StudentLoginHistory history,studentLogin loggedInUser,EnrollmentHistory enrollmentList,CourseHistory c_history,ProfessorLogin profLogin,ProfessorLoginHistory history1,Enrollment enroll,TicketManager ticketManager) {
        initComponents();
        this.workArea = workArea;
        this.loggedInUser = loggedInUser;
        this.history = history;
        this.enrollmentList = enrollmentList;
        this.c_history = c_history;
        this.profLogin = profLogin;
        this.history1 = history1;
        this.enroll = enroll;
        this.ticketManager = ticketManager;
        customizeComponents();
        
        cmbCourse.removeAllItems();
         populateComboBox(); // Populate the combo box when the panel is initialized
        
         cmbCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!ignoreComboEvents) {
                    String selectedCourseName = (String) cmbCourse.getSelectedItem();
                    Enrollment selectedEnrollment = findEnrollmentByCourseName(selectedCourseName);
                    if (selectedEnrollment != null) {
                        txtCourseWork.setText(selectedEnrollment.getDescription());
                    } else {
                        txtCourseWork.setText(""); // Clear the text field if no matching Enrollment is found
                    }
                }
            }
        });
    }
    
      private void updateComboBox(String selectedItem) {
        ignoreComboEvents = true;
        cmbCourse.setSelectedItem(selectedItem);
        ignoreComboEvents = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtCourse = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox<>();
        lblCourseWork = new javax.swing.JLabel();
        txtCourseWork = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("COURSE WORK");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtCourse.setText("Course:");

        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });

        lblCourseWork.setText("Coursework:");

        txtCourseWork.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCourseWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseWorkActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/score.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourseWork)
                    .addComponent(txtCourse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCourseWork, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(400, 400, 400))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourse)
                            .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourseWork, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseWork)))
                    .addComponent(jLabel1))
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ViewStudentPortalJPanel panel = new ViewStudentPortalJPanel(workArea,history,loggedInUser,enrollmentList,c_history,profLogin,history1,enroll,ticketManager);
        workArea.add("ViewStudentPortalJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
         // Clear the combo box before populating it to avoid duplicate entries    
    // Get the selected course name from the combo box
    String selectedCourseName = (String) cmbCourse.getSelectedItem();
    
    // Find the corresponding Enrollment object based on the selected course name
    Enrollment selectedEnrollment = findEnrollmentByCourseName(selectedCourseName);
    
    // Update the description in txtCourseWork
    if (selectedEnrollment != null) {
        txtCourseWork.setText(selectedEnrollment.getDescription());
    } else {
        // Clear the text field if no matching Enrollment is found
        txtCourseWork.setText("");
    }
    }//GEN-LAST:event_cmbCourseActionPerformed

    private void cmbCourseItemStateChanged(java.awt.event.ItemEvent evt) {                                            
    // Get the selected course name from the combo box
    String selectedCourseName = (String) cmbCourse.getSelectedItem();
    
    // Find the corresponding Enrollment object based on the selected course name
    Enrollment selectedEnrollment = findEnrollmentByCourseName(selectedCourseName);
    
    // Update the description in txtCourseWork
    if (selectedEnrollment != null) {
        txtCourseWork.setText(selectedEnrollment.getDescription());
    } else {
        // Clear the text field if no matching Enrollment is found
        txtCourseWork.setText("");
    }
}

private Enrollment findEnrollmentByCourseName(String courseName) {
    // Iterate through enrollmentList and find the Enrollment object by course name
    for (Enrollment enrollment : enrollmentList.getEnrollmentList()) {
        if (enrollment.getCourse().equals(courseName)) {
            return enrollment;
        }
    }
    return null; // Return null if no matching Enrollment is found
}

    private void txtCourseWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseWorkActionPerformed

    }//GEN-LAST:event_txtCourseWorkActionPerformed

    private void customizeComponents() {
    // Set background color
    this.setBackground(new Color(44, 62, 80));

    // Set font and text color for labels and title
    Font labelFont = new Font("Tahoma", Font.BOLD, 12);
    Color textColor = new Color(236, 240, 241);
    lblTitle.setFont(new Font("Tahoma", Font.BOLD, 28));
    lblTitle.setForeground(textColor);
    txtCourse.setFont(labelFont);
    txtCourse.setForeground(textColor);
    lblCourseWork.setFont(labelFont);
    lblCourseWork.setForeground(textColor);

    // Set text field styles
    Color textFieldBackground = new Color(52, 73, 94);
    Border textFieldBorder = BorderFactory.createEmptyBorder(5, 15, 5, 15);
    txtCourseWork.setBackground(textFieldBackground);
    txtCourseWork.setForeground(textColor);
    txtCourseWork.setBorder(textFieldBorder);

    // Set combo box styles
    cmbCourse.setBackground(textFieldBackground);
    cmbCourse.setForeground(textColor);
    cmbCourse.setFont(labelFont);

    // Set button style
    Color buttonBackground = new Color(52, 152, 219);
    Color buttonTextColor = new Color(255, 255, 255);
    Border buttonBorder = BorderFactory.createEmptyBorder(10, 25, 10, 25);
    btnBack.setBackground(buttonBackground);
    btnBack.setForeground(buttonTextColor);
    btnBack.setBorder(buttonBorder);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCourseWork;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel txtCourse;
    private javax.swing.JTextField txtCourseWork;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        cmbCourse.removeAllItems();
        for (Enrollment enrollment : enrollmentList.getEnrollmentList()) {
            cmbCourse.addItem(enrollment.getCourse());
        }
    }
}
