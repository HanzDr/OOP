/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidtermsDayTwoLecture;

import java.util.*;
import java.io.*;

public class Mammal extends Animal {

    private String species;
    private boolean isDomesticated;

    public Mammal() {
        super();
    }

    public Mammal(String name, int age, boolean isInvertebrae) {
        super(name, age, isInvertebrae);
    }

    public Mammal(String species, boolean isDomesticated) {
        this.species = species;
        this.isDomesticated = isDomesticated;
    }

    public Mammal(String species, boolean isDomesticated, String name, int age, boolean isInvertebrae) {
        super(name, age, isInvertebrae);
        this.species = species;
        this.isDomesticated = isDomesticated;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isIsDomesticated() {
        return isDomesticated;
    }

    public void setIsDomesticated(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    @Override
    public void info() {
        System.out.printf("Name: %s  %n"
                        + "Age: %d %n"
                        + "Species: %s  %n"
                        + "Type:  ", getName(), getAge(), species,isIsDomesticated()? "Domesticated": "Not Domesticated" );
    }

}
