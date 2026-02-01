public class Main {
    static void main(String[] args) {
        int[] arr = {1,3,33,5,353,534,2323};
//        System.out.println(linearSearch(arr,5));
//        System.out.println(linearSearchRanger(arr,2323,1,4));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearchRanger(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <end ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}