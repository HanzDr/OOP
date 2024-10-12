/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidtermsDayTwoLecture;

import java.util.*;
import java.io.*;

public class Zoo {

   private String name, location;
   private ArrayList<Animal> ani;

    public Zoo() {
    }

    public Zoo(String name, String location, ArrayList<Animal> ani) {
        this.name = name;
        this.location = location;
        this.ani = ani;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Animal> getAni() {
        return ani;
    }

    public void setAni(ArrayList<Animal> ani) {
        this.ani = ani;
    }
    @Override
    public String toString(){
        return String.format("Name of the Zoo: %s %n Location: ",name, location, ani);
    }
    

}
        
