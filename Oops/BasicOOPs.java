class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}
 
public class BasicOOPs {
    public static void main(String [] args){
        
        Calculator calc = new Calculator();
        int result = calc.add(3, 5);
        System.out.println(result);
    }
}
