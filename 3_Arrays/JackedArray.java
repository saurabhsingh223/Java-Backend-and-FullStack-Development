// Jacked array is a multidemnsional array in which Row size is fixed but colum size is not fixed, 
// it is different for every column

public class JackedArray {
    public static void main(String[] args) {
        int [][] arr = new int [3][];
        arr[0] = new int [2];
        arr[1] = new int [4];
        arr[2] = new int [2];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = (int) (Math.random()*10);
            }
        }

        for(int i[]:arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
