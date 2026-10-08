//Read different data types from keyboard using scanner class seprated by space 
import java.util.Scanner;
class ScannerClass{
    public static void main(String args[]) throws Exception{

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Emp ID, Sex(M/F), Name (space separated): ");
        // Read the input values from the user
        int id = sc.nextInt();
        char sex = sc.next().charAt(0);
        String name = sc.next();

        // Display the input data
        System.out.println("-".repeat(10) + "\nEmployee Details:");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Sex: " + sex);
        System.out.println("Employee Name: " + name);
    }
}