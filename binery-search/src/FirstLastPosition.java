import java.util.Arrays;

public class FirstLastPosition {
    static void main(String[] args) {
        int[] arr = {1,2,4,6,6,7,7,7,7,8,9};
        int target = 10;
        System.out.println(Arrays.toString(findPosition(arr,target)));
    }

    static int[] findPosition(int[] arr, int target){
        int[] indexes = {-1,-1};
       indexes[0] = indexInArr(arr,target,true);
        indexes[1] = indexInArr(arr,target,false);

      return indexes;
    };

    static int indexInArr(int[] arr, int target,boolean isStartIndex){
        int positionIndex = -1;
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target> arr[mid]){
                start = mid + 1;
            } else if ( target < arr[mid]) {
                end = mid -1;
            }else{
                positionIndex = mid;
//                System.out.println("run " + positionIndex);
                if(isStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return  positionIndex;
    };
}
