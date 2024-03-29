/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.Encounter;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author reeteshkesarwani
 */
public class ViewPatient extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatient
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    public ViewPatient(PersonDirectory personDirectory,PatientDirectory patientDirectory) {
        initComponents();
       this.patientDirectory= patientDirectory;
       this.personDirectory=personDirectory;
        populateTable2();
        txtTemp.setEnabled(false);
         txtBloodPressure.setEnabled(false); 
         txtPulseRate.setEnabled(false);
         txtDiagnosis.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePatient = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        asknfma = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtPersonId = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Community = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtTemp = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtPulseRate = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        notheing1 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setForeground(new java.awt.Color(51, 51, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("Exisiting Patients");

        tablePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Date of Birth", "Person ID", "Address", "City", "State", "Zip", "Community", "Patient ID"
            }
        ));
        jScrollPane4.setViewportView(tablePatient);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("Name");

        asknfma.setBackground(new java.awt.Color(204, 204, 204));
        asknfma.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        asknfma.setForeground(new java.awt.Color(51, 51, 0));
        asknfma.setText("Gender");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("Date of Birth");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("PersonId");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 0));
        jLabel6.setText("Address");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 0));
        jLabel7.setText("City");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 0));
        jLabel8.setText("State");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 0));
        jLabel9.setText("Zip");

        Community.setBackground(new java.awt.Color(204, 204, 204));
        Community.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        Community.setForeground(new java.awt.Color(51, 51, 0));
        Community.setText("Community");

        txtPulseRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseRateActionPerformed(evt);
            }
        });

        txtDiagnosis.setForeground(new java.awt.Color(51, 51, 0));
        txtDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnosisActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 0));
        jLabel12.setText("Temprature");

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setText("BloodPressure");

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 0));
        jLabel14.setText("Pulse Rate");

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 0));
        jLabel15.setText("Diagnosis");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 0));
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(51, 51, 0));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        notheing1.setBackground(new java.awt.Color(204, 204, 204));
        notheing1.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        notheing1.setForeground(new java.awt.Color(51, 51, 0));
        notheing1.setText("patientId");

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 0));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(asknfma)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addComponent(Community)
                            .addComponent(notheing1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(278, 278, 278))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 60, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtDate, txtGender, txtName, txtPersonId});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCity, txtCommunity, txtPatientId, txtState, txtZip});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asknfma)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Community)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notheing1)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton3)
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosisActionPerformed

    private void txtPulseRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseRateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row_selected = tablePatient.getSelectedRow();

        if (row_selected < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to update details.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        Object[] selected_row = new Object[10];
        for (int i = 0; i < model.getColumnCount(); i++) {
            selected_row[i] = model.getValueAt(row_selected, i);

        }
        
        selected_row[0] = txtName.getText();
        selected_row[1] = txtGender.getText();
        selected_row[2] = txtDate.getText();
        selected_row[3] = Integer.valueOf(txtPersonId.getText());
        selected_row[4] = txtAddress.getText();
        selected_row[5] = txtCity.getText();
        selected_row[6] = txtState.getText();
        selected_row[7] = Integer.valueOf(txtZip.getText());
        selected_row[8] = txtCommunity.getText();
        /*selected_row[9] = Integer.valueOf(txtTemp.getText());
        selected_row[10] = Integer.valueOf(txtBloodPressure.getText());
        selected_row[11] = Integer.valueOf(txtPulseRate.getText());
        selected_row[12] = txtDiagnosis.getText();*/
        selected_row[9] = Integer.valueOf(txtPatientId.getText());
        
        Date resultdate = null;
        City city = new City(selected_row[5].toString());
        String community = selected_row[8].toString();
        VitalSigns vs = new VitalSigns(0,0,0);
        Encounter encounter = new Encounter(vs,resultdate,txtDiagnosis.getText());
        
        House house = new House(selected_row[4].toString(),city,selected_row[6].toString(),Integer.parseInt(selected_row[7].toString()), community);
        patientDirectory.deletePatient((txtPatientId.getText()).toString());
        patientDirectory.addPatient(selected_row[0].toString(),house,
                selected_row[1].toString(),
                selected_row[2].toString(),
                Integer.parseInt(selected_row[3].toString()),encounter,Integer.parseInt(selected_row[9].toString()));
        JOptionPane.showMessageDialog(this, "Employee Updated for selected record successfully");
        
        populateTable2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row_selected = tablePatient.getSelectedRow();

        if (row_selected < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to view details.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        Patient patient = patientDirectory.getPatient(model.getValueAt(row_selected, 0).toString());
        House house = patient.getHouse();
        String comm = house.getCommunity();
        City city = house.getCity();

        txtName.setText(patient.getName());
        txtGender.setText(patient.getGender());
        txtDate.setText(patient.getDob());
        txtPersonId.setText(String.valueOf(patient.getId()));
        txtAddress.setText(house.getAddress());
        txtCity.setText(city.getCityName());
        txtState.setText(house.getState());
        txtZip.setText(String.valueOf(house.getPin()));
        txtCommunity.setText(comm);
        txtPatientId.setText(String.valueOf(patient.getPatientId()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row_selected = tablePatient.getSelectedRow();

        if (row_selected < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        patientDirectory.deletePatient(model.getValueAt(row_selected, 9).toString());
        JOptionPane.showMessageDialog(this, "Patient deleted successfully");
        
        populateTable2();
        
        txtName.setText("");
        txtGender.setText("");
        txtDate.setText("");
        txtPersonId.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtCommunity.setText("");
        txtPatientId.setText("");
        txtTemp.setText("");
        txtTemp.setText("");
        txtBloodPressure.setText("");
        txtPulseRate.setText("");
        txtDiagnosis.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Community;
    private javax.swing.JLabel asknfma;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel notheing1;
    private javax.swing.JTable tablePatient;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPersonId;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTemp;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

  
   
       private void populateTable2() {
        
        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        model.setRowCount(0);
        
        for(Patient person : patientDirectory.getPatients()){
            
            Object[] data = new Object[10];
            data[0] = person.getName();
            data[1] = person.getGender();
            data[2] = person.getDob();
            data[3] = person.getId();
            data[4] = person.getHouse().getAddress();
            data[5] = person.getHouse().getCity().getCityName();
            data[6] = person.getHouse().getState();
            data[7] = person.getHouse().getPin();
            data[8] = person.getHouse().getCommunity();
            data[9] = person.getPatientId();
            
            model.addRow(data);
        }
    }
}
