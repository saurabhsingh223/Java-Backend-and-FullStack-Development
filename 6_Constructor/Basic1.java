class Home {

    // Instance Variables
    private int age;
    private String name;

    // Default Constructor
    public Home() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Home(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Parameterized Constructor Called");
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to display object details
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class Basic1 {

    public static void main(String[] args) {

        // Object created using Default Constructor
        Home obj1 = new Home();
        obj1.setName("Saurabh");
        obj1.setAge(24);

        System.out.println("\nObject 1 Details:");
        obj1.display();

        // Object created using Parameterized Constructor
        Home obj2 = new Home(20, "Rahul");

        System.out.println("\nObject 2 Details:");
        obj2.display();
    }
}