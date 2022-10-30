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
    
   private String community;
    private ArrayList<House> house;
    
    public Community(){
        house = new ArrayList<>();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public ArrayList<House> getHouse() {
        return house;
    }
    public void addHouse(House h ){
        house.add(h);
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }
    
    
}
