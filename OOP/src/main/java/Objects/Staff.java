/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author lbpsantos
 */
public class Staff extends Person {

    private String empID;
    private boolean teaching;

    public Staff() {
    }

    public Staff(String empID, boolean teaching) {
        this.empID = empID;
        this.teaching = teaching;

    }

    public Staff(String name, int age, boolean isStudent) {
        super(name, age, isStudent);
    }

    public Staff(String empID, boolean teaching, String name, int age, boolean isStudent) {
        super(name, age, isStudent);
        this.empID = empID;
        this.teaching = teaching;

    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public boolean isTeaching() {
        return teaching;
    }

    public void setTeaching(boolean teaching) {
        this.teaching = teaching;
    }

    @Override
    public void greetings() {
        System.out.println("Hello " + getName() + ", " + getAge() + ". With an employee Id:  " + getEmpID() + ",a " + (isTeaching()? "Teaching Staff": "Non-Teaching Staff)"));
    }
}
