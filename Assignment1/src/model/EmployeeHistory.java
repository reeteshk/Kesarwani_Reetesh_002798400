/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Reetesh kesarwani
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeHistory(){
        this.history=new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public void addNewEmployee(String name,int empId,int age,String gender,String startDate,
             int level,String teamInfo,String positionTitle,String phoneNumber,String email,String photo){
        Employee newEmployee=new Employee(name,empId,age,gender,startDate,
             level,teamInfo,positionTitle,phoneNumber,email,photo);
        history.add(newEmployee);
    }
    
    public void deleteEmpoyees(String name)
    {
        for(Employee em : history){
            if(em.getName() == name){
                history.remove(em);
                break;
            }
        }
    }
    
    public Employee getEmployee(String name)
    {
        for(Employee em : history){
            if(em.getName() == name){
                return em;
            }
        }
        return null;
    }
    
    public ArrayList<Employee> filterbyid(int id)
    {
        ArrayList<Employee> emps = new ArrayList<>();
        for(Employee em : history){
            if(em.getEmpId() == id){
                emps.add(em);
            }
        }
        return emps;
    }
    
    public ArrayList<Employee> filterbylevel(int level)
    {
        ArrayList<Employee> emps = new ArrayList<>();
        for(Employee em : history){
            if(em.getLevel() == level){
                emps.add(em);
            }
        }
        return emps;
    }
}
