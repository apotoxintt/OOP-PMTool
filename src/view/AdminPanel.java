/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProjectsController;
import controller.UsersController;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import services.Application;

/**
 *
 * @author tanmaykuruvilla
 */
public class AdminPanel extends javax.swing.JPanel {

    UsersController usersController;
    ProjectsController projectsController;
    private JTable jtable,jtable1,jtable2;
    /**
     * Creates new form AdminView
     */
    public AdminPanel() {
        initComponents();
        usersController = new UsersController(this);
        projectsController = new ProjectsController(this);
        addExistingUsersTable();
        addExistingTeamTable();
        populateCombUserList();
        txtPMid.setVisible(false);
    }
    
    //// added method
    public void populateCombUserList()
    {
        System.out.println("In Populate Cb box");
        combUserList.removeAllItems();
        String[] users =  usersController.getUserList();
        for(String s: users)
        {
            combUserList.addItem(s);
        }
        
        combCategory.addItem("COMP SCIENCE");
        combCategory.addItem("ROBOTICS");
        combCategory.addItem("MECHANICAL");
        combCategory.addItem("SUSTAINABLE");
    }
    
    ////added method
    public void addExistingUsersTable()
    {
        // add the data and column names to a JTable
        jtable = new JTable(usersController.getTableModel());
        // add a ListSelectionListener to the table
        jtable.getSelectionModel().addListSelectionListener(usersController);
        //jtable.getModel().addTableModelListener(userInfoTableController);
        
        jtable.getModel().addTableModelListener(usersController);
        
        jtable1 = new JTable(usersController.getTableModel());
        // add a ListSelectionListener to the table
        jtable1.getSelectionModel().addListSelectionListener(usersController);
        //jtable.getModel().addTableModelListener(userInfoTableController);
        
        jtable1.getModel().addTableModelListener(usersController);

        // add the table to a scrollpane
        JScrollPane tableScrollPane = new JScrollPane(jtable);
        tableScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        JScrollPane tableScrollPane1 = new JScrollPane(jtable1);
        tableScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tableScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        
        //jPanel1.add(tableScrollPane);
        panelExisting.setLayout(new BorderLayout());
        panelExisting.add(tableScrollPane, BorderLayout.CENTER);
        
        //panelExistingusers.setLayout(new BorderLayout());
        //panelExistingusers.add(tableScrollPane1, BorderLayout.CENTER);
        
        
    }
    
    public void addExistingTeamTable()
    {
        // add the data and column names to a JTable
        jtable2 = new JTable(projectsController.getTableModel());
        // add a ListSelectionListener to the table
        jtable2.getSelectionModel().addListSelectionListener(projectsController);
        //jtable.getModel().addTableModelListener(userInfoTableController);
        
        jtable2.getModel().addTableModelListener(projectsController);
        
       

        // add the table to a scrollpane
        JScrollPane tableScrollPane = new JScrollPane(jtable2);
        tableScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        

        
        //jPanel1.add(tableScrollPane);
        panelDisplayTeam.setLayout(new BorderLayout());
        panelDisplayTeam.add(tableScrollPane, BorderLayout.CENTER);
      
        
        
    }
    
    
    //// added method
    public void updateTable() {
    	jtable.setModel(usersController.getTableModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    /////added all setter  methods
    
    public void setF_NameTextField(String val)
    {
        txtFirstName.setText(val);
    }
    public void setL_nameTextField(String val)
    {
        txtLastName.setText(val);
    }
    public void setEmailTextField(String val)
    {
        txtEmail.setText(val);
    }
    public void setPasswordTextField(String val)
    {
        txtPassword.setText(val);
    }
    public void setTeamNameTextField(String val)
    {
        txtTeamName.setText(val);
    }
    public void setPMidTextField(String val)
    {
        txtPMid.setText(val);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        panelExisting = new javax.swing.JPanel();
        panelNew = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        butAdd = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        butDelete = new javax.swing.JButton();
        butClear = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        chkPassVisible = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelNewTeam = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTeamName = new javax.swing.JTextField();
        txtPMid = new javax.swing.JTextField();
        butAddTeam = new javax.swing.JButton();
        butDeleteTeam = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        combUserList = new javax.swing.JComboBox();
        combCategory = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        panelDisplayTeam = new javax.swing.JPanel();

        setSize(new java.awt.Dimension(1024, 750));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        panelExisting.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existing Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 13))); // NOI18N

        javax.swing.GroupLayout panelExistingLayout = new javax.swing.GroupLayout(panelExisting);
        panelExisting.setLayout(panelExistingLayout);
        panelExistingLayout.setHorizontalGroup(
            panelExistingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        panelExistingLayout.setVerticalGroup(
            panelExistingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelNew.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 13))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("SCU Email:");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Password:");

