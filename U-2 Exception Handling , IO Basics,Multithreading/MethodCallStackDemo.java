// enter manually value while executing  like:
// java MethodCallStackDemo 2


public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        int divisor = Integer.parseInt(args[0]);
        methodA(divisor);
        System.out.println("Exit main()");
    }

    public static void methodA(int divisor) {
        System.out.println("Enter methodA()");
        methodB(divisor);
        System.out.println("Exit methodA()");
    }

    public static void methodB(int divisor) {
        System.out.println("Enter methodB()");
        methodC(divisor);
        System.out.println("Exit methodB()");
    }

    public static void methodC(int divisor) {
        System.out.println("Enter methodC()");
        methodD(divisor);
        System.out.println("Exit methodC()");
    }

    public static void methodD(int divisor) {
        System.out.println("Enter methodD()");
        int num = 20, result = 0;
        result = num / divisor;
        System.out.println("20/" + divisor + " = " + result);
        System.out.println("Exit methodD()");
    }
}