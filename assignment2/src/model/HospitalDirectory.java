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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitals;

    public HospitalDirectory() {
        hospitals = new ArrayList<>();
    }

    public void addHospital(Hospital hospital){
        hospitals.add(hospital);
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    public Hospital getHospitals(String name){
        
        for (Hospital emp : hospitals) {
 
            if (emp.getHospitalName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public HospitalDirectory commHosFilter(String name) {

        HospitalDirectory list = new HospitalDirectory();
        for (Hospital emp : hospitals) {
            if (emp.getCommunity().equals(name)) {
                list.addHospital(emp);
            }
        }
        return list;
    }
    public void deleteHospital(String name){
        
        for (Hospital emp : hospitals) {
 
            if (emp.getHospitalName()== name) {
                hospitals.remove(emp);
                break;
            }
        }
    }
}
