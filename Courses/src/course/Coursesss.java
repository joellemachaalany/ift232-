/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package course;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 *
 */
import java.sql.*;

public class Coursesss extends javax.swing.JDialog {

    /**
     * Creates new form Coursesss
     */
    
     private Connection con;
    private int crsid;
    
    public Coursesss(java.awt.Frame parent, boolean modal, Connection con ,int crsid) {
        super(parent, modal);
        initComponents();
        this.setTitle("Courses");
        this.setLocationRelativeTo(this);
        this.con = con;
        this.crsid = crsid;
        populate();
    }

    
    private void populate() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs
                    = stmt.executeQuery("Select * "
                            + "From tblcourses Where crs_ID =" + crsid);
            if (rs.next()) {
                txtCode.setText(rs.getString("crs_Code"));
                txtName.setText(rs.getString("crs_Name"));
                txtDescription.setText(rs.getString("crs_Description"));
                cbxType.setSelectedItem(rs.getString("crs_type"));
                cbxNOC.setSelectedItem(rs.getString("Number_Of_Credits"));
                if(rs.getString("Lab").equals("Yes")){
                    chkLab.setSelected(true);
                }else{
                    chkLab.setSelected(false);
                }
                
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgLab = new javax.swing.ButtonGroup();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        cbxType = new javax.swing.JComboBox();
        lblNOC = new javax.swing.JLabel();
        cbxNOC = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        chkLab = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCode.setText("Code: ");

        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeKeyTyped(evt);
            }
        });

        jLabel1.setText("Name:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel2.setText("Description:");

        lblType.setText("Type: ");

        cbxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Major", "Elective" }));

        lblNOC.setText("Number Of Credits: ");

        cbxNOC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "2", "1" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        chkLab.setText("Lab");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave))
                    .addComponent(txtDescription)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkLab)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(lblNOC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxNOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCode)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNOC)
                    .addComponent(cbxNOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCodeKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtCode.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Enter a Code", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Enter a Name", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            String code = txtCode.getText();
            String name = txtName.getText();
            String description = txtDescription.getText();
            String type = cbxType.getSelectedItem().toString();
            int numberOfCredits
                    = Integer.parseInt(
                            cbxNOC.
                            getSelectedItem().toString());
            String lab;
            if (chkLab.isSelected()) {
                lab = "Yes";
            } else {
                lab = "No";
            }
            try {
                PreparedStatement pstmt;
                if(crsid==0){
                       pstmt = con.prepareStatement("Insert Into "
                                + "tblcourses (crs_Code,"
                                + "crs_Name,  "
                                + "std_academicYear, std_lebanese, "
                                + "std_age, std_email, std_address) "
                                + "Values ( '" + code + "', "
                                + "'" + name + "', '" + description + "', "
                                + type + ", '" + numberOfCredits + "', "
                                + lab + ", '");
                }else{
                    pstmt = con.prepareStatement("Update tbl_students "
                            + "Set crs_Code = '" + code + "', "
                            + "crs_Name = '" + name + "', "
                            + "crs_description = '" + description + "', "
                            + "crs_Type = " + type + ", "
                            + "Number_Of_Credits = '" + numberOfCredits + "', "
                            + "Lab = " + lab ); 
                             }
                pstmt.execute();
                this.dispose();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNameKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Coursesss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coursesss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coursesss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coursesss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Coursesss dialog = new Coursesss(new javax.swing.JFrame(), true, null,0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgLab;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cbxNOC;
    private javax.swing.JComboBox cbxType;
    private javax.swing.JCheckBox chkLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblNOC;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
