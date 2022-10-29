/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;

/**
 *
 * @author reeteshkesarwani
 */
public class Encounter {
    
    private VitalSigns vitalSign;
    private Date encDate;
    private String diagnosis;
    
    public Encounter( VitalSigns vitalSign,
            Date encDate, String diagnosis){

        this.vitalSign =vitalSign;
        this.encDate = encDate;
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Date getEncDate() {
        return encDate;
    }

    public void setEncDate(Date encDate) {
        this.encDate = encDate;
    }
}
