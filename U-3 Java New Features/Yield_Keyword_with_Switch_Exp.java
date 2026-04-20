public class Yield_Keyword_with_Switch_Exp {
    public static void main(String[] args) {
        // Robust check for command line arguments
        if (args.length == 0) {
            System.out.println("Usage: java SwitchExpYieldDemo <day_number>");
            return;
        }

        int day = Integer.parseInt(args[0]);

        // Using yield to return values from a multi-line block
        String dayOfWeek = switch (day) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("We have five days working!");
                yield "Working day."; // Returns value for these cases
            }
            case 6, 7 -> {
                System.out.println("We have off on two days in a week!");
                yield "Off day.";    // Returns value for these cases
            }
            default -> {
                yield "Invalid Day"; // yield can be used in default too
            }
        };

        System.out.println("Day " + day + " status: " + dayOfWeek);
    }
}