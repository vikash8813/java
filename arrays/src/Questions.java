import java.util.Arrays;

public class Questions {
    static void main(String[] args) {
        int[] arr = {1,2,440,66};

//        swap(arr,0,3);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] givenArr, int index1, int index2){
        int first = givenArr[index1];
        givenArr[index1] = givenArr[index2];
        givenArr[index2] = first;
    }

    static int max(int[] givenArr){
     int maxVal = givenArr[0];
        for (int i = 1; i <givenArr.length ; i++) {
            if(givenArr[i] > maxVal){
                maxVal = givenArr[i];
            }
        }

        return  maxVal;
    }

    static void reverse(int[] givenArr){
        int start = 0;
        int end = givenArr.length - 1;

        while (start < end){
            int firstNum = givenArr[start];
            givenArr[start] = givenArr[end];
            givenArr[end] = firstNum;
            start++;
            end--;
        }
    }


}
