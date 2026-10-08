// Accepting Differnet Types of Input from User in a Single line

import java.io.*;
import java.util.*;

/**
 * different
 */
public class different {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Emp ID, Sex(M/F), Name (comma separated): ");
        try {
            String input = br.readLine();
            // Sue StringTokenizer to split the input string by comma
            StringTokenizer st = new StringTokenizer(input, ",");

            // Extract the tokens and trim any leading/trailing whitespace
            String idStr = st.nextToken().trim();
            String sexStr = st.nextToken().trim();
            String name = st.nextToken().trim();
            
            // Convert the ID and Sex to appropriate types
            int id = Integer.parseInt(idStr);
            char sex = sexStr.charAt(0);


            // Display the input data
            System.out.println("-".repeat(10) + "\nEmployee Details:");
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Sex: " + sex);
            System.out.println("Employee Name: " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}