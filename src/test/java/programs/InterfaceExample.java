package programs;

interface Info {
    static final String language = "Java";

    public void display();
}

public class InterfaceExample implements Info {
    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.display();
    }

    //Defining method declared in interface
    public void display() {
        System.out.println(language + " is awesome");
    }

}
