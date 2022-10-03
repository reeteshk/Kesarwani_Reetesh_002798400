/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Reetesh kesarwani
 */
public class Employee {
    
    private String name;
    private int empId;
    private int age;
    private String gender;
    private String startDate;
    private int level;
    private String teamInfo;
    private String positionTitle;
    private String phoneNumber;
    private String email;
    private String photo;
    
    public Employee(String name,int empId,int age,String gender,String startDate,
             int level,String teamInfo,String positionTitle,String phoneNumber,String email,String photo){
        
        this.name = name;
        this.empId = empId;
        this.age = age;
        this.gender = gender;
        this.startDate = startDate;
        this.level = level;
        this.teamInfo = teamInfo;
        this.positionTitle = positionTitle;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.photo = photo;
        
        
        
        
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

   

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
      public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
}
