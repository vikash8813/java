public class Questions {
    static void main(String[] args) {
        int[] arr = {1,3,34,45,55,64,67,89,99};

        int target = 50;
        System.out.println(celeing(arr,target));

    }

    static int celeing(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        System.out.println(start);

        return start;
    }
}
