/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author reeteshkesarwani
 */
public class Hospital {
    

    private String hospitalName;
    private String community;
    //private ArrayList<Community> community;

    public Hospital(String hospitalName, String community ){
        this.hospitalName = hospitalName;
        this.community = community;
    }

    /*public ArrayList<Community> getCommunity() {
        return community;
    }

    public void setCommunity(ArrayList<Community> community) {
        this.community = community;
    }*/

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
}
