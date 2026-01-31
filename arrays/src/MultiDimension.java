import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }


//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//            for (int j = 0; j <arr[i].length ; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }


        int[][] arr1 = {
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };

//        for (int i = 0; i < arr1.length ; i++) {
//            System.out.println(Arrays.toString(arr1[i]));
//        }

        for(int[] a: arr1){
            System.out.println(Arrays.toString(a));
        }

    }
}
