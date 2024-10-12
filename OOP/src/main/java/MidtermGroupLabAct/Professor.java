/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidtermGroupLabAct;

/**
 *
 * @author Don
 */
public class Professor extends Person {
   
    private String employeeID;     // Unique identifier for the professor
    private String department;      // Department where the professor works
    private String title;           // Academic title (e.g., Assistant Professor, Professor)

    public Professor(String employeeID, String department, String title, String name, int age, String gender, String address, String phoneNumber) {
        super(name, age, gender, address, phoneNumber);
        
        this.employeeID = employeeID;
        this.department = department;
        this.title = title;
    }
    
}