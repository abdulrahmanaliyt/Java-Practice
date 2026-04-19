import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 1. Define the Type Annotation
@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME) // Added so we can inspect it if needed
@interface TypeAnno {
    String appliedOn();
}

// 2. Define the missing GenAnno for the method declaration
@Target(ElementType.METHOD)
@interface GenAnno {
    String value();
}

class MyClass {
    // Applied to the type of the field (int)
    @TypeAnno(appliedOn = "Type of a field") 
    int attr;

    // Applied to the type of the parameter
    public MyClass(@TypeAnno(appliedOn = "Type of a parameter") int attr) {
        this.attr = attr;
    }

    // Applied to the return type specifically
    @GenAnno("Method")
    public @TypeAnno(appliedOn = "Return Type") int getAttr() {
        return attr;
    }
}

public class TypeAnnotation {
    public static void main(String[] args) throws 
        @TypeAnno(appliedOn = "throws clause") IllegalAccessException {
        
        // Applied during object creation (new)
        MyClass obj = new @TypeAnno(appliedOn = "Object Creation") MyClass(45);
        
        System.out.println("Attribute value: " + obj.getAttr());
    }
}