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
public class PersonDirectory {
    
     private ArrayList<Person> persons;

    public PersonDirectory() {
        persons = new ArrayList<>();
       //addPersons();
    }
    
    /*public void addPersons() {
        Person p1 = new Person("Deepak",new House("75Aplhonsus",new City("Prayagraj"),"UP",211006),"Male","11/29/1998",1);
        Person p2 = new Person("Rishabh",new House("75Aplhonsus",new City("Varanasi"),"UP",287391),"Male","08/29/1997",2);
        Person p3 = new Person("Himanshu",new House("75Aplhonsus",new City("Delhi"),"Delhi",125324),"Male","03/29/1997",3);
        Person p4 = new Person("Raunak",new House("75Aplhonsus",new City("Vellore"),"TamilNadu",847234),"Male","03/29/1997",4);
        addPerson(p1);
        addPerson(p2);
        addPerson(p3);
        addPerson(p4);

        /*City c1 = new City("Boston", "MA", "USA");
        City c2 = new City("New York", "NY", "USA");
        City c3 = new City("Pune", "MH", "India");
        City c4 = new City("Mumbai", "MH", "India");
        City c5 = new City("San Francisco", "CA", "USA");
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        cities.add(c4);
        cities.add(c5);

        Community co1 = new Community("Roxbury", cities.get(0));
        Community co2 = new Community("New Jersey", cities.get(1));
        Community co3 = new Community("Kothrud", cities.get(2));
        Community co4 = new Community("Andheri", cities.get(3));
        communities.add(co1);
        communities.add(co2);
        communities.add(co3);
        communities.add(co4)
    }*/
    
    public void addPerson(Person person){
        persons.add(person);
    }
    public void addPerson(String name, House residence, String gender, String dob, int id) {

        Person person = new Person(name, residence, gender,dob,id);

        persons.add(person);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    public Person getPerson(String name){
        
        for (Person emp : persons) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    
    public void deletePerson(String name){
        
        for (Person emp : persons) {
 
            if (emp.getName() == name) {
                persons.remove(emp);
                break;
            }
            else if(emp.getId() == Integer.parseInt(name)){
                persons.remove(emp);
                break;
            }
        }
    }
    
    public PersonDirectory idFilter(int eId) {

        PersonDirectory list = new PersonDirectory();
        for (Person emp : persons) {
            if (emp.getId() == eId) {
                list.addPerson(emp);
            }
        }
        return list;
    }
    
    /*public void deletePerson(int id){
        
        for (Person emp : persons) {
 
            if (emp.getId() == id) {
                persons.remove(emp);
                break;
            }
        }
    }*/
}
