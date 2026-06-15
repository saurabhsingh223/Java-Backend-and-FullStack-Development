class Home{
    int num = 5;
    public void method1(){
        System.out.println("Method 1");
    }
    public String method2(int n){
        if(n >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class BasicOOPs2 {
    public static void main(String[] args) {
        Home obj1 = new Home();
        Home obj2 = new Home();

        obj1.method1();
        obj1.num = 10;
        String str = obj2.method2(5 + obj1.num);
        System.out.println(str+obj2.num);

        // I just want to sya that the instance variable will always be different for
        //  each class, in the code you cansee that I have changes the instance variable 
        // num for Obj1, but for obj2 it is still same
    }
}
