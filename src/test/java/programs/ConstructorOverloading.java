package programs;

public class ConstructorOverloading {
    String name;

    ConstructorOverloading() {
        System.out.println("Constructor method called");
    }

    ConstructorOverloading(String t) {
        name = t;
    }

    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading();
        ConstructorOverloading j = new ConstructorOverloading("Java");
        c.setName("C++");
        j.getName();
        c.getName();
    }

    void setName(String t) {
        name = t;
    }

    void getName() {
        System.out.println("Name of the language: " + name);
    }
}
