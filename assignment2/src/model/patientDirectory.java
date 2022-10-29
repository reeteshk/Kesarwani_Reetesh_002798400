/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.patient;
import java.util.ArrayList;
/**
 *
 * @author reeteshkesarwani
 */
public class patientDirectory {
     private ArrayList<patient> history;

    public patientDirectory() {
        this.history = new ArrayList<person>();
    }

    public ArrayList<person> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<person> history) {
        this.history = history;
    }
    
    public void addNewPatient(String name, int age, long phoneNumber, String gender,int patientId, int heartbeat, int temprature, String disease){
         Patient p=new Patient(name,age,phoneNumber,gender,patientId,heartbeat,temprature,disease)
        history.add(person);
    }
    
    public person getPerson(String name)
    {
        for(person p:history)
        {
            if(p.getName() == name)
            {
                return p;
            }
        }
        return null;
    }
    
    public void deletePerson(String name)
    {
        for(person p:history)
        {
            if(p.getName() == name)
            {
                history.remove(p);
                break;
            }
        }
    }
}
