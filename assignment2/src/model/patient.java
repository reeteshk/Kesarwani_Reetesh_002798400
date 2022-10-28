/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author reeteshkesarwani
 */
public class patient extends person{
    
    public patient(String name, int age, long phoneNumber, String gender) {
        super(name, age, phoneNumber, gender);
    }
   private int  patientId;
   private int heartbeat;
   private doctor doctor;
    
}
