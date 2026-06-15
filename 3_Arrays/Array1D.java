import java.util.Arrays;

public class Array1D {
    public static void main(String[] args) {
        int [] arr = new int[5];
        for(int i = 0; i<5; i++){
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
    }
}
