/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author reeteshkesarwani
 */
public class DoctorDirectory {
     private ArrayList<Doctor> doctors;

    public DoctorDirectory() {
        doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void addDoctor(String name, House residence, String gender, String dob, int id, int patientId) {

        Doctor doctor = new Doctor(name, residence, gender,dob,id,patientId);

        doctors.add(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    public Doctor getDoctor(String name){
        
        for (Doctor emp : doctors) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public void deleteDoctor(String name){
        
        for (Doctor emp : doctors) {
 
            if (emp.getName()== (name)) {
                doctors.remove(emp);
                break;
            }
            else if(emp.getName()== (name)){
                doctors.remove(emp);
                break;
            }
        }
    }
    
    public DoctorDirectory idFilter(String comm) {

        DoctorDirectory list = new DoctorDirectory();
        for (Doctor emp : doctors) {
            if (emp.getHouse().getCommunity().equals(comm)) {
                list.addDoctor(emp);
            }
        }
        return list;
    }
}
