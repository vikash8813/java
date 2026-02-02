public class InfiniteArray {
    static void main(String[] args) {
        int[] arr = {1,2,33,43,54,66,76,78,87,99};
        int target = 87;
        System.out.println(findIndex(arr,target));
    }

    static int findIndex(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end;
            end = end + (end - start + 1) *2;
            start = temp + 1;
        }
//        System.out.println(start);
//        System.out.println(end);
        int index = binarySearch(arr,target,start,end);
        return index;
    }

    static int binarySearch(int[] arr, int target,int start, int end){
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
//        System.out.println(start);

        return -1;
    }
}
