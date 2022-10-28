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
public class personDirectory {
    private ArrayList<person> history;

    public personDirectory() {
        this.history = new ArrayList<person>();
    }

    public ArrayList<person> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<person> history) {
        this.history = history;
    }
    
    public void addNewPerson(String name, int age, long phoneNumber, String gender){
        person person=new person(name,age,phoneNumber,gender);
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
