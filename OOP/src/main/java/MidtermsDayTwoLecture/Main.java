package MidtermsDayTwoLecture;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int[] number = {1, 2, 3};
//        Scanner file = new Scanner(System.in);
//
////        int val = scan.nextInt();
////        System.out.println("Number: " + val);
//        try {
//            file = new Scanner(new FileReader("input.txt"));
//            System.out.print("Please enter a number: ");
//            int val = scan.nextInt();
//            System.out.println("Number: " + val);
//            System.out.println("Number in Array: " + number[val]);
//            
//            
//        } catch (InputMismatchException e) { //e is just a variable where the inputmismatchexception is stored
//            System.out.println("Wrong input!");
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            System.out.println("No such File!");
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Too big of a number");
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("Something went wrong!");
//            e.printStackTrace();
//        } finally {
//            System.out.println("You're done!");
//            file.close();
//            scan.close();
//        }
        String aname, zname, location, species, biome;
        int age, choice, choiceTwo, choicedom =0;
        boolean isVertebrae = true;
        ArrayList<Animal> animals = new ArrayList();
        boolean isDomesitacated = true;
        Zoo z = new Zoo();
        try {
            boolean runtime = true;
            while (runtime != false) {
                System.out.println("Please enter the zoo name: ");
                zname = scan.next();
                System.out.println("Please enter the location: ");
                location = scan.next();
                System.out.println("Please enter animal name: ");
                aname = scan.next();
                System.out.println("Please enter the age of the animel: ");
                age = scan.nextInt();
                System.out.println("Please enter (1)invertebrae or (2)vertebrae");
                choice = scan.nextInt();
                if (choice == 1) {
                    isVertebrae = false;
                }

                if (choice == 2) {
                    isVertebrae = true;
                }
                System.out.println("Please enter (1)Mammal or (2)Crustacean: ");
                choiceTwo = scan.nextInt();
                if (choiceTwo == 1){
                    System.out.println("Please enter the species: ");
                    species = scan.next();
                    System.out.println("Please enter (1)Domesticated or (2)Non-Domesticated");
                    if(choicedom == 1)
                        isDomesitacated = true;
                    if(choicedom == 2)
                        isDomesitacated =false;
                    animals.add(new Mammal(species, isDomesitacated, aname,age,isVertebrae ));
                    z.getAni().add(animals.get(animals.size()-1));
                }
                if(choiceTwo == 2){
                    System.out.println("Please enter the species: ");
                    species = scan.next();
                    System.out.println("Please enter the biome: ");
                    biome = scan.next();
                    animals.add(new Crustacean(species, biome, aname, age,isVertebrae) {});
                    z.getAni().add(animals.get(animals.size()-1));
                }
                
               
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
