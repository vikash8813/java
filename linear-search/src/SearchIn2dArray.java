import java.util.Arrays;

public class SearchIn2dArray {
    static void main(String[] args) {
        int[][] arr = {
                {23,2,4,22},
                {1,2,423},
                {34,566,43,235,22},
        };

//        System.out.println(Arrays.toString(search(arr,235)));
        System.out.println(max(arr));
    }


    static int[] search(int[][] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int maxValue = Integer.MIN_VALUE;
       for (int[] element: arr){
           for (int val: element){
               if(val > maxValue){
                   maxValue = val;
               }
           }
       }

        return maxValue;
    }
}
