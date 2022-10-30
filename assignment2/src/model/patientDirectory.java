/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Patient;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author reeteshkesarwani
 */
public class PatientDirectory {
    private ArrayList<Patient> patients;
    
    public PatientDirectory() {
        patients = new ArrayList<>();
        addPatient();
    }
    public void addPatient() {
        Date resultdate = new Date();
        Patient p1 = new Patient("Raushan",new House("75Aplhonsus",new City("Boston"),"MA",021200,new Community("parker Street")),"Male","11/29/1997",1,new Encounter(new VitalSigns(10,20,30),resultdate,"Septicemia"),11);
        Patient p2 = new Patient("Gaurav",new House("75Aplhonsus",new City("Boston"),"MA",021200,new Community("Roxbury")),"Male","11/29/1997",2,new Encounter(new VitalSigns(11,21,31),resultdate,"Diabetes"),12);
        Patient p3 = new Patient("Rohit",new House("75Aplhonsus",new City("Boston"),"MA",021200,new Community("Boylston")),"Male","11/29/1997",3,new Encounter(new VitalSigns(12,22,32),resultdate,"Obesity"),13);
        addPatients(p1);
        addPatients(p2);
        addPatients(p3);
    }

    public void addPatients(Patient patient) {
        patients.add(patient);
    }
    public void addPatient(String name, House residence, String gender, String dob, int id, Encounter encounter, int patientId) {

        Patient patient = new Patient(name, residence, gender,dob,id,encounter,patientId);

        patients.add(patient);
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    public Patient getPatient(String name){
        
        for (Patient emp : patients) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public void deletePatient(String name){
        
        for (Patient emp : patients) {
 
            if (emp.getName() == name) {
                patients.remove(emp);
                break;
            }
            else if(emp.getPatientId() == Integer.parseInt(name)){
                patients.remove(emp);
                break;
            }
        }
    }
    
    public PatientDirectory idFilter(int eId) {

        PatientDirectory list = new PatientDirectory();
        for (Patient emp : patients) {
            if (emp.getPatientId() == eId) {
                list.addPatients(emp);
            }
        }
        return list;
    }
}
