/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidtermGroupLabAct;

/**
 *
 * @author Don
 */
public class Student extends Person {

    private String studentID;     // Unique identifier for the student
    private String major;          // Major or field of study
    private int year;              // Year of study (e.g., Freshman, Sophomore)

    public Student(String studentID, String major, int year, String name, int age, String gender, String address, String phoneNumber) {
        super(name, age, gender, address, phoneNumber);
        this.studentID = studentID;
        this.major = major;
        this.year = year;
    }

}
