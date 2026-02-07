import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {2,3,5,6,4,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int maxIndex = findMaxIndex(arr,0,arr.length - i - 1);
            swapNumbers(arr,maxIndex,arr.length - i -1);
        }
    }

    static int findMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swapNumbers(int[] arr, int start,int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;

    }
}
