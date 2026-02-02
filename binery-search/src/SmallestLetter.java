public class SmallestLetter {
    static void main(String[] args) {
        char[] arr = {'a','d','e','j'};

        char target = 'b';
        System.out.println(smallLetter(arr,target));
    }

    static char smallLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length -1;

        while (start <=end){

            int mid = start + (end -start )/2;
            if(target > arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
            if(start == arr.length){
                return arr[0];
            }
        }
        return  arr[start];
    }
}
