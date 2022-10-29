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
public class Community {
    
    private ArrayList<House> houses;
    
    public Community(){
        houses = new ArrayList<>();
    }
    public void addHouse(House h ){
        houses.add(h);
    }

    public ArrayList<House> getHouse() {
        return houses;
    }
    public House getHouses(String name){
        
        for (House house : houses) {
 
            if (house.getCommunity() == name) {
                return house;
            }
        }
        return null;
    }

    public void setHouse(ArrayList<House> houses) {
        this.houses = houses;
    }
    
    public Community commFilter(String name) {

        Community list = new Community();
        for (House house : houses) {
            if (house.getCommunity().equals(name)) {
                list.addHouse(house);
            }
        }
        return list;
    }
    public void deleteHouse(String name){
        
        for (House emp : houses) {
 
            if (emp.getCommunity() == name) {
                houses.remove(emp);
                break;
            }
        }
    }
    
}
