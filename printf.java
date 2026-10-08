//To understand the printf() method in Java, we need to know that it is used to format and print data to the console. The printf() method is part of the PrintStream class and allows us to specify a format string that defines how the output should be displayed.

class printf{
    public static void main(String args[]){
        // Using printf() to format and print data
        int id = 101;
        char sex = 'M';
        String name = "John Doe";
        
        // Print the employee details using printf()
        System.out.printf("Employee ID: %d\n", id);
        System.out.printf("Employee Sex: %c\n", sex);
        System.out.printf("Employee Name: %s\n", name);
    }
}