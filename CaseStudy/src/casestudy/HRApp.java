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
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the program!!");
        Department home = new Department("home");
        
        System.out.println(home);
        
        home.addEmployee(new Employee(1, "Jimy", 102.56));
        home.addEmployee(new Employee(5, "Karol", 520.551));
        home.addEmployee(new Employee(11, "Solivan", 15156.56));
        home.addEmployee(new Employee(582, "Mike", 142.56));
        home.addEmployee(new Employee(52, "George", 12.56));
        
        System.out.println("Search to Employe id 582:");
        System.out.println(home.getEmployee(582));
        
        Employee[] totalEmployees = home.getEmployeeList();
        System.out.println("\nAll of employees in the department " + home);
        for(Employee e : totalEmployees){
            System.out.println(e);
        }
        
        System.out.println("\nThe total Salary of this department is : " + home.totalDepartmentSalary());
        
        System.out.println("\nThe average salary of this department is: " + home.averageDepartmentSalary());
    }
    
}
