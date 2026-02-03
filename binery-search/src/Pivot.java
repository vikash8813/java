public class Pivot {
    static void main(String[] args) {
        int[] arr = {36,46,56,66,66,77,0,1,2,12,12,22,24,25,25};

        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start)/2;
//            System.out.println(mid);
            if(arr[mid + 1] < arr[mid] && arr[mid] > arr[mid -1]){
                return mid;
            }else {
                if(arr[start] < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid;
                }
            }
        }
        return -1;
    }
}
