import java.sql.*; 
import java.util.Scanner;

//we will assume the following table structure consisting of Students for this demo:

// +----+--------------+-----+---------------------+-------+-----+
// | ID |     Name     | Age |        Email        | Major | GPA |
// +----+--------------+-----+---------------------+-------+-----+
// |    |              |     |                     |       |     |
// +----+--------------+-----+---------------------+-------+-----+




public class accessor{

    /*
     * java database connection steps:
     *      1.) import java.sql
     *      2.) load and register the driver: com.mysql.jdbc.Driver
     *              - get the appropriate jar file from the internet 
     *              - add it to the referenced libraries
     *      3.) create a connection (Connection conn); conn is an object
     *      4.) create a statement (Statement stmt); stmt is an object
     *      5.) excecute the query (usually written in SQL)
     *      6.) process the results
     *      7.) close all open objects
     */


    public static void main(String[] args) {
        //initialize the database we want to target:

        String url = "";
        String userName = "";
        String passWord = "";
        
    }

}