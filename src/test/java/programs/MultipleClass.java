package programs;

public class MultipleClass {
    MultipleClass() {
        System.out.println("Constructor of Multiple class.");
    }

    void computer_method() {
        System.out.println("Power gone! Shut down your PC soon...");
    }

    public static void main(String[] args) {
        MultipleClass my = new MultipleClass();
        my.computer_method();
        Laptop your = new Laptop();
        your.laptop_method();
    }
}

class Laptop {
    Laptop() {
        System.out.println("Constructor of Laptop class.");
    }

    void laptop_method() {
        System.out.println("99% Battery available.");
    }
}
