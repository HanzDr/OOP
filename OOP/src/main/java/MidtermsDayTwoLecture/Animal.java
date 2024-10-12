/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidtermsDayTwoLecture;

/**
 *
 * @author lbpsantos
 */
public abstract class Animal {
    private String name;
    private int age;
    private boolean isInvertebrae;

    public Animal() {
    }

    public Animal(String name, int age, boolean isInvertebrae) {
        this.name = name;
        this.age = age;
        this.isInvertebrae = isInvertebrae;
    }

    public boolean isIsInvertebrae() {
        return isInvertebrae;
    }

    public void setIsInvertebrae(boolean isInvertebrae) {
        this.isInvertebrae = isInvertebrae;
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
    
     abstract void info();
}
