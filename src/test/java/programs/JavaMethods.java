package programs;

public class JavaMethods {

    //Constructor method
    JavaMethods() {
        System.out.println("Constructor method is called when an object of its class is created");
    }

    //Main method where program execution begins
    public static void main(String[] args) {
        staticMethod();
        JavaMethods object = new JavaMethods();
        object.nonStaticMethod();
    }

    //Static method
    static void staticMethod() {
        System.out.println("Static method can be called without creating object");
    }

    //NonStatic method
    void nonStaticMethod() {
        System.out.println("NonStatic method must be called by creating an object");
    }

    //Static block is executed before main method
    static {
        System.out.println("Static block is executed before main method");
    }

}
