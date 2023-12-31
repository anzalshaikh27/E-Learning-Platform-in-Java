/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.Professor;

import Business.Student.Enrollment;
import Business.Student.EnrollmentHistory;
import Business.Student.StudentLoginHistory;
import Business.Student.studentLogin;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author anzal
 */
public class AnnouncementPostingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnnouncementPostingJPanel
     */
    

    javax.swing.JPanel workArea;
    StudentLoginHistory history;
    private studentLogin loggedInUser;
    private ProfessorLogin loggedinUser;
    EnrollmentHistory enrollmentList;
    CourseHistory c_history;
    ProfessorLoginHistory history1;
    private Enrollment enroll;
   private Course cos;
    
   public  AnnouncementPostingJPanel(JPanel workArea, ProfessorLoginHistory history1 , ProfessorLogin loggedinUser,CourseHistory c_history,Course cos,StudentLoginHistory history,studentLogin loggedInUser,EnrollmentHistory enrollmentList,Enrollment enroll) {
        
   
       initComponents();
       this.workArea = workArea;
        this.loggedInUser = loggedInUser;
        this.history = history;
        this.enrollmentList = enrollmentList;
        this.c_history = c_history;
        this.loggedinUser = loggedinUser;
        this.history1 = history1;
        this.enroll = enroll;
        this.cos = cos;
       customizeComponents();
   
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblitle = new javax.swing.JLabel();
        lblProvideAnnouncement = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnnouncements = new javax.swing.JTextArea();
        btnPostAnnouncements = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lblitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblitle.setText("ADD ANNOUNCEMENTS");

        lblProvideAnnouncement.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProvideAnnouncement.setText("Provide Announcements:");

        txtAnnouncements.setColumns(20);
        txtAnnouncements.setRows(5);
        jScrollPane1.setViewportView(txtAnnouncements);

        btnPostAnnouncements.setText("Post Announcements");
        btnPostAnnouncements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostAnnouncementsActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/loudspeaker.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProvideAnnouncement)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(btnPostAnnouncements)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProvideAnnouncement)
                            .addComponent(btnBack))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGap(53, 53, 53)
                .addComponent(btnPostAnnouncements, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostAnnouncementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostAnnouncementsActionPerformed
        // TODO add your handling code here:
        
        String announcement = txtAnnouncements.getText();

        ProfessorLogin vs = history1.addnewprofessors();
        vs.setAnnouncement(announcement);
        

        JOptionPane.showMessageDialog(this,"Announcement Posted");

        txtAnnouncements.setText("");
        
    }//GEN-LAST:event_btnPostAnnouncementsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        ViewProfessorPortalJPanel panel = new ViewProfessorPortalJPanel(workArea,history1,loggedinUser,c_history,cos,history,loggedInUser,enrollmentList,enroll);
        workArea.add("ViewProfessorPortalJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void customizeComponents() {
        // Set background color
        this.setBackground(new Color(44, 62, 80));

        // Set font and text color for labels and buttons
        Font labelFont = new Font("Tahoma", Font.BOLD, 12);
        Color textColor = new Color(236, 240, 241);
        Color buttonBackground = new Color(52, 152, 219);
        Color buttonTextColor = new Color(255, 255, 255);
        Border buttonBorder = BorderFactory.createEmptyBorder(10, 25, 10, 25);

        lblitle.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblitle.setForeground(textColor);

        lblProvideAnnouncement.setFont(labelFont);
        lblProvideAnnouncement.setForeground(textColor);

        txtAnnouncements.setBackground(new Color(52, 73, 94));
        txtAnnouncements.setForeground(textColor);
        txtAnnouncements.setFont(new Font("Tahoma", Font.PLAIN, 12));
        jScrollPane1.getViewport().setBackground(new Color(44, 62, 80));

        btnPostAnnouncements.setBackground(buttonBackground);
        btnPostAnnouncements.setForeground(buttonTextColor);
        btnPostAnnouncements.setBorder(buttonBorder);

        btnBack.setBackground(buttonBackground);
        btnBack.setForeground(buttonTextColor);
        btnBack.setBorder(buttonBorder);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPostAnnouncements;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProvideAnnouncement;
    private javax.swing.JLabel lblitle;
    private javax.swing.JTextArea txtAnnouncements;
    // End of variables declaration//GEN-END:variables
}