        butAdd.setText("Add");
        butAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddActionPerformed(evt);
            }
        });

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        butDelete.setText("Delete");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        butClear.setText("Clear");

        chkPassVisible.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        chkPassVisible.setText("show password");
        chkPassVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPassVisibleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNewLayout = new javax.swing.GroupLayout(panelNew);
        panelNew.setLayout(panelNewLayout);
        panelNewLayout.setHorizontalGroup(
            panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewLayout.createSequentialGroup()
                .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNewLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNewLayout.createSequentialGroup()
                                .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtLastName)
                                    .addComponent(txtEmail)
                                    .addComponent(txtPassword)
                                    .addComponent(chkPassVisible, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))))
                    .addGroup(panelNewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(butClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panelNewLayout.setVerticalGroup(
            panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPassVisible)
                .addGap(31, 31, 31)
                .addComponent(butAdd)
                .addGap(9, 9, 9)
                .addComponent(butDelete)
                .addGap(18, 18, 18)
                .addComponent(butClear)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelExisting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(panelExisting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Manage Users", jPanel4);

        panelNewTeam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Teams", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 13))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Team Name:");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("Project Category:");

        txtTeamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamNameActionPerformed(evt);
            }
        });

        txtPMid.setEditable(false);
        txtPMid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPMidActionPerformed(evt);
            }
        });

        butAddTeam.setText("Add Team");
        butAddTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddTeamActionPerformed(evt);
            }
        });

        butDeleteTeam.setText("Delete Team");
        butDeleteTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteTeamActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");

        combUserList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combUserListActionPerformed(evt);
            }
        });

        combCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combCategoryActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("Project Manager:");

        javax.swing.GroupLayout panelNewTeamLayout = new javax.swing.GroupLayout(panelNewTeam);
        panelNewTeam.setLayout(panelNewTeamLayout);
        panelNewTeamLayout.setHorizontalGroup(
            panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewTeamLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butAddTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butDeleteTeam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelNewTeamLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNewTeamLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelNewTeamLayout.createSequentialGroup()
                                .addGroup(panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelNewTeamLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTeamName)
                            .addComponent(txtPMid)
                            .addComponent(combCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, 223, Short.MAX_VALUE)
                            .addComponent(combUserList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(94, 94, 94))
        );
        panelNewTeamLayout.setVerticalGroup(
            panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewTeamLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combUserList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNewTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(txtPMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(butAddTeam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butDeleteTeam)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNewTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNewTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelDisplayTeam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existing Teams", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 13))); // NOI18N

        javax.swing.GroupLayout panelDisplayTeamLayout = new javax.swing.GroupLayout(panelDisplayTeam);
        panelDisplayTeam.setLayout(panelDisplayTeamLayout);
        panelDisplayTeamLayout.setHorizontalGroup(
            panelDisplayTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        panelDisplayTeamLayout.setVerticalGroup(
            panelDisplayTeamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelDisplayTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(panelDisplayTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manage Teams", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddActionPerformed
        // TODO add your handling code here:
        System.out.println("In AddactionPerformed");
        String[] vals = new String[4];
        vals[0] = txtFirstName.getText();
        vals[1] = txtLastName.getText();
        vals[2] = txtPassword.getText();
        vals[3] = txtEmail.getText();

        usersController.addRow(vals);
    }//GEN-LAST:event_butAddActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        // TODO add your handling code here:
        System.out.println("gui delete pressed");
        usersController.deleteRow(txtEmail.getText());
    }//GEN-LAST:event_butDeleteActionPerformed

    private void chkPassVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPassVisibleActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==chkPassVisible){
            if(chkPassVisible.isSelected()) {
                txtPassword.setEchoChar((char)0);
            }
            else {
                txtPassword.setEchoChar('\u25cf');
                System.out.println(txtPassword.getText());
            }
        }

    }//GEN-LAST:event_chkPassVisibleActionPerformed

    private void txtTeamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamNameActionPerformed

    private void txtPMidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPMidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPMidActionPerformed

    private void butAddTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddTeamActionPerformed
        // TODO add your handling code here:
        System.out.println("Add team button pressed" + combCategory.getSelectedItem());

        String[] vals = new String[3];
        vals[0] = txtTeamName.getText();
        //returns the email stored in txt box
        vals[1] = txtPMid.getText();
        vals[2] = (combCategory.getSelectedItem()).toString();

        projectsController.addRow(vals);

    }//GEN-LAST:event_butAddTeamActionPerformed

    private void butDeleteTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteTeamActionPerformed
        // TODO add your handling code here:
        System.out.println("In button delete Teame row");
        projectsController.deleteRow(txtPMid.getText());
    }//GEN-LAST:event_butDeleteTeamActionPerformed

    private void combUserListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combUserListActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox)evt.getSource();
        String email = (String)cb.getSelectedItem();
        System.out.println(email);
        txtPMid.setText(email);

    }//GEN-LAST:event_combUserListActionPerformed

    private void combCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAdd;
    private javax.swing.JButton butAddTeam;
    private javax.swing.JButton butClear;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butDeleteTeam;
    private javax.swing.JCheckBox chkPassVisible;
    private javax.swing.JComboBox combCategory;
    private javax.swing.JComboBox combUserList;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelDisplayTeam;
    private javax.swing.JPanel panelExisting;
    private javax.swing.JPanel panelNew;
    private javax.swing.JPanel panelNewTeam;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPMid;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTeamName;
    // End of variables declaration//GEN-END:variables
}
