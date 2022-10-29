/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author reeteshkesarwani
 */
public class Patient extends Person {
     
    private Encounter encounter;
    private int patientId;
    
    public Patient(String name, House residence, String gender, String dob, int id, Encounter encounter, int patientId) {
        super(name, residence, gender, dob, id);
        
        this.encounter = encounter;
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
        
        /*this.encounterHistory = new EncounterHistory();
        this.encounterHistory.addEncounter(encounter);
    }
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory enchHistory) {
        this.encounterHistory = enchHistory;
    }*/

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
}
