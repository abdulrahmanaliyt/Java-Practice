public class Throws_keyword {
    public static void method() throws IllegalAccessException {
        System.out.println("Start");
        throw new IllegalAccessException("Illegal Access !");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (IllegalAccessException iae) {
            System.out.println(iae.getMessage());
        }
    }
}