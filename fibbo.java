// Java program to print Fibonacci series up to n terms
import java.io.*;
class fibbo{
    public static void main(String args[]) throws IOException{
        // Create a BufferedReader to read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of terms for Fibonacci series: ");
        // Read the number of terms from the user
        int n = Integer.parseInt(br.readLine());
        // Initialize the first two terms of the Fibonacci series
        int a=0, b=1, c;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        // Loop to calculate and print the remaining terms of the Fibonacci series
        for(int i=2; i<n; i++){
            c = a + b;
            System.out.print(c + " ");
            // Update the values of a and b for the next iteration
            a = b;
            b = c;
        }
    }
}