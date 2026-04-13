interface IPrint {
    void doPrint(String str);
}

public class InstanceMethodReference {
    // This is an instance method (no static keyword)
    void doubleStringPrint(String str) {
        System.out.println(str + " " + str);
    }

    static void printOperation(IPrint ref, String str) {
        ref.doPrint(str);
    }

    public static void main(String[] args) {
        InstanceMethodReference obj = new InstanceMethodReference();

        // Referencing instance methods of the System.out object
        printOperation(System.out::print, "Meerut ");
        printOperation(System.out::println, "New Delhi");

        // Referencing an instance method of our own object 'obj'
        printOperation(obj::doubleStringPrint, "Dehradun");
    }
}