/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidtermsDayTwoLecture;

import java.util.*;
import java.io.*;

public  class Crustacean extends Animal {

    private String species, biome;

    public Crustacean() {
        super();
    }

    public Crustacean(String name, int age, boolean isInvertebrae) {
        super(name, age, isInvertebrae);
    }

    public Crustacean(String species, String biome) {
        this.species = species;
        this.biome = biome;
    }

    public Crustacean(String species, String biome, String name, int age, boolean isInvertebrae) {
        super(name, age, isInvertebrae);
        this.species = species;
        this.biome = biome;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBiome() {
        return biome;
    }

    public void setBiome(String biome) {
        this.biome = biome;
    }
    
    @Override
    public void info(){
        System.out.printf("Name: %s %n Age: %d %n Type: %b %n Biome: %s ", getName(), getAge(), isIsInvertebrae()?  "Invertebrae" : "Vertebrae", biome);
    }
 

}
