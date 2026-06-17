/*  Encapsulation is an OOP principle in which data and methods are bundled 
 into a single class and direct access to the data is restricted using access
  modifiers like private. 
Access is provided through public methods such as getters and setters. */


// Code Explaintaion
/*
 * Encapsulation Example:
 * The Personal class bundles data (name, age) and methods
 * (getters and setters) into a single unit.
 * Instead of accessing variables directly, public methods
 * are used to set and retrieve values, providing controlled access.
 *
 * Note: For proper encapsulation, 'name' and 'age' should be
 * declared as private.
 */

class Personal{
    String name;
    int age;

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}


public class Basic1 {
public static void main(String[] args) {
    Personal p1 = new Personal();
    p1.setName("Saurabh");
    p1.setAge(23);
    System.out.println(p1.getName()+", "+p1.getAge());
}    
}
