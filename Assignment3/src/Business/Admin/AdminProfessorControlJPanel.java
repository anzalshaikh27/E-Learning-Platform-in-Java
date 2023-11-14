/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.Admin;

import Business.Professor.ProfessorLogin;
import Business.Professor.ProfessorLoginHistory;
import Business.Student.EnrollmentHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Student.StudentLoginHistory;
import Business.Student.ViewStudentPortalJPanel;
import Business.Student.studentLogin;
import java.awt.CardLayout;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import Business.Admin.TicketManager;
import Business.Professor.CourseHistory;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;

/**
 *
 * @author sanal
 */
public class AdminProfessorControlJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminUserAccounts
     */
    
    javax.swing.JPanel workArea;
    studentLogin loggedInUser;
    ProfessorLogin loggedInProf;
    StudentLoginHistory history;
    ProfessorLoginHistory history1;
    EnrollmentHistory enrollmentList;
    TicketManager ticketManager;
    CourseHistory chistory;
    
            
    public AdminProfessorControlJPanel(javax.swing.JPanel workArea, studentLogin loggedInUser, StudentLoginHistory history, ProfessorLoginHistory history1, ProfessorLogin loggedInProf, EnrollmentHistory enrollmentList, TicketManager ticketManager,CourseHistory chistory) {
        
        initComponents();
        this.workArea = workArea;
        this.history1 = history1;
        this.loggedInProf = loggedInProf;
        this.history = history;
        this.loggedInUser = loggedInUser;
        this.enrollmentList = enrollmentList;
        this.ticketManager = ticketManager;
        this.chistory = chistory;
        txtPassword.setEditable(false);
        populateTable();
        customizeComponents();
        
        /*
        // Set background color
        this.setBackground(new Color(44, 62, 80));

        // Set font and text color for labels
        lblUserinfo.setFont(new Font("Tahoma", Font.BOLD, 36));
        lblUserinfo.setForeground(new Color(236, 240, 241));
        lblFname.setForeground(new Color(236, 240, 241));
        lblLname.setForeground(new Color(236, 240, 241));
        lblEmail.setForeground(new Color(236, 240, 241));
        lblUsername.setForeground(new Color(236, 240, 241));
        lblPassword.setForeground(new Color(236, 240, 241));

        // Set text field and password field styles
        txtFname.setBackground(new Color(52, 73, 94));
        txtFname.setForeground(new Color(236, 240, 241));
        txtFname.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        txtLname.setBackground(new Color(52, 73, 94));
        txtLname.setForeground(new Color(236, 240, 241));
        txtLname.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        txtEmail.setBackground(new Color(52, 73, 94));
        txtEmail.setForeground(new Color(236, 240, 241));
        txtEmail.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        txtUsername.setBackground(new Color(52, 73, 94));
        txtUsername.setForeground(new Color(236, 240, 241));
        txtUsername.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        txtPassword.setBackground(new Color(52, 73, 94));
        txtPassword.setForeground(new Color(236, 240, 241));
        txtPassword.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        txtSearchUsername.setBackground(new Color(52, 73, 94));
        txtSearchUsername.setForeground(new Color(236, 240, 241));
        txtSearchUsername.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));

        // Set button style
        btntblDelete.setBackground(new Color(52, 152, 219));
        btntblDelete.setForeground(new Color(255, 255, 255));
        btntblDelete.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        btntblView.setBackground(new Color(52, 152, 219));
        btntblView.setForeground(new Color(255, 255, 255));
        btntblView.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        btntblSearch.setBackground(new Color(52, 152, 219));
        btntblSearch.setForeground(new Color(255, 255, 255));
        btntblSearch.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        btnUpdateUserAccounts.setBackground(new Color(52, 152, 219));
        btnUpdateUserAccounts.setForeground(new Color(255, 255, 255));
        btnUpdateUserAccounts.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        btnBack.setBackground(new Color(52, 152, 219));
        btnBack.setForeground(new Color(255, 255, 255));
        btnBack.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

        // Set table style
        tblUsers.setBackground(new Color(52, 73, 94));
        tblUsers.setForeground(new Color(236, 240, 241));
        tblUsers.setGridColor(new Color(52, 73, 94));
        tblUsers.setSelectionBackground(new Color(41, 128, 185));
        tblUsers.setSelectionForeground(new Color(236, 240, 241));
        jScrollPane1.getViewport().setBackground(new Color(52, 73, 94));
        
        // Setting the header style
        tblUsers.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblUsers.getTableHeader().setBackground(new Color(44, 62, 80));
        tblUsers.getTableHeader().setForeground(new Color(44, 62, 80));

        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btntblDelete = new javax.swing.JButton();
        btntblView = new javax.swing.JButton();
        lblUserinfo = new javax.swing.JLabel();
        txtSearchUsername = new javax.swing.JTextField();
        btntblSearch = new javax.swing.JButton();
        btnUpdateUserAccounts = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        lblFname = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblUsers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Email", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        btntblDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btntblDelete.setText("Delete");
        btntblDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntblDeleteActionPerformed(evt);
            }
        });

        btntblView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btntblView.setText("View");
        btntblView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntblViewActionPerformed(evt);
            }
        });

        lblUserinfo.setBackground(new java.awt.Color(204, 204, 255));
        lblUserinfo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblUserinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserinfo.setText("MANAGE PROFESSORS");

        txtSearchUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btntblSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btntblSearch.setText("Search By Username");
        btntblSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntblSearchActionPerformed(evt);
            }
        });

        btnUpdateUserAccounts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateUserAccounts.setText("Update");
        btnUpdateUserAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserAccountsActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setText("Password : ");

        lblLname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLname.setText("Last Name :");
        lblLname.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsername.setText("Username : ");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email : ");

        lblFname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFname.setText("First Name :");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/class.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtSearchUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntblSearch)
                        .addGap(269, 269, 269)
                        .addComponent(btntblView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntblDelete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(250, 250, 250)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(lblLname, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblFname, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(12, 12, 12)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtFname)
                                                    .addComponent(txtLname)
                                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnUpdateUserAccounts)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtUsername)
                                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGap(0, 84, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblUserinfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntblDelete)
                    .addComponent(btntblView)
                    .addComponent(btntblSearch)
                    .addComponent(txtSearchUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFname)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLname)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateUserAccounts))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btntblDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntblDeleteActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblUsers.getSelectedRow();

        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();

        ProfessorLogin selectedUser = (ProfessorLogin) model.getValueAt(selectedRowIndex, 0);
        history1.deleteStudent(selectedUser);

        populateTable();

        JOptionPane.showMessageDialog(this, "Student Account Deleted.");

    }//GEN-LAST:event_btntblDeleteActionPerformed

    private void btntblViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntblViewActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblUsers.getSelectedRow();

        if (selectedRowIndex<0) {

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        //studentLogin selectedUser = (studentLogin) model.getValueAt(selectedRowIndex, 0);

        txtFname.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtLname.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtEmail.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtUsername.setText(model.getValueAt(selectedRowIndex, 3).toString());
        String password = model.getValueAt(selectedRowIndex, 4).toString();
        String hashedPassword = hashPassword(password);
        txtPassword.setText(hashedPassword);
    }//GEN-LAST:event_btntblViewActionPerformed

    private void btntblSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntblSearchActionPerformed
        // TODO add your handling code here:

        String searchUsername = txtSearchUsername.getText().trim();
        populateTable(searchUsername);

    }//GEN-LAST:event_btntblSearchActionPerformed

    private void btnUpdateUserAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserAccountsActionPerformed
        // TODO add your handling code here:
        
        String firstName = txtFname.getText().trim();
        String lastName = txtLname.getText().trim();
        String email = txtEmail.getText().trim();
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

        int selectedRowIndex = tblUsers.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a user to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();

            ProfessorLogin selectedProf = (ProfessorLogin) model.getValueAt(selectedRowIndex, 0);
            selectedProf.setFirstName(firstName);
            selectedProf.setLastName(lastName);
            selectedProf.setEmail(email);
            selectedProf.setUsername(username);

        populateTable();
        JOptionPane.showMessageDialog(this, "Student Updated Successfully.");
        
    }//GEN-LAST:event_btnUpdateUserAccountsActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageAdminJPanel panel = new ManageAdminJPanel(workArea,history,loggedInUser,loggedInProf,history1,enrollmentList,ticketManager,chistory);
        workArea.add("ManageAdminJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        model.setRowCount(0);
        
        
        for (ProfessorLogin p : history1.getHistory()){
            Object[] row = new Object[5];
            row[0] = p;
            row[1] = p.getLastName();
            row[2] = p.getEmail();
            row[3] = p.getUsername();
            row[4] = hashPassword(p.getPassword());
            
            model.addRow(row);
        }
        
    }
    
    private void populateTable(String filterUsername) {
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        model.setRowCount(0);

        for (ProfessorLogin p : history1.getHistory()) {
            if (!filterUsername.isEmpty() && !p.getUsername().toLowerCase().contains(filterUsername.toLowerCase())) {
                continue;
            }
            Object[] row = new Object[10];
            row[0] = p;
            row[1] = p.getLastName();
            row[2] = p.getEmail();
            row[3] = p.getUsername();
            row[4] = hashPassword(p.getPassword());

            model.addRow(row);
        }
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException | java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private void customizeComponents() {
    // Set background color
    this.setBackground(new Color(44, 62, 80));

    // Set font and text color for labels
    lblUserinfo.setFont(new Font("Tahoma", Font.BOLD, 28));
    lblUserinfo.setForeground(new Color(236, 240, 241));
    lblFname.setForeground(new Color(236, 240, 241));
    lblLname.setForeground(new Color(236, 240, 241));
    lblEmail.setForeground(new Color(236, 240, 241));
    lblUsername.setForeground(new Color(236, 240, 241));
    lblPassword.setForeground(new Color(236, 240, 241));

    // Set text field and password field styles
    txtFname.setBackground(new Color(52, 73, 94));
    txtFname.setForeground(new Color(236, 240, 241));
    txtFname.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    txtLname.setBackground(new Color(52, 73, 94));
    txtLname.setForeground(new Color(236, 240, 241));
    txtLname.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    txtEmail.setBackground(new Color(52, 73, 94));
    txtEmail.setForeground(new Color(236, 240, 241));
    txtEmail.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    txtUsername.setBackground(new Color(52, 73, 94));
    txtUsername.setForeground(new Color(236, 240, 241));
    txtUsername.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    txtPassword.setBackground(new Color(52, 73, 94));
    txtPassword.setForeground(new Color(236, 240, 241));
    txtPassword.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    txtSearchUsername.setBackground(new Color(52, 73, 94));
    txtSearchUsername.setForeground(new Color(236, 240, 241));
    txtSearchUsername.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));

    // Set button style
    btntblDelete.setBackground(new Color(52, 152, 219));
    btntblDelete.setForeground(new Color(255, 255, 255));
    btntblDelete.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
    btntblView.setBackground(new Color(52, 152, 219));
    btntblView.setForeground(new Color(255, 255, 255));
    btntblView.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
    btntblSearch.setBackground(new Color(52, 152, 219));
    btntblSearch.setForeground(new Color(255, 255, 255));
    btntblSearch.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
    btnUpdateUserAccounts.setBackground(new Color(52, 152, 219));
    btnUpdateUserAccounts.setForeground(new Color(255, 255, 255));
    btnUpdateUserAccounts.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
    btnBack.setBackground(new Color(52, 152, 219));
    btnBack.setForeground(new Color(255, 255, 255));
    btnBack.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

    // Set table styles
    tblUsers.setBackground(new Color(52, 73, 94));
    tblUsers.setForeground(new Color(236, 240, 241));
    tblUsers.getTableHeader().setBackground(new Color(52, 73, 94));
    tblUsers.getTableHeader().setForeground(new Color(44, 62, 80));
    tblUsers.setFont(new Font("Tahoma", Font.BOLD, 14));
    jScrollPane1.getViewport().setBackground(new Color(52, 73, 94));
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateUserAccounts;
    private javax.swing.JButton btntblDelete;
    private javax.swing.JButton btntblSearch;
    private javax.swing.JButton btntblView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserinfo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearchUsername;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
