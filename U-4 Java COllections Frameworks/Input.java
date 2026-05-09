import java.util.Scanner; // 1. Import the class

class Input {
    public static void main(String[] args) {
        // 2. Create the Scanner object
        Scanner sc = new Scanner(System.in);

        // 3. Prompt the user
        System.out.print("Enter a number: ");

        // 4. Read the input into your variable
        int INPUT = sc.nextInt();

        // Display the result
        System.out.println("You entered: " + INPUT);

        // Recommended: Close the scanner when done
        sc.close();
    }
}
