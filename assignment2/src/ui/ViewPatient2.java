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
import model.VitalSigns;

/**
 *
 * @author reeteshkesarwani
 */
public class ViewPatient2 extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatient2
     */
    PatientDirectory patientDirectory;
    public ViewPatient2() {
        initComponents();
        this.patientDirectory=patientDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        ViewPersonn4 = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtPersonId = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        buttonAdd4 = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtPulseRate = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePatient = new javax.swing.JTable();

        jPanel9.setForeground(new java.awt.Color(51, 51, 0));

        ViewPersonn4.setBackground(new java.awt.Color(204, 204, 204));
        ViewPersonn4.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        ViewPersonn4.setForeground(new java.awt.Color(51, 51, 0));
        ViewPersonn4.setText("View");
        ViewPersonn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPersonn4ActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 0));
        jLabel40.setText("Address:");

        jLabel41.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 0));
        jLabel41.setText("Name:");

        jLabel42.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 0));
        jLabel42.setText("City:");

        jLabel43.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 0));
        jLabel43.setText("Gender:");

        jLabel44.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 0));
        jLabel44.setText("State:");

        txtPersonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIdActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 0));
        jLabel45.setText("Zip:");

        jLabel46.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 0));
        jLabel46.setText("Date of Birth:");

        buttonAdd4.setBackground(new java.awt.Color(204, 204, 204));
        buttonAdd4.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        buttonAdd4.setForeground(new java.awt.Color(51, 51, 0));
        buttonAdd4.setText("Update");
        buttonAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdd4ActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 0));
        jLabel47.setText("Community:");

        jLabel48.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 0));
        jLabel48.setText("Perosn ID:");

        jLabel49.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel49.setText("Existing Patient");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jLabel50.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 0));
        jLabel50.setText("Temperature");

        jLabel51.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 0));
        jLabel51.setText("Blood Pressure");

        jLabel52.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 0));
        jLabel52.setText("Pulse Rate");

        jLabel53.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 0));
        jLabel53.setText("Diagnosis");

        jLabel54.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 0));
        jLabel54.setText("Patient ID");

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(272, 272, 272))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel46))
                                        .addGap(6, 6, 6))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(23, 23, 23)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonAdd4))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addComponent(jLabel53))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addComponent(jLabel50)
                                                        .addGap(30, 30, 30)
                                                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addComponent(jLabel51)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(169, 169, 169)
                                                .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addGap(192, 192, 192))))
                            .addComponent(jLabel48)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ViewPersonn4))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewPersonn4))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52)
                        .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(buttonAdd4)
                        .addGap(667, 667, 667))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewPersonn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPersonn4ActionPerformed
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
        Encounter en = patient.getEncounter();
        VitalSigns vs = en.getVitalSign();

        txtName.setText(patient.getName());
        txtGender.setText(patient.getGender());
        txtDate.setText(patient.getDob());
        txtPersonId.setText(String.valueOf(patient.getId()));
        txtAddress.setText(house.getAddress());
        txtCity.setText(city.getCityName());
        txtState.setText(house.getState());
        txtZip.setText(String.valueOf(house.getPin()));
        txtCommunity.setText(comm);

        if(vs.getTemp() == 0){
            txtTemp.setText("");
        }
        else{
            txtTemp.setText(String.valueOf(vs.getTemp()));
        }
        if(vs.getBloodPressure() == 0){
            txtBloodPressure.setText("");
        }
        else{
            txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
        }
        if(vs.getPulseRate() == 0){
            txtPulseRate.setText("");
        }
        else{
            txtPulseRate.setText(String.valueOf(vs.getPulseRate()));
        }
        txtDiagnosis.setText(en.getDiagnosis());
        txtPatientId.setText(String.valueOf(patient.getPatientId()));

    }//GEN-LAST:event_ViewPersonn4ActionPerformed

    private void txtPersonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIdActionPerformed

    private void buttonAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd4ActionPerformed
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

        Date resultdate = new Date(System.currentTimeMillis());
        City city = new City(selected_row[5].toString());
        String community = selected_row[8].toString();
        VitalSigns vs = new VitalSigns(Integer.parseInt(selected_row[9].toString()),Integer.parseInt(selected_row[10].toString()),Integer.parseInt(selected_row[11].toString()));
        Encounter encounter = new Encounter(vs,resultdate,selected_row[12].toString());

        House house = new House(selected_row[4].toString(),city,selected_row[6].toString(),Integer.parseInt(selected_row[7].toString()), community);

        patientDirectory.addPatient(selected_row[0].toString(),house,
            selected_row[1].toString(),
            selected_row[2].toString(),
            Integer.parseInt(selected_row[3].toString()),encounter,Integer.parseInt(selected_row[9].toString()));
        
        JOptionPane.showMessageDialog(this, "Patient Updated for selected record successfully");

        /*int row_selected = tablePerson.getSelectedRow();

        if (row_selected < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to update details.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tablePerson.getModel();
        Object[] selected_row = new Object[11];
        for (int i = 0; i < model.getColumnCount(); i++) {
            selected_row[i] = model.getValueAt(row_selected, i);

        }

        personDirectory.deletePerson(model.getValueAt(row_selected, 0).toString());
        selected_row[0] = txtName.getText();
        selected_row[1] = txtGender.getText();
        selected_row[2] = txtDate.getText();
        selected_row[3] = Integer.valueOf(txtPersonId.getText());
        selected_row[4] = txtAddress.getText();
        selected_row[5] = txtCity.getText();
        selected_row[6] = txtState.getText();
        selected_row[7] = Integer.valueOf(txtZip.getText());
        selected_row[8] = txtCommunity.getText();

        City city = new City(selected_row[5].toString());
        Community community = new Community(selected_row[8].toString());

        House house = new House(selected_row[4].toString(),city,selected_row[6].toString(),Integer.parseInt(selected_row[7].toString()),community);

        personDirectory.addPerson(selected_row[0].toString(),house,
            selected_row[1].toString(),
            selected_row[2].toString(),
            Integer.parseInt(selected_row[3].toString()));
        JOptionPane.showMessageDialog(this, "Employee Updated for selected record successfully");
        populateTable();*/
        populateTable();
    }//GEN-LAST:event_buttonAdd4ActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewPersonn4;
    private javax.swing.JButton buttonAdd4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
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

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        model.setRowCount(0);
        String c1="Allapur";
        City ci1=new City("Prayagraj");
        House h1=new House("sangam apartment",ci1,"UP",123423,c1);
        VitalSigns v1=new VitalSigns(100,150,70);
        Encounter e1=new Encounter(v1, new Date(), "fever");
        
        Patient p1=new Patient(":Ramesh", h1, "male", "08/15/1998", 123, e1, 1);
       patientDirectory.addPatients(p1);

       for(Patient patient : patientDirectory.getPatients()){
            
            Object[] data = new Object[10];
            data[0] = patient.getName();
            data[1] = patient.getGender();
            data[2] = patient.getDob();
            data[3] = patient.getId();
            data[4] = patient.getHouse().getAddress();
            data[5] = patient.getHouse().getCity().getCityName();
            data[6] = patient.getHouse().getState();
            data[7] = patient.getHouse().getPin();
            data[8] = patient.getHouse().getCommunity();
            data[9] = patient.getPatientId();
            
            model.addRow(data);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
}
