public class SwitchExpression {
    public static void main(String[] args) {
        // Ensure an argument is passed to avoid ArrayIndexOutOfBoundsException
        if (args.length == 0) {
            System.out.println("Please provide a day number (1-7) as a command line argument.");
            return;
        }

        int day = Integer.parseInt(args[0]);

        // Switch as an expression (returns a value)
        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day"; // Exhaustiveness is required for expressions
        };

        System.out.println(day + ": " + dayOfWeek);
    }
}