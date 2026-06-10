class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}
// Method Overloading ---> same method name, different parameter

class Calculator2{
    int num; // Instance variable
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double c){
        return a+c;
    }
}
 
public class BasicOOPs {
    public static void main(String [] args){
        
        Calculator calc = new Calculator();
        int result = calc.add(3, 5);
        System.out.println(result);
    }
}
