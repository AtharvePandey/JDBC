import java.util.Random;
import java.util.Scanner;

public class queryGenerator {


    public static String generateQuery(){
        String query = ""; //this is the return value; should be refreshed after each time generateQuery is called...
        Random rand = new Random(); //to generate student ID; 

        // System.out.println("Welcome, what will you like to do?");
        // System.out.println("press A to add something to the table\npress R to remove something from the table\npress Q to quit.");   
            Scanner scnr = new Scanner(System.in); 
            String ans = scnr.next().toLowerCase(); 
            switch (ans) {
                case "a":
                    System.out.println("Generating ID for new student...");
                    int ident = rand.nextInt();
                    System.out.println("new student ID is: " + ident);
                    System.out.println("what is students name?");
                    String name = scnr.next(); 
                    System.out.println("what is their age? ");
                    int age = scnr.nextInt();
                    System.out.println("what is their email address? ");
                    String email = scnr.next();
                    System.out.println("what is their major? ");
                    String major = scnr.next();
                    System.out.println("what is their GPA? ");
                    double GPA = scnr.nextDouble(); 
                    // Constructing the INSERT query
                    query = "INSERT INTO students (id, name, age, email, major, GPA) VALUES ";
                    query += "(" + ident + ", '" + name + "', " + age + ", '" + email + "', '" + major + "', " + GPA + ")";
                    break;
                case "r":
                    System.out.println("enter the ID number of the student you wish to remove");
                    int iD = scnr.nextInt(); 
                    query.concat("DELETE FROM students WHERE id = " + iD);
                    break;
                case "q":
                    System.out.println("See you later!");
                    break;
                default:
                    System.out.println("invalid option, try again");
                    break;
            }   
        scnr.close();     
        return query; 
    }


}
