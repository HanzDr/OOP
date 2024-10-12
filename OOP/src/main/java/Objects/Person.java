/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

public abstract class Person {

    String name;
    int age;
    boolean isStudent;
    static int noPerson;

    public Person() {
        noPerson++;
    }

    public Person(String name, int age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
         noPerson++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsStudent() {
        return isStudent;
    }

    public void setIsStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    public static int getNoPerson() {
        return noPerson;
    }

    public static void setNoPerson(int noPerson) {
        Person.noPerson = noPerson;
    }
    

    @Override //
    public String toString() {
        return name + " " + age + " " + (isStudent ? "Student" : "Staff");
    }
    
    abstract public void greetings();
    
}
