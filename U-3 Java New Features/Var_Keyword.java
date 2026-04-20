class LVTI {
    // var attr = 10; // ERROR: 'var' is not allowed as a field (instance/static variable)

    static {
        var str = "Hello LVTI"; // Allowed in static blocks
        System.out.println(str);
    }

    int add(int a, int b) {
        var result = a + b; // Allowed in local method scope
        return result;
    }

    /* var subtract(int a, int b) { // ERROR: 'var' not allowed as return type
        return a - b; 
    } 
    */

    /* int multiply(var a, var b) { // ERROR: 'var' not allowed in method parameters
        return a * b; 
    } 
    */
}

public class Var_Keyword {
    public static void main(String args[]) {
        var obj = new LVTI();

        // --- Array Limitations ---
        // var[] varStrs = {"IIT,Delhi", "IIT, Roorkee"}; // ERROR: 'var' cannot be part of array syntax
        
        var varStrs = new String[4]; // Valid: type inferred as String[]
        varStrs[0] = "Delhi";
        varStrs[1] = "Roorkee";
        varStrs[2] = "Madras";
        varStrs[3] = "Varanasi";

        // var strs = {"A", "B"}; // ERROR: Array initializers need an explicit target type
        String[] strs = {"IIT, Delhi", "IIT, Roorkee", "IIT, Madras", "IIT (BHU), Varanasi"};

        // --- Loops ---
        System.out.println("Enhanced for-loop:");
        for (var str : varStrs) {
            System.out.println(str);
        }

        System.out.println("\nStandard for-loop:");
        for (var i = 0; i < 4; i++) {
            System.out.println(strs[i]);
        }

        var result = obj.add(34, 56);
        System.out.println("\nResult = " + result);

        // --- Invalid Initializations ---
        // var myVar; // ERROR: Cannot use 'var' without an immediate initializer
        // var myVar = null; // ERROR: Cannot infer type from 'null'
    }
}