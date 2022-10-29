/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author reeteshkesarwani
 */
public class Doctor extends Person {
    private int docId;
    
    public Doctor(String name, House residence, String gender, String dob, int id, int docId) {
        super(name, residence, gender, dob, id);
        
        this.docId = docId;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }
    
}
