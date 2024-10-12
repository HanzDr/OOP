/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author lbpsantos
 */
public class Student extends Person {

    private String studID;
    private String program;
    private int yearLevel;

    public Student() {
    }

    public Student(String name, int age, boolean isStudent) {
        super(name, age, isStudent);
    }

    public Student(String studID, String program, int yearLevel) {
        this.studID = studID;
        this.program = program;
        this.yearLevel = yearLevel;
    }

    public Student(String studID, String program, int yearLevel, String name, int age, boolean isStudent) {
        super(name, age, isStudent);
        this.studID = studID;
        this.program = program;
        this.yearLevel = yearLevel;
    }

    public String getStudID() {
        return studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    @Override
    public void greetings() {
        System.out.println("Hello I'm " + getName() + ", " + getAge() + ". Under the course " + getProgram());
    }

}
