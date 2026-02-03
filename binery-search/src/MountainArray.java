public class MountainArray {
    static void main(String[] args) {
        int[] arr = {1,24,34,55,66,77,53,23,21,12};
        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr){
      int start = 0;
      int end = arr.length -1;
      while (start < end){
          int mid = start + (end -start)/2;

          if(arr[mid + 1] < arr[mid]){
              end = mid;
          }else{
              start = mid + 1;
          }
      }
      return start;
    };
}
