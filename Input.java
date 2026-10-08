
//Employee data input
import java.io.*;

class Input {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Emp ID: ");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter Sex(M/F): ");
        char sex = (char) br.read();

        System.out.println("Enter Name: ");
        br.readLine(); // Consume the newline character left by previous
        String name = br.readLine();

        // Display the input data
        System.out.println("-".repeat(10) + "\nEmployee Details:");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Sex: " + sex);
        System.out.println("Employee Name: " + name);
    }
}