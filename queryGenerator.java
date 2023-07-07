import java.util.Random;
import java.util.Scanner;

public class queryGenerator {


    public static String generateQuery(){
        String query = ""; //this is the return value
        boolean loop = true;
        Random rand = new Random(); //to generate student ID; 

        System.out.println("Welcome, what will you like to do?");
        System.out.println("press A to add something to the table\npress R to remove something from the table\npress Q to quit.");

        while (loop) {
            Scanner scnr = new Scanner(System.in); 
            String ans = scnr.next().toLowerCase(); 
            switch (ans) {
                case "a":
                    System.out.println("Generating ID for new student...");
                    int ident = rand.nextInt();
                    System.out.println("new student ID is: ");
                    
                    System.out.println("Done! would you like to do anything else? (press Q to quit).");
                    break;
                case "r":
                    System.out.println("enter the ID number of the student you wish to remove");
                    int iD = scnr.nextInt(); 
                    query.concat("DELETE FROM students WHERE id = " + iD);
                    System.out.println("Done! would you like to do anything else? (press Q to quit).");
                    break;
                case "q":
                    loop = false; //terminate the loop
                    System.out.println("See you later!");
                default:
                    System.out.println("invalid option, try again");
                    break;
            }
            

        }



        return query; 
    }


}
