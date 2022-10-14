/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package casestudy;

/**
 * 
 * @author Daniel Bermeo
 */
public class Department {

    String name;
    private Employee[] employeeList = new Employee[10];
    int nextIndex = 0;
    
    public Department(String name){
        this.name = name;
    }
    
    public void addEmployee(Employee employee){
        if(nextIndex<10){
            employeeList[nextIndex] = employee;
            nextIndex++; 
        }else{
            System.out.println("The deepartment is full");
        }
        
    }
    
    public Employee[] getEmployeeList(){
        
        Employee[] actualList = new Employee[nextIndex];
        
        for(int cont=0; cont<nextIndex ; cont++){
            actualList[cont] = employeeList[cont];
        }
        
        return actualList;
        
    }
    
    public int getNumeberOfEmployees(){
        return nextIndex;
    }
    
    public Employee getEmployee(int id){
        Employee employee = null; 
        for(Employee e: getEmployeeList()){
            if(e.getId()==id){
                employee = e; 
            }
        }
        return employee;
    }
    
    public double totalDepartmentSalary(){
        double totalSalary = 0;
        for(Employee e: getEmployeeList()){
            totalSalary += e.getSalary();   
        }
        return totalSalary;
    }
    
    public double averageDepartmentSalary(){
        return totalDepartmentSalary()/nextIndex;
    }

    @Override
    public String toString() {
        return "Department: " + name + "\nActual Number employes: " + getNumeberOfEmployees();
    }
    
    
}
