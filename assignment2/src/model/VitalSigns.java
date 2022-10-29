/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author reeteshkesarwani
 */
public class VitalSigns {
    private int temp;
    private int bloodPressure;
    private int pulseRate;

    public VitalSigns(int temp,
            int bloodPressure,
            int pulseRate) {

        this.temp = temp;
        this.bloodPressure = bloodPressure;
        this.pulseRate = pulseRate;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }
    
}
