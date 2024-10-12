/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //instance of a class(Scanner) and the object is the (scan) and the instance(new Scanner(System.in)
//        ArrayList<Person> peeps = new ArrayList();
//        ArrayList<Student> studs = new ArrayList();
//       
//        
//        studs.add(new Student("4315", "BSCE", 2, "Isabelle", 21, true));
//        
//        peeps.add(new Person("Alejandro", 32, false));
//        peeps.add(new Person("Samantha", 20, true));
//        peeps.add(new Person("Jonathan", 27, false));
//        peeps.add(new Person("Johannah", 21, true));
//       
//        System.out.println(Person.noPerson);
//        System.out.println(peeps.get(0));
//        System.out.println(studs.get(0));

//5:50 class

        ArrayList<Person> people = new ArrayList();
     
//
////        students.add(new Student("0001", "CS", 24, "Alejandro", 22, true));
////        students.get(0).greetings();
//        Person person;
//        String name = scan.next();
//        int age = scan.nextInt();
//        
//        System.out.println("Student 1 - Staff 2");
//        String x = scan.next();
//        
        int userinput, yearLevel, age, TeachingOrNah;
        String name, course, studId, empId;
        boolean StudentOrStaff;
        boolean TeachingOrNonTeaching = true;
       

        for (int i = 0; i < 5; i++) {
            System.out.println("Please Enter (1)Student or (2)Staff");
            userinput = scan.nextInt();
            if(userinput ==1){
                System.out.println("Please enter your name: ");
                name = scan.next();
                System.out.println("Please enter your age: ");
                age = scan.nextInt();
                System.out.println("Please enter course: ");
                course = scan.next();
                System.out.println("Please enter your year level: ");
                yearLevel = scan.nextInt();
                System.out.println("Please enter your School Identificaiton Number:");
                studId = scan.next();
                StudentOrStaff = true;
                people.add(new Student (studId, course,yearLevel, name, age,StudentOrStaff));
            }
            if(userinput == 2){
               System.out.println("Please enter your name: ");
                name = scan.next();
                System.out.println("Please enter your age: ");
                age = scan.nextInt();
                System.out.println("Please enter Staff Id: ");
                empId = scan.next();
                System.out.println("Are you a (1)Teaching or (2) Non-Teaching Staff?");
                TeachingOrNah = scan.nextInt();
                    if(TeachingOrNah == 1){
                        TeachingOrNonTeaching = true;
                    }
                    if(TeachingOrNah == 2){
                        TeachingOrNonTeaching = false;
                    }
                    StudentOrStaff = false;
               people.add(new Staff (empId,TeachingOrNonTeaching, name, age,StudentOrStaff  ));
            }
            
            for(Person x: people){
                x.greetings();
            }
        }

    }
}
